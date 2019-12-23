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

package de.bielefeld.umweltamt.aui.mappings.indeinl;

import de.bielefeld.umweltamt.aui.HibernateSessionFactory;
import de.bielefeld.umweltamt.aui.mappings.DatabaseAccess;
import de.bielefeld.umweltamt.aui.mappings.DatabaseClassToString;
import de.bielefeld.umweltamt.aui.mappings.DatabaseQuery;
import de.bielefeld.umweltamt.aui.mappings.DatabaseSerialVersionUID;
import de.bielefeld.umweltamt.aui.mappings.basis.Objekt;
import de.bielefeld.umweltamt.aui.mappings.elka.Anfallstelle;
import de.bielefeld.umweltamt.aui.utils.AuikLogger;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * A class that represents a row in the Anh56Fachdaten database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class Anh56Fachdaten  implements java.io.Serializable {

    /** Generated serialVersionUID for Serializable interface */
    private static final long serialVersionUID =
        DatabaseSerialVersionUID.forAnh56Fachdaten;
    
    /* Primary key, foreign keys (relations) and table columns */
    private Integer id;
    private Objekt objekt;
    private String druckverfahren;
    private String verbrauch;
    private String sachbearbeiterrav;
    private String sachbearbeiterheepen;
    private String entsorgung;
    private Boolean abwasseranfall;
    private Boolean genpflicht;
    private Boolean aba;
    private Date gen58;
    private Date gen59;
    private String bemerkungen;
    private Boolean abfallrechtlentsorg;
    private Boolean spuelwasser;
    private Boolean leimabwasser;
    private Date erfasstam;
    private boolean enabled;
    private boolean deleted;

    /** Logging */
    private static final AuikLogger log = AuikLogger.getLogger();

    /** Default constructor */
    public Anh56Fachdaten() {
        // This place is intentionally left blank.
    }

    /** Minimal constructor */
    public Anh56Fachdaten(
        Integer id, Objekt objekt, boolean enabled, boolean deleted) {
        this.id = id;
        this.objekt = objekt;
        this.enabled = enabled;
        this.deleted = deleted;
    }

    /** Full constructor */
    public Anh56Fachdaten(
        Integer id, Objekt objekt, String druckverfahren, String verbrauch, String sachbearbeiterrav, String sachbearbeiterheepen, String entsorgung, Boolean abwasseranfall, Boolean genpflicht, Boolean aba, Date gen58, Date gen59, String bemerkungen, Boolean abfallrechtlentsorg, Boolean spuelwasser, Boolean leimabwasser, Date erfasstam, boolean enabled, boolean deleted) {
        this.id = id;
        this.objekt = objekt;
        this.druckverfahren = druckverfahren;
        this.verbrauch = verbrauch;
        this.sachbearbeiterrav = sachbearbeiterrav;
        this.sachbearbeiterheepen = sachbearbeiterheepen;
        this.entsorgung = entsorgung;
        this.abwasseranfall = abwasseranfall;
        this.genpflicht = genpflicht;
        this.aba = aba;
        this.gen58 = gen58;
        this.gen59 = gen59;
        this.bemerkungen = bemerkungen;
        this.abfallrechtlentsorg = abfallrechtlentsorg;
        this.spuelwasser = spuelwasser;
        this.leimabwasser = leimabwasser;
        this.erfasstam = erfasstam;
        this.enabled = enabled;
        this.deleted = deleted;
    }

    /* Setter and getter methods */
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Objekt getObjekt() {
        return this.objekt;
    }

    public void setObjekt(Objekt objekt) {
        this.objekt = objekt;
    }

    public String getDruckverfahren() {
        return this.druckverfahren;
    }

    public void setDruckverfahren(String druckverfahren) {
        this.druckverfahren = druckverfahren;
    }

    public String getVerbrauch() {
        return this.verbrauch;
    }

    public void setVerbrauch(String verbrauch) {
        this.verbrauch = verbrauch;
    }

    public String getSachbearbeiterrav() {
        return this.sachbearbeiterrav;
    }

    public void setSachbearbeiterrav(String sachbearbeiterrav) {
        this.sachbearbeiterrav = sachbearbeiterrav;
    }

    public String getSachbearbeiterheepen() {
        return this.sachbearbeiterheepen;
    }

    public void setSachbearbeiterheepen(String sachbearbeiterheepen) {
        this.sachbearbeiterheepen = sachbearbeiterheepen;
    }

    public String getEntsorgung() {
        return this.entsorgung;
    }

    public void setEntsorgung(String entsorgung) {
        this.entsorgung = entsorgung;
    }

    public Boolean getAbwasseranfall() {
        return this.abwasseranfall;
    }

    public void setAbwasseranfall(Boolean abwasseranfall) {
        this.abwasseranfall = abwasseranfall;
    }

    public Boolean getGenpflicht() {
        return this.genpflicht;
    }

    public void setGenpflicht(Boolean genpflicht) {
        this.genpflicht = genpflicht;
    }

    public Boolean getAba() {
        return this.aba;
    }

    public void setAba(Boolean aba) {
        this.aba = aba;
    }

    public Date getGen58() {
        return this.gen58;
    }

    public void setGen58(Date gen58) {
        this.gen58 = gen58;
    }

    public Date getGen59() {
        return this.gen59;
    }

    public void setGen59(Date gen59) {
        this.gen59 = gen59;
    }

    public String getBemerkungen() {
        return this.bemerkungen;
    }

    public void setBemerkungen(String bemerkungen) {
        this.bemerkungen = bemerkungen;
    }

    public Boolean getAbfallrechtlentsorg() {
        return this.abfallrechtlentsorg;
    }

    public void setAbfallrechtlentsorg(Boolean abfallrechtlentsorg) {
        this.abfallrechtlentsorg = abfallrechtlentsorg;
    }

    public Boolean getSpuelwasser() {
        return this.spuelwasser;
    }

    public void setSpuelwasser(Boolean spuelwasser) {
        this.spuelwasser = spuelwasser;
    }

    public Boolean getLeimabwasser() {
        return this.leimabwasser;
    }

    public void setLeimabwasser(Boolean leimabwasser) {
        this.leimabwasser = leimabwasser;
    }

    public Date getErfasstam() {
        return this.erfasstam;
    }

    public void setErfasstam(Date erfasstam) {
        this.erfasstam = erfasstam;
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
        buffer.append("id").append("='").append(getId()).append("' ");			
        buffer.append("objekt").append("='").append(getObjekt()).append("' ");			
        buffer.append("druckverfahren").append("='").append(getDruckverfahren()).append("' ");			
        buffer.append("verbrauch").append("='").append(getVerbrauch()).append("' ");			
        buffer.append("sachbearbeiterrav").append("='").append(getSachbearbeiterrav()).append("' ");			
        buffer.append("sachbearbeiterheepen").append("='").append(getSachbearbeiterheepen()).append("' ");			
        buffer.append("entsorgung").append("='").append(getEntsorgung()).append("' ");			
        buffer.append("abwasseranfall").append("='").append(getAbwasseranfall()).append("' ");			
        buffer.append("genpflicht").append("='").append(getGenpflicht()).append("' ");			
        buffer.append("aba").append("='").append(getAba()).append("' ");			
        buffer.append("gen58").append("='").append(getGen58()).append("' ");			
        buffer.append("gen59").append("='").append(getGen59()).append("' ");			
        buffer.append("bemerkungen").append("='").append(getBemerkungen()).append("' ");			
        buffer.append("abfallrechtlentsorg").append("='").append(getAbfallrechtlentsorg()).append("' ");			
        buffer.append("spuelwasser").append("='").append(getSpuelwasser()).append("' ");			
        buffer.append("leimabwasser").append("='").append(getLeimabwasser()).append("' ");			
        buffer.append("erfasstam").append("='").append(getErfasstam()).append("' ");			
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
        if (!(other instanceof Anh56Fachdaten)) return false;
        return (this.getId().equals(
            ((Anh56Fachdaten) other).getId()));
    }

    /**
     * Calculate a unique hashCode
     * @return <code>int</code>
     */
    @Override
    public int hashCode() {
        int result = 17;
        int idValue = this.getId() == null ?
            0 : this.getId().hashCode();
        result = result * 37 + idValue;
        return result;
    }
    
    /**
     * Merge (save or update) a detached instance
     * @param detachedInstance the instance to merge
     * @return <code>Anh56Fachdaten</code> the merged instance,
     *         if everything went okay,
     *         <code>null</code> otherwise
     */
    public static Anh56Fachdaten merge(Anh56Fachdaten detachedInstance) {
        log.debug("Merging Anh56Fachdaten instance " + detachedInstance);
        return (Anh56Fachdaten) new DatabaseAccess().merge(detachedInstance);
    }

    /**
     * Merge (save or update) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean merge() {
        Anh56Fachdaten saved = Anh56Fachdaten.merge(this);
        if (saved == null) {
            return false;
        } else {
            this.copy(saved);
            return true;
        }
    }

    /**
     * Update this Anh56Fachdaten with its new values.<br>
     * This is meant to be used after merging!
     * @param copy Anh56Fachdaten
     */
    private void copy(Anh56Fachdaten copy) {
        this.id = copy.getId();            
        this.objekt = copy.getObjekt();            
        this.druckverfahren = copy.getDruckverfahren();            
        this.verbrauch = copy.getVerbrauch();            
        this.sachbearbeiterrav = copy.getSachbearbeiterrav();            
        this.sachbearbeiterheepen = copy.getSachbearbeiterheepen();            
        this.entsorgung = copy.getEntsorgung();            
        this.abwasseranfall = copy.getAbwasseranfall();            
        this.genpflicht = copy.getGenpflicht();            
        this.aba = copy.getAba();            
        this.gen58 = copy.getGen58();            
        this.gen59 = copy.getGen59();            
        this.bemerkungen = copy.getBemerkungen();            
        this.abfallrechtlentsorg = copy.getAbfallrechtlentsorg();            
        this.spuelwasser = copy.getSpuelwasser();            
        this.leimabwasser = copy.getLeimabwasser();            
        this.erfasstam = copy.getErfasstam();            
        this.enabled = copy.isEnabled();            
        this.deleted = copy.isDeleted();            
    }    

    /**
     * Delete (mark as deleted) a detached instance
     * @param detachedInstance the instance to delete
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public static boolean delete(Anh56Fachdaten detachedInstance) {
        log.debug("Deleting Anh56Fachdaten instance " + detachedInstance);
        return new DatabaseAccess().delete(detachedInstance);
    }

    /**
     * Delete (mark as deleted) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean delete() {
        return Anh56Fachdaten.delete(this);
    }

    /**
     * Find an <code>Anh56Fachdaten</code> instance by its primary key
     * @param id the primary key value
     * @return <code>Anh56Fachdaten</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static Anh56Fachdaten findById(java.lang.Integer id) {
        log.debug("Getting Anh56Fachdaten instance with id: " + id);
        return (Anh56Fachdaten)
            new DatabaseAccess().get(Anh56Fachdaten.class, id);
    }

    /**
     * Get a list of all <code>Anh56Fachdaten</code>
     * @return <code>List&lt;Anh56Fachdaten&gt;</code>
     *         all <code>Anh56Fachdaten</code>
     */
    public static List<Anh56Fachdaten> getAll() {
        return DatabaseQuery.getAll(new Anh56Fachdaten());
    }

    /* Custom code goes below here! */

    public static Anh56Fachdaten findByAnfallstelleId(java.lang.Integer id){
        log.debug("Getting Anh56Fachdaten instance with connected Anfallstelle with id: " + id);
        Anfallstelle anfallstelle = (Anfallstelle) HibernateSessionFactory.currentSession().createQuery("from Anfallstelle where id= " + id).list().get(0);
        Set<Anh56Fachdaten> list = anfallstelle.getAnh56Fachdatens();
        return list.iterator().next();
    }
}
