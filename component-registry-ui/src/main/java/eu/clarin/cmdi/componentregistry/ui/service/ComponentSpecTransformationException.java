/*
 * Copyright (C) 2024 CLARIN ERIC
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

/**
 *
 * @author twagoo
 */
public class ComponentSpecTransformationException extends Exception {

    public ComponentSpecTransformationException() {
    }

    public ComponentSpecTransformationException(String message) {
        super(message);
    }

    public ComponentSpecTransformationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ComponentSpecTransformationException(Throwable cause) {
        super(cause);
    }

    public ComponentSpecTransformationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
