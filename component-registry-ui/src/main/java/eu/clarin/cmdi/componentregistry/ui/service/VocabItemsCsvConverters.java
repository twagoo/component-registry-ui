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

import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import eu.clarin.cmdi.componentregistry.openapi.client.model.ItemType;
import java.io.IOException;
import java.io.StringReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

/**
 *
 * @author twagoo
 */
@Slf4j
public class VocabItemsCsvConverters {

    public final static CSVFormat CSV_FORMAT = CSVFormat.RFC4180.builder().get();

    @Service
    public static class ToItemListConverter implements Converter<String, List<ItemType>> {

        @Override
        public List<ItemType> convert(String source) {
            try {
                final CSVParser parser = CSV_FORMAT.parse(new StringReader(source));
                return parser.stream()
                        .map(ToItemListConverter::toItem)
                        .toList();
            } catch (IOException ex) {
                log.warn("Failed to parse", ex);
                return Collections.emptyList();
            }
        }

        /**
         * Read from CSV.
         *
         * Assumed structure: value,description,concept link
         *
         * @param record to process
         * @return item from record
         */
        private static ItemType toItem(CSVRecord record) throws IllegalArgumentException {

            final ItemType item = new ItemType();
            if (record.isSet(0) && !Strings.isNullOrEmpty(record.get(0))) {
                item.setValue(record.get(0));
            } else {
                throw new IllegalArgumentException("No value set in row " + record.getRecordNumber());
            }

            if (record.isSet(1)) {
                final String description = record.get(1);
                if (!Strings.isNullOrEmpty(description)) {
                    item.setAppInfo(record.get(1));
                }
            }
            if (record.isSet(2)) {
                final String conceptLink = record.get(2);
                if (!Strings.isNullOrEmpty(conceptLink)) {
                    item.setConceptLink(conceptLink);
                }
            }
            return item;
        }
    }

    @Service
    public static class ToCsvConverter implements Converter<List<ItemType>, String> {

        private final static Joiner JOINER = Joiner.on("\n");

        @Override
        public String convert(List<ItemType> source) {
            final Stream<String> items = source.stream().map(item -> {

                return CSV_FORMAT.format(item.getValue(), item.getAppInfo(), item.getConceptLink());
            });

            return JOINER.join(items.iterator());
        }

    }

}
