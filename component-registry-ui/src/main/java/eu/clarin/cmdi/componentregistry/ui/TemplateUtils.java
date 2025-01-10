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

import java.util.function.Predicate;
import java.util.regex.Pattern;

/**
 *
 * @author twagoo
 */
public class TemplateUtils {

    /**
     *
     *
     * ID and NAME tokens must begin with a letter ([A-Za-z]) and may be
     * followed by any number of letters, digits ([0-9]), hyphens ("-"),
     * underscores ("_"), colons (":"), and periods (".").
     *
     */
    public final static Pattern UNSAFE_ID_CHARACTER = Pattern.compile("[#:\\.\\?\\[\\]\\s]");
    public final static Predicate<String> STARTS_WITH_ALPHA = Pattern.compile("^\\s*[A-z].*$").asMatchPredicate();
    public static final String ALPHA_PREFIX = "a_";

    public final static String makeIdSafe(String value) {
        if (value == null) {
            return "";
        } else if (!STARTS_WITH_ALPHA.test(value)) {
            return makeIdSafe(ALPHA_PREFIX + value.trim());
        } else {
            return UNSAFE_ID_CHARACTER.matcher(value.trim()).replaceAll("---");
        }
    }

}
