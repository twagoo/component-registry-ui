/*
 * Copyright (C) 2025 CLARIN ERIC
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package eu.clarin.cmdi.componentregistry.ui.service;

import com.google.common.collect.ImmutableList;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ItemType;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 *
 * @author twagoo
 */
public class VocabItemsCsvConvertersTest {

    private final List<ItemType> items = ImmutableList.of(new ItemType() {
        {
            setValue("item1");
            setAppInfo("description 1");
            setConceptLink("https://concepts.clarin.eu/item1");
        }
    }, new ItemType() {
        {
            setValue("item2");
            //no description
            setConceptLink("https://concepts.clarin.eu/item2");
        }
    }, new ItemType() {
        {
            setValue("item3");
            setAppInfo("description,3");
            //no concept link
        }
    }, new ItemType() {
        {
            setValue("item4");
            //no description
            //no concept link
        }
    });

    @Test
    public void testCsvToItems() {
        final String csv = """
                               item1,description 1,https://concepts.clarin.eu/item1
                               "item2","",https://concepts.clarin.eu/item2
                               item3,"description,3",
                               item4,
                               """;

        final VocabItemsCsvConverters.ToItemListConverter instance = new VocabItemsCsvConverters.ToItemListConverter();;
        final List<ItemType> result = instance.convert(csv);
        assertThat(result).isNotNull();
        assertThat(result).hasSize(4);

        assertThat(result).as("Values read correctly")
                .extracting(ItemType::getValue)
                .containsExactly("item1", "item2", "item3", "item4");

        assertThat(result).as("Descriptions read correctly")
                .extracting(ItemType::getAppInfo)
                .containsExactly("description 1", null, "description,3", null);

        assertThat(result).as("Concept links read correctly")
                .extracting(ItemType::getConceptLink)
                .containsExactly("https://concepts.clarin.eu/item1", "https://concepts.clarin.eu/item2", null, null);
    }

    @Test
    public void testCsvToItemsIllegal() {
        //illegal CSV, one row misses value
        final String csv = """
                               item1,description 1,https://concepts.clarin.eu/item1
                               ,description 2,https://concepts.clarin.eu/item2
                               """;
        final VocabItemsCsvConverters.ToItemListConverter instance = new VocabItemsCsvConverters.ToItemListConverter();;
        final IllegalArgumentException error = assertThrows(IllegalArgumentException.class, () -> instance.convert(csv));
        assertThat(error).as("Missing value should throw error").isNotNull();
    }

    @Test
    public void testItemsToCsv() {
        final VocabItemsCsvConverters.ToCsvConverter instance = new VocabItemsCsvConverters.ToCsvConverter();;
        final String result = instance.convert(items);
        assertThat(result).isNotNull();
        assertThat(result).contains("item1", "item2", "item3", "item4");
        final String[] lines = result.split("\n");
        assertThat(lines).hasSize(4);
        assertThat(lines).satisfiesExactly(
                line1 -> assertThat(line1)
                        .matches("^[^,]*,[^,]*,[^,]*$")
                        .containsSubsequence("item1", "description 1", "https://concepts.clarin.eu/item1"),
                line2 -> assertThat(line2)
                        .matches("^[^,]*,[^,]*,[^,]*$")
                        .containsSubsequence("item2", "https://concepts.clarin.eu/item2"),
                line3 -> assertThat(line3)
                        .matches("^[^,]*,\"[^,]*,[^,]*\",[^,]*$")
                        .containsSubsequence("item3", "description,3"),
                line4 -> assertThat(line4)
                        .matches("^[^,]*,[^,]*,[^,]*$")
                        .containsSubsequence("item4")
        );
    }

}
