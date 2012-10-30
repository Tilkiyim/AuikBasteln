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

import de.bielefeld.umweltamt.aui.mappings.StupidHelperClassWhichWillBeGoneSoon;

/**
 * A class that represents a row in the VAWS_WASSEREINZUGSGEBIETE table. You can
 * customize the behavior of this class by editing the class,
 * {@link VawsWassereinzugsgebiete}.
 */
public abstract class AbstractVawsWassereinzugsgebiete extends
StupidHelperClassWhichWillBeGoneSoon implements Serializable {
    private static final long serialVersionUID = -5345912252188652465L;

    /**
     * The cached hash code value for this instance. Setting to 0 triggers
     * re-calculation.
     */
    private int hashValue = 0;

    /** The composite primary key value. */
    private java.lang.Integer wasserezgbid;

    /** The value of the simple ezgbname property. */
    private java.lang.String ezgbname;

    /**
     * Simple constructor of AbstractVawsWassereinzugsgebiete instances.
     */
    public AbstractVawsWassereinzugsgebiete() {
    }

    /**
     * Constructor of AbstractVawsWassereinzugsgebiete instances given a simple
     * primary key.
     * @param wasserezgbid
     */
    public AbstractVawsWassereinzugsgebiete(java.lang.Integer wasserezgbid) {
        this.setWasserezgbid(wasserezgbid);
    }

    /**
     * Return the simple primary key value that identifies this object.
     * @return java.lang.Integer
     */
    public java.lang.Integer getWasserezgbid() {
        return wasserezgbid;
    }

    /**
     * Set the simple primary key value that identifies this object.
     * @param wasserezgbid
     */
    public void setWasserezgbid(java.lang.Integer wasserezgbid) {
        this.hashValue = 0;
        this.wasserezgbid = wasserezgbid;
    }

    /**
     * Return the value of the EZGBNAME column.
     * @return java.lang.String
     */
    public java.lang.String getEzgbname() {
        return this.ezgbname;
    }

    /**
     * Set the value of the EZGBNAME column.
     * @param ezgbname
     */
    public void setEzgbname(java.lang.String ezgbname) {
        this.ezgbname = ezgbname;
    }

    /**
     * Implementation of the equals comparison on the basis of equality of the
     * primary key values.
     * @param rhs
     * @return boolean
     */
    @Override
    public boolean equals(Object rhs) {
        if (rhs == null)
            return false;
        if (!(rhs instanceof VawsWassereinzugsgebiete))
            return false;
        VawsWassereinzugsgebiete that = (VawsWassereinzugsgebiete) rhs;
        if (this.getWasserezgbid() != null && that.getWasserezgbid() != null) {
            if (!this.getWasserezgbid().equals(that.getWasserezgbid())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Implementation of the hashCode method conforming to the Bloch pattern
     * with the exception of array properties (these are very unlikely primary
     * key types).
     * @return int
     */
    @Override
    public int hashCode() {
        if (this.hashValue == 0) {
            int result = 17;
            int wasserezgbidValue = this.getWasserezgbid() == null ? 0 : this
                .getWasserezgbid().hashCode();
            result = result * 37 + wasserezgbidValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }
}
