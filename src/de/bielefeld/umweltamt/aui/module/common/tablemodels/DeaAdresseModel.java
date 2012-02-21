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
package de.bielefeld.umweltamt.aui.module.common.tablemodels;

import de.bielefeld.umweltamt.aui.utils.tablemodelbase.ListTableModel;
import de.bielefeld.umweltamt.aui.mappings.tipi.DeaAdresse;
import de.bielefeld.umweltamt.aui.utils.AuikLogger;


public class DeaAdresseModel extends ListTableModel {
    /** Logging */
    private static final AuikLogger logger = AuikLogger.getLogger();


    public DeaAdresseModel() {
        super(new String[]{
                "Name1",
                "Name2",
                "Strasse",
                "Hausnr.",
                "PLZ",
                "Ort",
                "Staatskennung"
        },
        false);
    }

    /* (non-Javadoc)
     * @see de.bielefeld.umweltamt.aui.utils.tablemodelbase.ListTableModel#getColumnValue(java.lang.Object, int)
     */
    public Object getColumnValue(Object objectAtRow, int columnIndex) {
        if(objectAtRow == null) {
            return "error";
        }
        DeaAdresse fd = (DeaAdresse) objectAtRow;
        Object tmp;

        switch (columnIndex) {
        case 0:
            tmp = fd.getName1();
            break;
        case 1:
            tmp = fd.getName2();
            break;
        case 2:
            tmp = fd.getStrasse();
            break;
        case 3:
            tmp = fd.getHausnr();
            break;
        case 4:
            tmp = fd.getPlz();
            break;
        case 5:
            tmp = fd.getOrt();
            break;
        case 6:
            tmp = fd.getStaatskennung();
            break;

        default:
            tmp = "ERROR";
            break;
        }
        return tmp;
    }

    /*
     * Leer, da kein Updaten der Liste nötig/möglich.
     */
    public void updateList() {
    }
}
