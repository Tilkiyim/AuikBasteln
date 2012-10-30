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
 * A class that represents a row in the VAWS_ABFUELLFLAECHE table. You can
 * customize the behavior of this class by editing the class, {@link
 * VawsAbfuellflaeche()}.
 */
public abstract class AbstractVawsAbfuellflaeche extends
    StupidHelperClassWhichWillBeGoneSoon implements Serializable {
    private static final long serialVersionUID = 902670291995436106L;

    /**
     * The cached hash code value for this instance. Setting to 0 triggers
     * re-calculation.
     */
    private int hashValue = 0;

    /** The composite primary key value. */
    private java.lang.Integer behaelterid;

    /** The value of the vawsFachdaten property. */
    private VawsFachdaten vawsFachdaten;

    /** The value of the simple eoh property. */
    private java.lang.Boolean eoh;

    /** The value of the simple ef property. */
    private java.lang.Boolean ef;

    /** The value of the simple abfsaniert property. */
    private java.lang.Boolean abfsaniert;

    /** The value of the simple abfneuerstellt property. */
    private java.lang.Boolean abfneuerstellt;

    /** The value of the simple bodenflaechenausf property. */
    private java.lang.String bodenflaechenausf;

    /** The value of the simple beschbodenfl property. */
    private java.lang.String beschbodenfl;

    /** The value of the simple dicke property. */
    private java.lang.Float dicke;

    /** The value of the simple guete property. */
    private java.lang.String guete;

    /** The value of the simple fugenmaterial property. */
    private java.lang.String fugenmaterial;

    /** The value of the simple beschfugenmat property. */
    private java.lang.String beschfugenmat;

    /** The value of the simple niederschlagschutz property. */
    private java.lang.String niederschlagschutz;

    /** The value of the simple abscheidervorh property. */
    private java.lang.Boolean abscheidervorh;

    /** The value of the simple beschableitung property. */
    private java.lang.String beschableitung;

    /**
     * Simple constructor of AbstractVawsAbfuellflaeche instances.
     */
    public AbstractVawsAbfuellflaeche() {
    }

    /**
     * Constructor of AbstractVawsAbfuellflaeche instances given a simple
     * primary key.
     * @param id
     */
    public AbstractVawsAbfuellflaeche(java.lang.Integer behaelterid) {
        this.setBehaelterid(behaelterid);
    }

    /**
     * Return the simple primary key value that identifies this object.
     * @return java.lang.Integer
     */
    public java.lang.Integer getBehaelterid() {
        return behaelterid;
    }

    /**
     * Set the simple primary key value that identifies this object.
     * @param id
     */
    public void setBehaelterid(java.lang.Integer behaelterid) {
        this.hashValue = 0;
        this.behaelterid = behaelterid;
    }

    /**
     * Return the value of the BEHAELTERID column.
     * @return VawsFachdaten
     */
    public VawsFachdaten getVawsFachdaten() {
        return this.vawsFachdaten;
    }

    /**
     * Set the value of the BEHAELTERID column.
     * @param vawsFachdaten
     */
    public void setVawsFachdaten(VawsFachdaten vawsFachdaten) {
        this.vawsFachdaten = vawsFachdaten;
    }

    /**
     * Return the value of the EOH column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getEoh() {
        return this.eoh;
    }

    /**
     * Set the value of the EOH column.
     * @param eoh
     */
    public void setEoh(java.lang.Boolean eoh) {
        this.eoh = eoh;
    }

    /**
     * Return the value of the EF column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getEf() {
        return this.ef;
    }

    /**
     * Set the value of the EF column.
     * @param ef
     */
    public void setEf(java.lang.Boolean ef) {
        this.ef = ef;
    }

    /**
     * Return the value of the ABFSANIERT column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getAbfsaniert() {
        return this.abfsaniert;
    }

    /**
     * Set the value of the ABFSANIERT column.
     * @param abfsaniert
     */
    public void setAbfsaniert(java.lang.Boolean abfsaniert) {
        this.abfsaniert = abfsaniert;
    }

    /**
     * Return the value of the ABFNEUERSTELLT column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getAbfneuerstellt() {
        return this.abfneuerstellt;
    }

    /**
     * Set the value of the ABFNEUERSTELLT column.
     * @param abfneuerstellt
     */
    public void setAbfneuerstellt(java.lang.Boolean abfneuerstellt) {
        this.abfneuerstellt = abfneuerstellt;
    }

    /**
     * Return the value of the BODENFLAECHENAUSF column.
     * @return java.lang.String
     */
    public java.lang.String getBodenflaechenausf() {
        return this.bodenflaechenausf;
    }

    /**
     * Set the value of the BODENFLAECHENAUSF column.
     * @param bodenflaechenausf
     */
    public void setBodenflaechenausf(java.lang.String bodenflaechenausf) {
        this.bodenflaechenausf = bodenflaechenausf;
    }

    /**
     * Return the value of the BESCHBODENFL column.
     * @return java.lang.String
     */
    public java.lang.String getBeschbodenfl() {
        return this.beschbodenfl;
    }

    /**
     * Set the value of the BESCHBODENFL column.
     * @param beschbodenfl
     */
    public void setBeschbodenfl(java.lang.String beschbodenfl) {
        this.beschbodenfl = beschbodenfl;
    }

    /**
     * Return the value of the DICKE column.
     * @return java.lang.Float
     */
    public java.lang.Float getDicke() {
        return this.dicke;
    }

    /**
     * Set the value of the DICKE column.
     * @param dicke
     */
    public void setDicke(java.lang.Float dicke) {
        this.dicke = dicke;
    }

    /**
     * Return the value of the GUETE column.
     * @return java.lang.String
     */
    public java.lang.String getGuete() {
        return this.guete;
    }

    /**
     * Set the value of the GUETE column.
     * @param guete
     */
    public void setGuete(java.lang.String guete) {
        this.guete = guete;
    }

    /**
     * Return the value of the FUGENMATERIAL column.
     * @return java.lang.String
     */
    public java.lang.String getFugenmaterial() {
        return this.fugenmaterial;
    }

    /**
     * Set the value of the FUGENMATERIAL column.
     * @param fugenmaterial
     */
    public void setFugenmaterial(java.lang.String fugenmaterial) {
        this.fugenmaterial = fugenmaterial;
    }

    /**
     * Return the value of the BESCHFUGENMAT column.
     * @return java.lang.String
     */
    public java.lang.String getBeschfugenmat() {
        return this.beschfugenmat;
    }

    /**
     * Set the value of the BESCHFUGENMAT column.
     * @param beschfugenmat
     */
    public void setBeschfugenmat(java.lang.String beschfugenmat) {
        this.beschfugenmat = beschfugenmat;
    }

    /**
     * Return the value of the NIEDERSCHLAGSCHUTZ column.
     * @return java.lang.String
     */
    public java.lang.String getNiederschlagschutz() {
        return this.niederschlagschutz;
    }

    /**
     * Set the value of the NIEDERSCHLAGSCHUTZ column.
     * @param niederschlagschutz
     */
    public void setNiederschlagschutz(java.lang.String niederschlagschutz) {
        this.niederschlagschutz = niederschlagschutz;
    }

    /**
     * Return the value of the ABSCHEIDERVORH column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getAbscheidervorh() {
        return this.abscheidervorh;
    }

    /**
     * Set the value of the ABSCHEIDERVORH column.
     * @param abscheidervorh
     */
    public void setAbscheidervorh(java.lang.Boolean abscheidervorh) {
        this.abscheidervorh = abscheidervorh;
    }

    /**
     * Return the value of the BESCHABLEITUNG column.
     * @return java.lang.String
     */
    public java.lang.String getBeschableitung() {
        return this.beschableitung;
    }

    /**
     * Set the value of the BESCHABLEITUNG column.
     * @param beschableitung
     */
    public void setBeschableitung(java.lang.String beschableitung) {
        this.beschableitung = beschableitung;
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
        if (!(rhs instanceof VawsAbfuellflaeche))
            return false;
        VawsAbfuellflaeche that = (VawsAbfuellflaeche) rhs;
        if (this.getBehaelterid() != null && that.getBehaelterid() != null) {
            if (!this.getBehaelterid().equals(that.getBehaelterid())) {
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
            int idValue = this.getBehaelterid() == null ? 0 : this
                .getBehaelterid().hashCode();
            result = result * 37 + idValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }
}
