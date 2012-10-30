/**
 * Copyright 2005-2011, Stadt Bielefeld
 *
 * This file is part of AUIK (Anlagen- und Indirekteinleiter-Kataster).
 *
 * AUIK is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 2 of the License, or (at your
 * option) any later version.
 *
 * AUIK is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public
 * License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with AUIK. If not, see <http://www.gnu.org/licenses/>.
 *
 * AUIK has been developed by Stadt Bielefeld and Intevation GmbH.
 */

package de.bielefeld.umweltamt.aui.mappings.vaws;

import java.io.Serializable;

import de.bielefeld.umweltamt.aui.mappings.DatabaseAccess;

/**
 * A class that represents a row in the 'VAWS_VERWMASSNAHMEN' table. This class
 * may be customized as it is never re-generated after being created.
 */
public class VawsVerwmassnahmen extends AbstractVawsVerwmassnahmen implements
    Serializable {
    private static final long serialVersionUID = 7079486544923831272L;

    /**
     * Simple constructor of VawsVerwmassnahmen instances.
     */
    public VawsVerwmassnahmen() {
    }

    /* Add customized code below */

    /**
     * Liefert alle Massnahmen für die Verwaltungsverfahren.
     * @return Ein Array mit den Namen aller möglichen Massnahmen.
     */
    public static String[] getAllMassnahmen() {
        return (String[]) new DatabaseAccess()
            .createQuery(
                "SELECT vwm.massnahmen "
                + "FROM VawsVerwmassnahmen vwm "
                + "ORDER BY vwm.massnahmen")
            .setCacheable(true)
            .setCacheRegion("vawsvwmliste")
            .array(new String[0]);
    }
}
