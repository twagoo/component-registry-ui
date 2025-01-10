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
package eu.clarin.cmdi.componentregistry.ui;

import static eu.clarin.cmdi.componentregistry.ui.TemplateUtils.makeIdSafe;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

/**
 *
 * @author twagoo
 */
public class TemplateUtilsTest {
    /**
     * Test of makeIdSafe method, of class TemplateUtils.
     */
    @Test
    public void testMakeIdSafeAlreadySafe() {
        assertThat(makeIdSafe("abc"))
                .as("alphanumeric input should not change")
                .isEqualTo("abc");
        assertThat(makeIdSafe("abc123"))
                .as("alphanumeric input should not change")
                .isEqualTo("abc123");
        assertThat(makeIdSafe("abc-123"))
                .as("alphanumeric input should not change")
                .isEqualTo("abc-123");
        assertThat(makeIdSafe(" abc123 "))
                .as("input should be trimmed")
                .isEqualTo("abc123");
    }

    @Test
    public void testMakeIdSafeNonAlphaStart() {
        assertThat(makeIdSafe("9abc"))
                .as("if first character non-alpha must get prefixed")
                .isEqualTo("a_9abc");
    }

    @Test
    public void testMakeIdSafeReplaceIllegalCharacters() {
        assertThat(makeIdSafe("a.b.c."))
                .as("illegal characters must be replaced")
                .isEqualTo("a---b---c---");
        assertThat(makeIdSafe("a#b#c#"))
                .as("illegal characters must be replaced")
                .isEqualTo("a---b---c---");
        assertThat(makeIdSafe("a:b:c:"))
                .as("illegal characters must be replaced")
                .isEqualTo("a---b---c---");
        assertThat(makeIdSafe("a?b?c?"))
                .as("illegal characters must be replaced")
                .isEqualTo("a---b---c---");
        assertThat(makeIdSafe("a[b]c["))
                .as("illegal characters must be replaced")
                .isEqualTo("a---b---c---");
        assertThat(makeIdSafe(" a b c "))
                .as("illegal characters must be replaced and leading and trailing whitespace trimmed")
                .isEqualTo("a---b---c");
    }

    @Test
    public void testMakeIdSafeReplaceIllegalCharactersNonAlphaStart() {
        assertThat(makeIdSafe("#abc"))
                .as("illegal characters must be replaced, non-alpha starting character must get prefixed")
                .isEqualTo("a_---abc");
        assertThat(makeIdSafe(".abc"))
                .as("illegal characters must be replaced, non-alpha starting character must get prefixed")
                .isEqualTo("a_---abc");
    }

}
