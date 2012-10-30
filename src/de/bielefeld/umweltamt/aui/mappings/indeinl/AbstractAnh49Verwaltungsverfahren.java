/**
 * Copyright 2005-2042, Stadt Bielefeld
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
 * A class that represents a row in the ANH_49_VERWALTUNGSVERF table. You can
 * customize the behavior of this class by editing the class, {@link
 * Anh49Verwaltungsverfahren()}.<br>
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration. <br>
 * <br>
 * Well, not really. I just copied this from a generated class and modified it!
 * @author <a href="mailto:Conny.Pearce@bielefeld.de">Conny Pearce (u633z)</a>
 */
public abstract class AbstractAnh49Verwaltungsverfahren extends
    StupidHelperClassWhichWillBeGoneSoon implements Serializable {
    private static final long serialVersionUID = 6965756804975056383L;

    /**
     * The cached hash code value for this instance. Setting to 0 triggers
     * re-calculation.
     */
    private int hashValue = 0;

    /** The composite primary key value. */
    private java.lang.Integer verwaltungsverfahrenID;

    /** The value of the anh49Fachdaten association. */
    private Anh49Fachdaten anh49Fachdaten;

    /** The value of the simple datum property. */
    private java.util.Date datum;

    /** The value of the simple massnahme property. */
    private java.lang.String massnahme;

    /** The value of the simple sachbearbeiterIn property. */
    private java.lang.String sachbearbeiterIn;

    /** The value of the simple wiedervorlage property. */
    private java.util.Date wiedervorlage;

    /** The value of the simple abgeschlossen property. */
    private java.lang.Boolean abgeschlossen;

    /** Simple constructor of AbstractAnh49Analysen instances. */
    public AbstractAnh49Verwaltungsverfahren() {
        // This place is intentionally left blank.
    }

    /**
     * Constructor of AbstractAnh49Verwaltungsverfahren instances given a simple
     * primary key.
     * @param verwaltungsverfahrenID
     */
    public AbstractAnh49Verwaltungsverfahren(
        java.lang.Integer verwaltungsverfahrenID) {
        this.setVerwaltungsverfahrenID(verwaltungsverfahrenID);
    }

    /**
     * Return the simple primary key value that identifies this object.
     * @return java.lang.Integer
     */
    public java.lang.Integer getVerwaltungsverfahrenID() {
        return this.verwaltungsverfahrenID;
    }

    /**
     * Set the simple primary key value that identifies this object.
     * @param verwaltungsverfahrenID
     */
    public void setVerwaltungsverfahrenID(
        java.lang.Integer verwaltungsverfahrenID) {
        this.hashValue = 0;
        this.verwaltungsverfahrenID = verwaltungsverfahrenID;
    }

    /**
     * Return the value of the ANH49ID column.
     * @return Anh49Fachdaten
     */
    public Anh49Fachdaten getAnh49Fachdaten() {
        return this.anh49Fachdaten;
    }

    /**
     * Set the value of the ANH49ID column.
     * @param anh49Fachdaten
     */
    public void setAnh49Fachdaten(Anh49Fachdaten anh49Fachdaten) {
        this.anh49Fachdaten = anh49Fachdaten;
    }

    /**
     * Return the value of the DATUM column.
     * @return java.util.Date
     */
    public java.util.Date getDatum() {
        return this.datum;
    }

    /**
     * Set the value of the DATUM column.
     * @param datum
     */
    public void setDatum(java.util.Date datum) {
        this.datum = datum;
    }

    /**
     * Return the value of the MASSNAHME column.
     * @return java.lang.String
     */
    public java.lang.String getMassnahme() {
        return this.massnahme;
    }

    /**
     * Set the value of the MASSNAHME column.
     * @param massnahme
     */
    public void setMassnahme(java.lang.String massnahme) {
        this.massnahme = massnahme;
    }

    /**
     * Return the value of the SACHBEARBEITER column.
     * @return java.lang.String
     */
    public java.lang.String getSachbearbeiterIn() {
        return this.sachbearbeiterIn;
    }

    /**
     * Set the value of the SACHBEARBEITER column.
     * @param sachbearbeiterIn
     */
    public void setSachbearbeiterIn(java.lang.String sachbearbeiterIn) {
        this.sachbearbeiterIn = sachbearbeiterIn;
    }

    /**
     * Return the value of the WIEDERVORLAGE column.
     * @return java.util.Date
     */
    public java.util.Date getWiedervorlage() {
        return this.wiedervorlage;
    }

    /**
     * Set the value of the WIEDERVORLAGE column.
     * @param wiedervorlage
     */
    public void setWiedervorlage(java.util.Date wiedervorlage) {
        this.wiedervorlage = wiedervorlage;
    }

    /**
     * Return the value of the ABGESCHLOSSEN column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isAbgeschlossen() {
        return this.abgeschlossen;
    }

    /**
     * Set the value of the ABGESCHLOSSEN column.
     * @param abgeschlossen
     */
    public void setAbgeschlossen(java.lang.Boolean abgeschlossen) {
        this.abgeschlossen = abgeschlossen;
    }

    /**
     * Implementation of the equals comparison on the basis of equality of the
     * primary key values. TODO: Why the hell is this in the abstract class?
     * @param rhs
     * @return boolean
     */
    @Override
    public boolean equals(Object rhs) {
        if (rhs == null)
            return false;
        if (!(rhs instanceof Anh49Verwaltungsverfahren))
            return false;
        Anh49Verwaltungsverfahren that = (Anh49Verwaltungsverfahren) rhs;
        if (this.getVerwaltungsverfahrenID() != null
            && that.getVerwaltungsverfahrenID() != null) {
            if (!this.getVerwaltungsverfahrenID().equals(
                that.getVerwaltungsverfahrenID())) {
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
            int verwaltungsverfahrenIDValue = (this.getVerwaltungsverfahrenID() == null) ? 0
                : this.getVerwaltungsverfahrenID().hashCode();
            result = result * 37 + verwaltungsverfahrenIDValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }
}
