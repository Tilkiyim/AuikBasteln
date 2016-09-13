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

// Generated by Hibernate Tools 5.0.0.Final

package de.bielefeld.umweltamt.aui.mappings.vaws;

import de.bielefeld.umweltamt.aui.mappings.DatabaseAccess;
import de.bielefeld.umweltamt.aui.mappings.DatabaseClassToString;
import de.bielefeld.umweltamt.aui.mappings.DatabaseQuery;
import de.bielefeld.umweltamt.aui.mappings.DatabaseSerialVersionUID;
import de.bielefeld.umweltamt.aui.utils.AuikLogger;
import java.util.List;

/**
 * A class that represents a row in the VawsAbfuellflaeche database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class VawsAbfuellflaeche  implements java.io.Serializable {

    /** Generated serialVersionUID for Serializable interface */
    private static final long serialVersionUID =
        DatabaseSerialVersionUID.forVawsAbfuellflaeche;
    
    /* Primary key, foreign keys (relations) and table columns */
    private Integer behaelterid;
    private VawsFachdaten vawsFachdaten;
    private Boolean eoh;
    private Boolean ef;
    private Boolean abfsaniert;
    private Boolean abfneuerstellt;
    private String bodenflaechenausf;
    private String beschbodenfl;
    private Float dicke;
    private String guete;
    private String fugenmaterial;
    private String beschfugenmat;
    private String niederschlagschutz;
    private Boolean abscheidervorh;
    private String beschableitung;
    private boolean enabled;
    private boolean deleted;

    /** Logging */
    private static final AuikLogger log = AuikLogger.getLogger();

    /** Default constructor */
    public VawsAbfuellflaeche() {
        // This place is intentionally left blank.
    }

    /** Minimal constructor */
    public VawsAbfuellflaeche(
        VawsFachdaten vawsFachdaten, boolean enabled, boolean deleted) {
        this.vawsFachdaten = vawsFachdaten;
        this.enabled = enabled;
        this.deleted = deleted;
    }

    /** Full constructor */
    public VawsAbfuellflaeche(
        VawsFachdaten vawsFachdaten, Boolean eoh, Boolean ef, Boolean abfsaniert, Boolean abfneuerstellt, String bodenflaechenausf, String beschbodenfl, Float dicke, String guete, String fugenmaterial, String beschfugenmat, String niederschlagschutz, Boolean abscheidervorh, String beschableitung, boolean enabled, boolean deleted) {
        this.vawsFachdaten = vawsFachdaten;
        this.eoh = eoh;
        this.ef = ef;
        this.abfsaniert = abfsaniert;
        this.abfneuerstellt = abfneuerstellt;
        this.bodenflaechenausf = bodenflaechenausf;
        this.beschbodenfl = beschbodenfl;
        this.dicke = dicke;
        this.guete = guete;
        this.fugenmaterial = fugenmaterial;
        this.beschfugenmat = beschfugenmat;
        this.niederschlagschutz = niederschlagschutz;
        this.abscheidervorh = abscheidervorh;
        this.beschableitung = beschableitung;
        this.enabled = enabled;
        this.deleted = deleted;
    }

    /* Setter and getter methods */
    public Integer getBehaelterid() {
        return this.behaelterid;
    }

    public void setBehaelterid(Integer behaelterid) {
        this.behaelterid = behaelterid;
    }

    public VawsFachdaten getVawsFachdaten() {
        return this.vawsFachdaten;
    }

    public void setVawsFachdaten(VawsFachdaten vawsFachdaten) {
        this.vawsFachdaten = vawsFachdaten;
    }

    public Boolean getEoh() {
        return this.eoh;
    }

    public void setEoh(Boolean eoh) {
        this.eoh = eoh;
    }

    public Boolean getEf() {
        return this.ef;
    }

    public void setEf(Boolean ef) {
        this.ef = ef;
    }

    public Boolean getAbfsaniert() {
        return this.abfsaniert;
    }

    public void setAbfsaniert(Boolean abfsaniert) {
        this.abfsaniert = abfsaniert;
    }

    public Boolean getAbfneuerstellt() {
        return this.abfneuerstellt;
    }

    public void setAbfneuerstellt(Boolean abfneuerstellt) {
        this.abfneuerstellt = abfneuerstellt;
    }

    public String getBodenflaechenausf() {
        return this.bodenflaechenausf;
    }

    public void setBodenflaechenausf(String bodenflaechenausf) {
        this.bodenflaechenausf = bodenflaechenausf;
    }

    public String getBeschbodenfl() {
        return this.beschbodenfl;
    }

    public void setBeschbodenfl(String beschbodenfl) {
        this.beschbodenfl = beschbodenfl;
    }

    public Float getDicke() {
        return this.dicke;
    }

    public void setDicke(Float dicke) {
        this.dicke = dicke;
    }

    public String getGuete() {
        return this.guete;
    }

    public void setGuete(String guete) {
        this.guete = guete;
    }

    public String getFugenmaterial() {
        return this.fugenmaterial;
    }

    public void setFugenmaterial(String fugenmaterial) {
        this.fugenmaterial = fugenmaterial;
    }

    public String getBeschfugenmat() {
        return this.beschfugenmat;
    }

    public void setBeschfugenmat(String beschfugenmat) {
        this.beschfugenmat = beschfugenmat;
    }

    public String getNiederschlagschutz() {
        return this.niederschlagschutz;
    }

    public void setNiederschlagschutz(String niederschlagschutz) {
        this.niederschlagschutz = niederschlagschutz;
    }

    public Boolean getAbscheidervorh() {
        return this.abscheidervorh;
    }

    public void setAbscheidervorh(Boolean abscheidervorh) {
        this.abscheidervorh = abscheidervorh;
    }

    public String getBeschableitung() {
        return this.beschableitung;
    }

    public void setBeschableitung(String beschableitung) {
        this.beschableitung = beschableitung;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isDeleted() {
        return this.deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * To implement custom toString methods, jump to not generated code.<br>
     * Basically we either call on <code>toDebugString</code> for a debug
     * string, call on <code>toGuiString</code> for a gui representation or do
     * something completely different.
     * @return String
     */
    @Override
    public String toString() {
        return DatabaseClassToString.toStringForClass(this); 
    }

    /**
     * Get a string representation for debugging
     * @return String
     */
    public String toDebugString() {
        StringBuffer buffer = new StringBuffer();
        
        buffer.append(getClass().getSimpleName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
        buffer.append("vawsFachdaten").append("='").append(getVawsFachdaten()).append("' ");			
        buffer.append("eoh").append("='").append(getEoh()).append("' ");			
        buffer.append("ef").append("='").append(getEf()).append("' ");			
        buffer.append("abfsaniert").append("='").append(getAbfsaniert()).append("' ");			
        buffer.append("abfneuerstellt").append("='").append(getAbfneuerstellt()).append("' ");			
        buffer.append("bodenflaechenausf").append("='").append(getBodenflaechenausf()).append("' ");			
        buffer.append("beschbodenfl").append("='").append(getBeschbodenfl()).append("' ");			
        buffer.append("dicke").append("='").append(getDicke()).append("' ");			
        buffer.append("guete").append("='").append(getGuete()).append("' ");			
        buffer.append("fugenmaterial").append("='").append(getFugenmaterial()).append("' ");			
        buffer.append("beschfugenmat").append("='").append(getBeschfugenmat()).append("' ");			
        buffer.append("niederschlagschutz").append("='").append(getNiederschlagschutz()).append("' ");			
        buffer.append("abscheidervorh").append("='").append(getAbscheidervorh()).append("' ");			
        buffer.append("beschableitung").append("='").append(getBeschableitung()).append("' ");			
        buffer.append("enabled").append("='").append(isEnabled()).append("' ");			
        buffer.append("deleted").append("='").append(isDeleted()).append("' ");			
        buffer.append("]");

        return buffer.toString();
    }

    /**
     * @param other
     * @return <code>true</code>, if this and other are equal,
     *         <code>false</code> otherwise
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;
        if (!(other instanceof VawsAbfuellflaeche)) return false;
        return (this.getBehaelterid().equals(
            ((VawsAbfuellflaeche) other).getBehaelterid()));
    }

    /**
     * Calculate a unique hashCode
     * @return <code>int</code>
     */
    @Override
    public int hashCode() {
        int result = 17;
        int idValue = this.getBehaelterid() == null ?
            0 : this.getBehaelterid().hashCode();
        result = result * 37 + idValue;
        return result;
    }
    
    /**
     * Merge (save or update) a detached instance
     * @param detachedInstance the instance to merge
     * @return <code>VawsAbfuellflaeche</code> the merged instance,
     *         if everything went okay,
     *         <code>null</code> otherwise
     */
    public static VawsAbfuellflaeche merge(VawsAbfuellflaeche detachedInstance) {
        log.debug("Merging VawsAbfuellflaeche instance " + detachedInstance);
        return (VawsAbfuellflaeche) new DatabaseAccess().merge(detachedInstance);
    }

    /**
     * Merge (save or update) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean merge() {
        VawsAbfuellflaeche saved = VawsAbfuellflaeche.merge(this);
        if (saved == null) {
            return false;
        } else {
            this.copy(saved);
            return true;
        }
    }

    /**
     * Update this VawsAbfuellflaeche with its new values.<br>
     * This is meant to be used after merging!
     * @param copy VawsAbfuellflaeche
     */
    private void copy(VawsAbfuellflaeche copy) {
        this.vawsFachdaten = copy.getVawsFachdaten();            
        this.eoh = copy.getEoh();            
        this.ef = copy.getEf();            
        this.abfsaniert = copy.getAbfsaniert();            
        this.abfneuerstellt = copy.getAbfneuerstellt();            
        this.bodenflaechenausf = copy.getBodenflaechenausf();            
        this.beschbodenfl = copy.getBeschbodenfl();            
        this.dicke = copy.getDicke();            
        this.guete = copy.getGuete();            
        this.fugenmaterial = copy.getFugenmaterial();            
        this.beschfugenmat = copy.getBeschfugenmat();            
        this.niederschlagschutz = copy.getNiederschlagschutz();            
        this.abscheidervorh = copy.getAbscheidervorh();            
        this.beschableitung = copy.getBeschableitung();            
        this.enabled = copy.isEnabled();            
        this.deleted = copy.isDeleted();            
    }    

    /**
     * Delete (mark as deleted) a detached instance
     * @param detachedInstance the instance to delete
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public static boolean delete(VawsAbfuellflaeche detachedInstance) {
        log.debug("Deleting VawsAbfuellflaeche instance " + detachedInstance);
        return new DatabaseAccess().delete(detachedInstance);
    }

    /**
     * Delete (mark as deleted) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean delete() {
        return VawsAbfuellflaeche.delete(this);
    }

    /**
     * Find an <code>VawsAbfuellflaeche</code> instance by its primary key
     * @param id the primary key value
     * @return <code>VawsAbfuellflaeche</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static VawsAbfuellflaeche findById(java.lang.Integer id) {
        log.debug("Getting VawsAbfuellflaeche instance with id: " + id);
        return (VawsAbfuellflaeche)
            new DatabaseAccess().get(VawsAbfuellflaeche.class, id);
    }

    /**
     * Get a list of all <code>VawsAbfuellflaeche</code>
     * @return <code>List&lt;VawsAbfuellflaeche&gt;</code>
     *         all <code>VawsAbfuellflaeche</code>
     */
    public static List<VawsAbfuellflaeche> getAll() {
        return DatabaseQuery.getAll(new VawsAbfuellflaeche());
    }

    /* Custom code goes below here! */

}
