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

import de.bielefeld.umweltamt.aui.mappings.DatabaseAccess;
import de.bielefeld.umweltamt.aui.mappings.DatabaseClassToString;
import de.bielefeld.umweltamt.aui.mappings.DatabaseQuery;
import de.bielefeld.umweltamt.aui.mappings.DatabaseSerialVersionUID;
import de.bielefeld.umweltamt.aui.mappings.basis.BasisObjekt;
import de.bielefeld.umweltamt.aui.utils.AuikLogger;
import java.util.Date;
import java.util.List;

/**
 * A class that represents a row in the IndeinlGenehmigung database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class IndeinlGenehmigung  implements java.io.Serializable {

    /** Generated serialVersionUID for Serializable interface */
    private static final long serialVersionUID =
        DatabaseSerialVersionUID.forIndeinlGenehmigung;
    
    /* Primary key, foreign keys (relations) and table columns */
    private Integer objektid;
    private BasisObjekt basisObjekt;
    private String bemerkungen;
    private Date erstellungsDatum;
    private Date aenderungsDatum;
    private Date antragDatum;
    private Boolean befristet;
    private Date befristetBis;
    private Integer anhang;
    private Integer genMenge;
    private Boolean gen58;
    private Boolean gen59;
    private Boolean selbstueberw;
    private Boolean ESatzung;
    private boolean enabled;
    private boolean deleted;
    private Integer uebergabestelleE32;
    private Integer uebergabestelleN32;

    /** Logging */
    private static final AuikLogger log = AuikLogger.getLogger();

    /** Default constructor */
    public IndeinlGenehmigung() {
        // This place is intentionally left blank.
    }

    /** Minimal constructor */
    public IndeinlGenehmigung(
        BasisObjekt basisObjekt, boolean enabled, boolean deleted) {
        this.basisObjekt = basisObjekt;
        this.enabled = enabled;
        this.deleted = deleted;
    }

    /** Full constructor */
    public IndeinlGenehmigung(
        BasisObjekt basisObjekt, String bemerkungen, Date erstellungsDatum, Date aenderungsDatum, Date antragDatum, Boolean befristet, Date befristetBis, Integer anhang, Integer genMenge, Boolean gen58, Boolean gen59, Boolean selbstueberw, Boolean ESatzung, boolean enabled, boolean deleted, Integer uebergabestelleE32, Integer uebergabestelleN32) {
        this.basisObjekt = basisObjekt;
        this.bemerkungen = bemerkungen;
        this.erstellungsDatum = erstellungsDatum;
        this.aenderungsDatum = aenderungsDatum;
        this.antragDatum = antragDatum;
        this.befristet = befristet;
        this.befristetBis = befristetBis;
        this.anhang = anhang;
        this.genMenge = genMenge;
        this.gen58 = gen58;
        this.gen59 = gen59;
        this.selbstueberw = selbstueberw;
        this.ESatzung = ESatzung;
        this.enabled = enabled;
        this.deleted = deleted;
        this.uebergabestelleE32 = uebergabestelleE32;
        this.uebergabestelleN32 = uebergabestelleN32;
    }

    /* Setter and getter methods */
    public Integer getObjektid() {
        return this.objektid;
    }

    public void setObjektid(Integer objektid) {
        this.objektid = objektid;
    }

    public BasisObjekt getBasisObjekt() {
        return this.basisObjekt;
    }

    public void setBasisObjekt(BasisObjekt basisObjekt) {
        this.basisObjekt = basisObjekt;
    }

    public String getBemerkungen() {
        return this.bemerkungen;
    }

    public void setBemerkungen(String bemerkungen) {
        this.bemerkungen = bemerkungen;
    }

    public Date getErstellungsDatum() {
        return this.erstellungsDatum;
    }

    public void setErstellungsDatum(Date erstellungsDatum) {
        this.erstellungsDatum = erstellungsDatum;
    }

    public Date getAenderungsDatum() {
        return this.aenderungsDatum;
    }

    public void setAenderungsDatum(Date aenderungsDatum) {
        this.aenderungsDatum = aenderungsDatum;
    }

    public Date getAntragDatum() {
        return this.antragDatum;
    }

    public void setAntragDatum(Date antragDatum) {
        this.antragDatum = antragDatum;
    }

    public Boolean getBefristet() {
        return this.befristet;
    }

    public void setBefristet(Boolean befristet) {
        this.befristet = befristet;
    }

    public Date getBefristetBis() {
        return this.befristetBis;
    }

    public void setBefristetBis(Date befristetBis) {
        this.befristetBis = befristetBis;
    }

    public Integer getAnhang() {
        return this.anhang;
    }

    public void setAnhang(Integer anhang) {
        this.anhang = anhang;
    }

    public Integer getGenMenge() {
        return this.genMenge;
    }

    public void setGenMenge(Integer genMenge) {
        this.genMenge = genMenge;
    }

    public Boolean getGen58() {
        return this.gen58;
    }

    public void setGen58(Boolean gen58) {
        this.gen58 = gen58;
    }

    public Boolean getGen59() {
        return this.gen59;
    }

    public void setGen59(Boolean gen59) {
        this.gen59 = gen59;
    }

    public Boolean getSelbstueberw() {
        return this.selbstueberw;
    }

    public void setSelbstueberw(Boolean selbstueberw) {
        this.selbstueberw = selbstueberw;
    }

    public Boolean getESatzung() {
        return this.ESatzung;
    }

    public void setESatzung(Boolean ESatzung) {
        this.ESatzung = ESatzung;
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

    public Integer getUebergabestelleE32() {
        return this.uebergabestelleE32;
    }

    public void setUebergabestelleE32(Integer uebergabestelleE32) {
        this.uebergabestelleE32 = uebergabestelleE32;
    }

    public Integer getUebergabestelleN32() {
        return this.uebergabestelleN32;
    }

    public void setUebergabestelleN32(Integer uebergabestelleN32) {
        this.uebergabestelleN32 = uebergabestelleN32;
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
        buffer.append("basisObjekt").append("='").append(getBasisObjekt()).append("' ");			
        buffer.append("bemerkungen").append("='").append(getBemerkungen()).append("' ");			
        buffer.append("erstellungsDatum").append("='").append(getErstellungsDatum()).append("' ");			
        buffer.append("aenderungsDatum").append("='").append(getAenderungsDatum()).append("' ");			
        buffer.append("antragDatum").append("='").append(getAntragDatum()).append("' ");			
        buffer.append("befristet").append("='").append(getBefristet()).append("' ");			
        buffer.append("befristetBis").append("='").append(getBefristetBis()).append("' ");			
        buffer.append("anhang").append("='").append(getAnhang()).append("' ");			
        buffer.append("genMenge").append("='").append(getGenMenge()).append("' ");			
        buffer.append("gen58").append("='").append(getGen58()).append("' ");			
        buffer.append("gen59").append("='").append(getGen59()).append("' ");			
        buffer.append("selbstueberw").append("='").append(getSelbstueberw()).append("' ");			
        buffer.append("ESatzung").append("='").append(getESatzung()).append("' ");			
        buffer.append("enabled").append("='").append(isEnabled()).append("' ");			
        buffer.append("deleted").append("='").append(isDeleted()).append("' ");			
        buffer.append("uebergabestelleE32").append("='").append(getUebergabestelleE32()).append("' ");			
        buffer.append("uebergabestelleN32").append("='").append(getUebergabestelleN32()).append("' ");			
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
        if (!(other instanceof IndeinlGenehmigung)) return false;
        return (this.getObjektid().equals(
            ((IndeinlGenehmigung) other).getObjektid()));
    }

    /**
     * Calculate a unique hashCode
     * @return <code>int</code>
     */
    @Override
    public int hashCode() {
        int result = 17;
        int idValue = this.getObjektid() == null ?
            0 : this.getObjektid().hashCode();
        result = result * 37 + idValue;
        return result;
    }
    
    /**
     * Merge (save or update) a detached instance
     * @param detachedInstance the instance to merge
     * @return <code>IndeinlGenehmigung</code> the merged instance,
     *         if everything went okay,
     *         <code>null</code> otherwise
     */
    public static IndeinlGenehmigung merge(IndeinlGenehmigung detachedInstance) {
        log.debug("Merging IndeinlGenehmigung instance " + detachedInstance);
        return (IndeinlGenehmigung) new DatabaseAccess().merge(detachedInstance);
    }

    /**
     * Merge (save or update) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean merge() {
        IndeinlGenehmigung saved = IndeinlGenehmigung.merge(this);
        if (saved == null) {
            return false;
        } else {
            this.copy(saved);
            return true;
        }
    }

    /**
     * Update this IndeinlGenehmigung with its new values.<br>
     * This is meant to be used after merging!
     * @param copy IndeinlGenehmigung
     */
    private void copy(IndeinlGenehmigung copy) {
        this.basisObjekt = copy.getBasisObjekt();            
        this.bemerkungen = copy.getBemerkungen();            
        this.erstellungsDatum = copy.getErstellungsDatum();            
        this.aenderungsDatum = copy.getAenderungsDatum();            
        this.antragDatum = copy.getAntragDatum();            
        this.befristet = copy.getBefristet();            
        this.befristetBis = copy.getBefristetBis();            
        this.anhang = copy.getAnhang();            
        this.genMenge = copy.getGenMenge();            
        this.gen58 = copy.getGen58();            
        this.gen59 = copy.getGen59();            
        this.selbstueberw = copy.getSelbstueberw();            
        this.ESatzung = copy.getESatzung();            
        this.enabled = copy.isEnabled();            
        this.deleted = copy.isDeleted();            
        this.uebergabestelleE32 = copy.getUebergabestelleE32();            
        this.uebergabestelleN32 = copy.getUebergabestelleN32();            
    }    

    /**
     * Delete (mark as deleted) a detached instance
     * @param detachedInstance the instance to delete
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public static boolean delete(IndeinlGenehmigung detachedInstance) {
        log.debug("Deleting IndeinlGenehmigung instance " + detachedInstance);
        return new DatabaseAccess().delete(detachedInstance);
    }

    /**
     * Delete (mark as deleted) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean delete() {
        return IndeinlGenehmigung.delete(this);
    }

    /**
     * Find an <code>IndeinlGenehmigung</code> instance by its primary key
     * @param id the primary key value
     * @return <code>IndeinlGenehmigung</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static IndeinlGenehmigung findById(java.lang.Integer id) {
        log.debug("Getting IndeinlGenehmigung instance with id: " + id);
        return (IndeinlGenehmigung)
            new DatabaseAccess().get(IndeinlGenehmigung.class, id);
    }

    /**
     * Get a list of all <code>IndeinlGenehmigung</code>
     * @return <code>List&lt;IndeinlGenehmigung&gt;</code>
     *         all <code>IndeinlGenehmigung</code>
     */
    public static List<IndeinlGenehmigung> getAll() {
        return DatabaseQuery.getAll(new IndeinlGenehmigung());
    }

    /* Custom code goes below here! */

}
