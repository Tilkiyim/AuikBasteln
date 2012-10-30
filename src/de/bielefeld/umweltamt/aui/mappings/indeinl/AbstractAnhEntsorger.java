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

package de.bielefeld.umweltamt.aui.mappings.indeinl;

import java.io.Serializable;

import de.bielefeld.umweltamt.aui.mappings.StupidHelperClassWhichWillBeGoneSoon;

/**
 * A class that represents a row in the ANH_50_ENTSORGER table. You can
 * customize the behavior of this class by editing the class,
 * {@link AnhEntsorger}.
 */
public abstract class AbstractAnhEntsorger extends
StupidHelperClassWhichWillBeGoneSoon implements Serializable {
    private static final long serialVersionUID = 3361173097408989463L;

    /**
     * The cached hash code value for this instance. Settting to 0 triggers
     * re-calculation.
     */
    private int hashValue = 0;

    /** The composite primary key value. */
    private java.lang.Integer entsorgerid;

    /** The value of the simple entsorger property. */
    private java.lang.String entsorger;

    /** The value of the simple strasse property. */
    private java.lang.String strasse;

    /** The value of the simple hausnr property. */
    private java.lang.Integer hausnr;

    /** The value of the simple plz property. */
    private java.lang.String plz;

    /** The value of the simple ort property. */
    private java.lang.String ort;

    /** The value of the simple ansprechpartner property. */
    private java.lang.String ansprechpartner;

    /** The value of the simple telefon property. */
    private java.lang.String telefon;

    /**
     * Simple constructor of AbstractAnh50Entsorger instances.
     */
    public AbstractAnhEntsorger() {
    }

    /**
     * Constructor of AbstractAnh50Entsorger instances given a simple primary
     * key.
     * @param entsorgerid
     */
    public AbstractAnhEntsorger(java.lang.Integer entsorgerid) {
        this.setEntsorgerid(entsorgerid);
    }

    /**
     * Return the simple primary key value that identifies this object.
     * @return java.lang.Integer
     */
    public java.lang.Integer getEntsorgerid() {
        return entsorgerid;
    }

    /**
     * Set the simple primary key value that identifies this object.
     * @param entsorgerid
     */
    public void setEntsorgerid(java.lang.Integer entsorgerid) {
        this.hashValue = 0;
        this.entsorgerid = entsorgerid;
    }

    /**
     * Return the value of the ENTSORGER column.
     * @return java.lang.String
     */
    public java.lang.String getEntsorger() {
        return this.entsorger;
    }

    /**
     * Set the value of the ENTSORGER column.
     * @param entsorger
     */
    public void setEntsorger(java.lang.String entsorger) {
        this.entsorger = entsorger;
    }

    /**
     * Return the value of the STRASSE column.
     * @return java.lang.String
     */
    public java.lang.String getStrasse() {
        return this.strasse;
    }

    /**
     * Set the value of the STRASSE column.
     * @param strasse
     */
    public void setStrasse(java.lang.String strasse) {
        this.strasse = strasse;
    }

    /**
     * Return the value of the HAUSNR column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getHausnr() {
        return this.hausnr;
    }

    /**
     * Set the value of the HAUSNR column.
     * @param hausnr
     */
    public void setHausnr(java.lang.Integer hausnr) {
        this.hausnr = hausnr;
    }

    /**
     * Return the value of the PLZ column.
     * @return java.lang.String
     */
    public java.lang.String getPlz() {
        return this.plz;
    }

    /**
     * Set the value of the PLZ column.
     * @param plz
     */
    public void setPlz(java.lang.String plz) {
        this.plz = plz;
    }

    /**
     * Return the value of the ORT column.
     * @return java.lang.String
     */
    public java.lang.String getOrt() {
        return this.ort;
    }

    /**
     * Set the value of the ORT column.
     * @param ort
     */
    public void setOrt(java.lang.String ort) {
        this.ort = ort;
    }

    /**
     * Return the value of the ANSPRECHPARTNER column.
     * @return java.lang.String
     */
    public java.lang.String getAnsprechpartner() {
        return this.ansprechpartner;
    }

    /**
     * Set the value of the ANSPRECHPARTNER column.
     * @param ansprechpartner
     */
    public void setAnsprechpartner(java.lang.String ansprechpartner) {
        this.ansprechpartner = ansprechpartner;
    }

    /**
     * Return the value of the TELEFON column.
     * @return java.lang.String
     */
    public java.lang.String getTelefon() {
        return this.telefon;
    }

    /**
     * Set the value of the TELEFON column.
     * @param telefon
     */
    public void setTelefon(java.lang.String telefon) {
        this.telefon = telefon;
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
        if (!(rhs instanceof AnhEntsorger))
            return false;
        AnhEntsorger that = (AnhEntsorger) rhs;
        if (this.getEntsorgerid() != null && that.getEntsorgerid() != null) {
            if (!this.getEntsorgerid().equals(that.getEntsorgerid())) {
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
            int entsorgeridValue = this.getEntsorgerid() == null ? 0 : this
                .getEntsorgerid().hashCode();
            result = result * 37 + entsorgeridValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }
}
