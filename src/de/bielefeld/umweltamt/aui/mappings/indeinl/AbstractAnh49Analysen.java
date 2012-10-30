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

;

/**
 * A class that represents a row in the ANH_49_ANALYSEN table. You can customize
 * the behavior of this class by editing the class, {@link Anh49Analysen()}.
 */
public abstract class AbstractAnh49Analysen extends
    StupidHelperClassWhichWillBeGoneSoon implements Serializable {
    private static final long serialVersionUID = 8031636263522077374L;

    /**
     * The cached hash code value for this instance. Setting to 0 triggers
     * re-calculation.
     */
    private int hashValue = 0;

    /** The composite primary key value. */
    private java.lang.Integer analysenid;

    /** The value of the anh49Fachdaten association. */
    private Anh49Fachdaten anh49Fachdaten;

    /** The value of the simple analysenAnh49Id property. */
//    private java.lang.Integer Anh49Id;

    /** The value of the simple datum property. */
    private java.util.Date datum;

    /** The value of the simple institut property. */
    private java.lang.String institut;

    /** The value of the simple csbWert property. */
    private java.lang.String csbWert;

    /** The value of the simple csbGrenzwert property. */
    private java.lang.String csbGrenzwert;

    /** The value of the simple aoxWert property. */
    private java.lang.String aoxWert;

    /** The value of the simple aoxGrenzwert property. */
    private java.lang.String aoxGrenzwert;

    /** The value of the simple kwWert property. */
    private java.lang.String kwWert;

    /** The value of the simple kwGrenzwert property. */
    private java.lang.String kwGrenzwert;

    /** The value of the simple zinkWert property. */
    private java.lang.String zinkWert;

    /** The value of the simple zinkGrenzwert property. */
    private java.lang.String zinkGrenzwert;

    /** The value of the simple bsb5Wert property. */
    private java.lang.String bsb5Wert;

    /** The value of the simple bsb5CsbRelation property. */
    private java.lang.String bsb5CsbRelation;

    /** The value of the simple bemerkungen property. */
    private java.lang.String bemerkungen;

    /** The value of the simple bikGrenzwert property. */
    private java.lang.String bikGrenzwert;

    /** The value of the simple bikWert property. */
    private java.lang.String bikWert;

    /** The value of the simple phWert property. */
    private java.lang.String phWert;

    /** The value of the simple phGrenzwert property. */
    private java.lang.String phGrenzwert;

    /**
     * Simple constructor of AbstractAnh49Analysen instances.
     */
    public AbstractAnh49Analysen() {
    }

    /**
     * Constructor of AbstractAnh49Analysen instances given a simple primary
     * key.
     * @param analysenid
     */
    public AbstractAnh49Analysen(java.lang.Integer analysenid) {
        this.setAnalysenid(analysenid);
    }

    /**
     * Return the simple primary key value that identifies this object.
     * @return java.lang.Integer
     */
    public java.lang.Integer getAnalysenid() {
        return analysenid;
    }

    /**
     * Set the simple primary key value that identifies this object.
     * @param analysenid
     */
    public void setAnalysenid(java.lang.Integer analysenid) {
        this.hashValue = 0;
        this.analysenid = analysenid;
    }

    /**
     * Return the value of the ANH49ID column.
     * @return Anh49Fachdaten
     */
    public Anh49Fachdaten getAnh49Fachdaten() {
        return this.anh49Fachdaten;
    }

    /*public BasisObjekt getBasisObjekt()
    {
        return this.basisObjekt;
    }*/

    /**
     * Set the value of the ANH49ID column.
     * @param anh49Fachdaten
     */
    public void setAnh49Fachdaten(Anh49Fachdaten anh49Fachdaten) {
        this.anh49Fachdaten = anh49Fachdaten;
    }

    /*public void setBasisObjekt(BasisObjekt basisObjekt)
    {
        this.basisObjekt = basisObjekt;
    }*/

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
     * Return the value of the INSTITUT column.
     * @return java.lang.String
     */
    public java.lang.String getInstitut() {
        return this.institut;
    }

    /**
     * Set the value of the INSTITUT column.
     * @param institut
     */
    public void setInstitut(java.lang.String institut) {
        this.institut = institut;
    }

    /**
     * Return the value of the CSB_WERT column.
     * @return java.lang.String
     */
    public java.lang.String getCsbWert() {
        return this.csbWert;
    }

    /**
     * Set the value of the CSB_WERT column.
     * @param csbWert
     */
    public void setCsbWert(java.lang.String csbWert) {
        this.csbWert = csbWert;
    }

    /**
     * Return the value of the CSB_GRENZWERT column.
     * @return java.lang.String
     */
    public java.lang.String getCsbGrenzwert() {
        return this.csbGrenzwert;
    }

    /**
     * Set the value of the CSB_GRENZWERT column.
     * @param csbGrenzwert
     */
    public void setCsbGrenzwert(java.lang.String csbGrenzwert) {
        this.csbGrenzwert = csbGrenzwert;
    }

    /**
     * Return the value of the AOX_WERT column.
     * @return java.lang.String
     */
    public java.lang.String getAoxWert() {
        return this.aoxWert;
    }

    /**
     * Set the value of the AOX_WERT column.
     * @param aoxWert
     */
    public void setAoxWert(java.lang.String aoxWert) {
        this.aoxWert = aoxWert;
    }

    /**
     * Return the value of the AOX_GRENZWERT column.
     * @return java.lang.String
     */
    public java.lang.String getAoxGrenzwert() {
        return this.aoxGrenzwert;
    }

    /**
     * Set the value of the AOX_GRENZWERT column.
     * @param aoxGrenzwert
     */
    public void setAoxGrenzwert(java.lang.String aoxGrenzwert) {
        this.aoxGrenzwert = aoxGrenzwert;
    }

    /**
     * Return the value of the KW_WERT column.
     * @return java.lang.String
     */
    public java.lang.String getKwWert() {
        return this.kwWert;
    }

    /**
     * Set the value of the KW_WERT column.
     * @param kwWert
     */
    public void setKwWert(java.lang.String kwWert) {
        this.kwWert = kwWert;
    }

    /**
     * Return the value of the KW_GRENZWERT column.
     * @return java.lang.String
     */
    public java.lang.String getKwGrenzwert() {
        return this.kwGrenzwert;
    }

    /**
     * Set the value of the KW_GRENZWERT column.
     * @param kwGrenzwert
     */
    public void setKwGrenzwert(java.lang.String kwGrenzwert) {
        this.kwGrenzwert = kwGrenzwert;
    }

    /**
     * Return the value of the ZINK_WERT column.
     * @return java.lang.String
     */
    public java.lang.String getZinkWert() {
        return this.zinkWert;
    }

    /**
     * Set the value of the ZINK_WERT column.
     * @param zinkWert
     */
    public void setZinkWert(java.lang.String zinkWert) {
        this.zinkWert = zinkWert;
    }

    /**
     * Return the value of the ZINK_GRENZWERT column.
     * @return java.lang.String
     */
    public java.lang.String getZinkGrenzwert() {
        return this.zinkGrenzwert;
    }

    /**
     * Set the value of the ZINK_GRENZWERT column.
     * @param zinkGrenzwert
     */
    public void setZinkGrenzwert(java.lang.String zinkGrenzwert) {
        this.zinkGrenzwert = zinkGrenzwert;
    }

    /**
     * Return the value of the BSB5_WERT column.
     * @return java.lang.String
     */
    public java.lang.String getBsb5Wert() {
        return this.bsb5Wert;
    }

    /**
     * Set the value of the BSB5_WERT column.
     * @param bsb5Wert
     */
    public void setBsb5Wert(java.lang.String bsb5Wert) {
        this.bsb5Wert = bsb5Wert;
    }

    /**
     * Return the value of the BSB5_CSB_RELATION column.
     * @return java.lang.String
     */
    public java.lang.String getBsb5CsbRelation() {
        return this.bsb5CsbRelation;
    }

    /**
     * Set the value of the BSB5_CSB_RELATION column.
     * @param bsb5CsbRelation
     */
    public void setBsb5CsbRelation(java.lang.String bsb5CsbRelation) {
        this.bsb5CsbRelation = bsb5CsbRelation;
    }

    /**
     * Return the value of the BEMERKUNGEN column.
     * @return java.lang.String
     */
    public java.lang.String getBemerkungen() {
        return this.bemerkungen;
    }

    /**
     * Set the value of the BEMERKUNGEN column.
     * @param bemerkungen
     */
    public void setBemerkungen(java.lang.String bemerkungen) {
        this.bemerkungen = bemerkungen;
    }

    /**
     * Return the value of the BIK_GRENZWERT column.
     * @return java.lang.String
     */
    public java.lang.String getBikGrenzwert() {
        return this.bikGrenzwert;
    }

    /**
     * Set the value of the BIK_GRENZWERT column.
     * @param bikGrenzwert
     */
    public void setBikGrenzwert(java.lang.String bikGrenzwert) {
        this.bikGrenzwert = bikGrenzwert;
    }

    /**
     * Return the value of the BIK_WERT column.
     * @return java.lang.String
     */
    public java.lang.String getBikWert() {
        return this.bikWert;
    }

    /**
     * Set the value of the BIK_WERT column.
     * @param bikWert
     */
    public void setBikWert(java.lang.String bikWert) {
        this.bikWert = bikWert;
    }

    /**
     * Return the value of the PH_WERT column.
     * @return java.lang.String
     */
    public java.lang.String getPhWert() {
        return this.phWert;
    }

    /**
     * Set the value of the PH_WERT column.
     * @param phWert
     */
    public void setPhWert(java.lang.String phWert) {
        this.phWert = phWert;
    }

    /**
     * Return the value of the PH_GRENZWERT column.
     * @return java.lang.String
     */
    public java.lang.String getPhGrenzwert() {
        return this.phGrenzwert;
    }

    /**
     * Set the value of the PH_GRENZWERT column.
     * @param phGrenzwert
     */
    public void setPhGrenzwert(java.lang.String phGrenzwert) {
        this.phGrenzwert = phGrenzwert;
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
        if (!(rhs instanceof Anh49Analysen))
            return false;
        Anh49Analysen that = (Anh49Analysen) rhs;
        if (this.getAnalysenid() != null && that.getAnalysenid() != null) {
            if (!this.getAnalysenid().equals(that.getAnalysenid())) {
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
            int analysenidValue = this.getAnalysenid() == null ? 0 : this
                .getAnalysenid().hashCode();
            result = result * 37 + analysenidValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }
}
