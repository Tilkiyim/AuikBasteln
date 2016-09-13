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
 * A class that represents a row in the Anh53Fachdaten database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class Anh53Fachdaten  implements java.io.Serializable {

    /** Generated serialVersionUID for Serializable interface */
    private static final long serialVersionUID =
        DatabaseSerialVersionUID.forAnh53Fachdaten;
    
    /* Primary key, foreign keys (relations) and table columns */
    private Integer id;
    private BasisObjekt basisObjekt;
    private String branche;
    private String verfahren;
    private Date antragsdatum;
    private Boolean bagatell;
    private Date bagatelldatum;
    private Date genehmigungsdatum;
    private Date genehmigungaufgehoben;
    private Date abnahmedatum;
    private String genehmigungstitel;
    private Boolean genehmigung;
    private Integer durchsatz;
    private Integer gesamtmengeEb;
    private Boolean onlineentsilberung;
    private Boolean abwasser;
    private Date abwasserfrei;
    private Date kleiner200qm;
    private Boolean betriebAbgemeldet;
    private String bemerkungen;
    private Boolean betriebstagebuch;
    private Boolean wasseruhr;
    private Integer spuelwassermenge;
    private Integer spuelwasserverbrauch;
    private Boolean wartungsvertrag;
    private Boolean grgen;
    private String genart;
    private boolean enabled;
    private boolean deleted;

    /** Logging */
    private static final AuikLogger log = AuikLogger.getLogger();

    /** Default constructor */
    public Anh53Fachdaten() {
        // This place is intentionally left blank.
    }

    /** Minimal constructor */
    public Anh53Fachdaten(
        Integer id, BasisObjekt basisObjekt, boolean enabled, boolean deleted) {
        this.id = id;
        this.basisObjekt = basisObjekt;
        this.enabled = enabled;
        this.deleted = deleted;
    }

    /** Full constructor */
    public Anh53Fachdaten(
        Integer id, BasisObjekt basisObjekt, String branche, String verfahren, Date antragsdatum, Boolean bagatell, Date bagatelldatum, Date genehmigungsdatum, Date genehmigungaufgehoben, Date abnahmedatum, String genehmigungstitel, Boolean genehmigung, Integer durchsatz, Integer gesamtmengeEb, Boolean onlineentsilberung, Boolean abwasser, Date abwasserfrei, Date kleiner200qm, Boolean betriebAbgemeldet, String bemerkungen, Boolean betriebstagebuch, Boolean wasseruhr, Integer spuelwassermenge, Integer spuelwasserverbrauch, Boolean wartungsvertrag, Boolean grgen, String genart, boolean enabled, boolean deleted) {
        this.id = id;
        this.basisObjekt = basisObjekt;
        this.branche = branche;
        this.verfahren = verfahren;
        this.antragsdatum = antragsdatum;
        this.bagatell = bagatell;
        this.bagatelldatum = bagatelldatum;
        this.genehmigungsdatum = genehmigungsdatum;
        this.genehmigungaufgehoben = genehmigungaufgehoben;
        this.abnahmedatum = abnahmedatum;
        this.genehmigungstitel = genehmigungstitel;
        this.genehmigung = genehmigung;
        this.durchsatz = durchsatz;
        this.gesamtmengeEb = gesamtmengeEb;
        this.onlineentsilberung = onlineentsilberung;
        this.abwasser = abwasser;
        this.abwasserfrei = abwasserfrei;
        this.kleiner200qm = kleiner200qm;
        this.betriebAbgemeldet = betriebAbgemeldet;
        this.bemerkungen = bemerkungen;
        this.betriebstagebuch = betriebstagebuch;
        this.wasseruhr = wasseruhr;
        this.spuelwassermenge = spuelwassermenge;
        this.spuelwasserverbrauch = spuelwasserverbrauch;
        this.wartungsvertrag = wartungsvertrag;
        this.grgen = grgen;
        this.genart = genart;
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

    public BasisObjekt getBasisObjekt() {
        return this.basisObjekt;
    }

    public void setBasisObjekt(BasisObjekt basisObjekt) {
        this.basisObjekt = basisObjekt;
    }

    public String getBranche() {
        return this.branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }

    public String getVerfahren() {
        return this.verfahren;
    }

    public void setVerfahren(String verfahren) {
        this.verfahren = verfahren;
    }

    public Date getAntragsdatum() {
        return this.antragsdatum;
    }

    public void setAntragsdatum(Date antragsdatum) {
        this.antragsdatum = antragsdatum;
    }

    public Boolean getBagatell() {
        return this.bagatell;
    }

    public void setBagatell(Boolean bagatell) {
        this.bagatell = bagatell;
    }

    public Date getBagatelldatum() {
        return this.bagatelldatum;
    }

    public void setBagatelldatum(Date bagatelldatum) {
        this.bagatelldatum = bagatelldatum;
    }

    public Date getGenehmigungsdatum() {
        return this.genehmigungsdatum;
    }

    public void setGenehmigungsdatum(Date genehmigungsdatum) {
        this.genehmigungsdatum = genehmigungsdatum;
    }

    public Date getGenehmigungaufgehoben() {
        return this.genehmigungaufgehoben;
    }

    public void setGenehmigungaufgehoben(Date genehmigungaufgehoben) {
        this.genehmigungaufgehoben = genehmigungaufgehoben;
    }

    public Date getAbnahmedatum() {
        return this.abnahmedatum;
    }

    public void setAbnahmedatum(Date abnahmedatum) {
        this.abnahmedatum = abnahmedatum;
    }

    public String getGenehmigungstitel() {
        return this.genehmigungstitel;
    }

    public void setGenehmigungstitel(String genehmigungstitel) {
        this.genehmigungstitel = genehmigungstitel;
    }

    public Boolean getGenehmigung() {
        return this.genehmigung;
    }

    public void setGenehmigung(Boolean genehmigung) {
        this.genehmigung = genehmigung;
    }

    public Integer getDurchsatz() {
        return this.durchsatz;
    }

    public void setDurchsatz(Integer durchsatz) {
        this.durchsatz = durchsatz;
    }

    public Integer getGesamtmengeEb() {
        return this.gesamtmengeEb;
    }

    public void setGesamtmengeEb(Integer gesamtmengeEb) {
        this.gesamtmengeEb = gesamtmengeEb;
    }

    public Boolean getOnlineentsilberung() {
        return this.onlineentsilberung;
    }

    public void setOnlineentsilberung(Boolean onlineentsilberung) {
        this.onlineentsilberung = onlineentsilberung;
    }

    public Boolean getAbwasser() {
        return this.abwasser;
    }

    public void setAbwasser(Boolean abwasser) {
        this.abwasser = abwasser;
    }

    public Date getAbwasserfrei() {
        return this.abwasserfrei;
    }

    public void setAbwasserfrei(Date abwasserfrei) {
        this.abwasserfrei = abwasserfrei;
    }

    public Date getKleiner200qm() {
        return this.kleiner200qm;
    }

    public void setKleiner200qm(Date kleiner200qm) {
        this.kleiner200qm = kleiner200qm;
    }

    public Boolean getBetriebAbgemeldet() {
        return this.betriebAbgemeldet;
    }

    public void setBetriebAbgemeldet(Boolean betriebAbgemeldet) {
        this.betriebAbgemeldet = betriebAbgemeldet;
    }

    public String getBemerkungen() {
        return this.bemerkungen;
    }

    public void setBemerkungen(String bemerkungen) {
        this.bemerkungen = bemerkungen;
    }

    public Boolean getBetriebstagebuch() {
        return this.betriebstagebuch;
    }

    public void setBetriebstagebuch(Boolean betriebstagebuch) {
        this.betriebstagebuch = betriebstagebuch;
    }

    public Boolean getWasseruhr() {
        return this.wasseruhr;
    }

    public void setWasseruhr(Boolean wasseruhr) {
        this.wasseruhr = wasseruhr;
    }

    public Integer getSpuelwassermenge() {
        return this.spuelwassermenge;
    }

    public void setSpuelwassermenge(Integer spuelwassermenge) {
        this.spuelwassermenge = spuelwassermenge;
    }

    public Integer getSpuelwasserverbrauch() {
        return this.spuelwasserverbrauch;
    }

    public void setSpuelwasserverbrauch(Integer spuelwasserverbrauch) {
        this.spuelwasserverbrauch = spuelwasserverbrauch;
    }

    public Boolean getWartungsvertrag() {
        return this.wartungsvertrag;
    }

    public void setWartungsvertrag(Boolean wartungsvertrag) {
        this.wartungsvertrag = wartungsvertrag;
    }

    public Boolean getGrgen() {
        return this.grgen;
    }

    public void setGrgen(Boolean grgen) {
        this.grgen = grgen;
    }

    public String getGenart() {
        return this.genart;
    }

    public void setGenart(String genart) {
        this.genart = genart;
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
        buffer.append("basisObjekt").append("='").append(getBasisObjekt()).append("' ");			
        buffer.append("branche").append("='").append(getBranche()).append("' ");			
        buffer.append("verfahren").append("='").append(getVerfahren()).append("' ");			
        buffer.append("antragsdatum").append("='").append(getAntragsdatum()).append("' ");			
        buffer.append("bagatell").append("='").append(getBagatell()).append("' ");			
        buffer.append("bagatelldatum").append("='").append(getBagatelldatum()).append("' ");			
        buffer.append("genehmigungsdatum").append("='").append(getGenehmigungsdatum()).append("' ");			
        buffer.append("genehmigungaufgehoben").append("='").append(getGenehmigungaufgehoben()).append("' ");			
        buffer.append("abnahmedatum").append("='").append(getAbnahmedatum()).append("' ");			
        buffer.append("genehmigungstitel").append("='").append(getGenehmigungstitel()).append("' ");			
        buffer.append("genehmigung").append("='").append(getGenehmigung()).append("' ");			
        buffer.append("durchsatz").append("='").append(getDurchsatz()).append("' ");			
        buffer.append("gesamtmengeEb").append("='").append(getGesamtmengeEb()).append("' ");			
        buffer.append("onlineentsilberung").append("='").append(getOnlineentsilberung()).append("' ");			
        buffer.append("abwasser").append("='").append(getAbwasser()).append("' ");			
        buffer.append("abwasserfrei").append("='").append(getAbwasserfrei()).append("' ");			
        buffer.append("kleiner200qm").append("='").append(getKleiner200qm()).append("' ");			
        buffer.append("betriebAbgemeldet").append("='").append(getBetriebAbgemeldet()).append("' ");			
        buffer.append("bemerkungen").append("='").append(getBemerkungen()).append("' ");			
        buffer.append("betriebstagebuch").append("='").append(getBetriebstagebuch()).append("' ");			
        buffer.append("wasseruhr").append("='").append(getWasseruhr()).append("' ");			
        buffer.append("spuelwassermenge").append("='").append(getSpuelwassermenge()).append("' ");			
        buffer.append("spuelwasserverbrauch").append("='").append(getSpuelwasserverbrauch()).append("' ");			
        buffer.append("wartungsvertrag").append("='").append(getWartungsvertrag()).append("' ");			
        buffer.append("grgen").append("='").append(getGrgen()).append("' ");			
        buffer.append("genart").append("='").append(getGenart()).append("' ");			
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
        if (!(other instanceof Anh53Fachdaten)) return false;
        return (this.getId().equals(
            ((Anh53Fachdaten) other).getId()));
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
     * @return <code>Anh53Fachdaten</code> the merged instance,
     *         if everything went okay,
     *         <code>null</code> otherwise
     */
    public static Anh53Fachdaten merge(Anh53Fachdaten detachedInstance) {
        log.debug("Merging Anh53Fachdaten instance " + detachedInstance);
        return (Anh53Fachdaten) new DatabaseAccess().merge(detachedInstance);
    }

    /**
     * Merge (save or update) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean merge() {
        Anh53Fachdaten saved = Anh53Fachdaten.merge(this);
        if (saved == null) {
            return false;
        } else {
            this.copy(saved);
            return true;
        }
    }

    /**
     * Update this Anh53Fachdaten with its new values.<br>
     * This is meant to be used after merging!
     * @param copy Anh53Fachdaten
     */
    private void copy(Anh53Fachdaten copy) {
        this.id = copy.getId();            
        this.basisObjekt = copy.getBasisObjekt();            
        this.branche = copy.getBranche();            
        this.verfahren = copy.getVerfahren();            
        this.antragsdatum = copy.getAntragsdatum();            
        this.bagatell = copy.getBagatell();            
        this.bagatelldatum = copy.getBagatelldatum();            
        this.genehmigungsdatum = copy.getGenehmigungsdatum();            
        this.genehmigungaufgehoben = copy.getGenehmigungaufgehoben();            
        this.abnahmedatum = copy.getAbnahmedatum();            
        this.genehmigungstitel = copy.getGenehmigungstitel();            
        this.genehmigung = copy.getGenehmigung();            
        this.durchsatz = copy.getDurchsatz();            
        this.gesamtmengeEb = copy.getGesamtmengeEb();            
        this.onlineentsilberung = copy.getOnlineentsilberung();            
        this.abwasser = copy.getAbwasser();            
        this.abwasserfrei = copy.getAbwasserfrei();            
        this.kleiner200qm = copy.getKleiner200qm();            
        this.betriebAbgemeldet = copy.getBetriebAbgemeldet();            
        this.bemerkungen = copy.getBemerkungen();            
        this.betriebstagebuch = copy.getBetriebstagebuch();            
        this.wasseruhr = copy.getWasseruhr();            
        this.spuelwassermenge = copy.getSpuelwassermenge();            
        this.spuelwasserverbrauch = copy.getSpuelwasserverbrauch();            
        this.wartungsvertrag = copy.getWartungsvertrag();            
        this.grgen = copy.getGrgen();            
        this.genart = copy.getGenart();            
        this.enabled = copy.isEnabled();            
        this.deleted = copy.isDeleted();            
    }    

    /**
     * Delete (mark as deleted) a detached instance
     * @param detachedInstance the instance to delete
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public static boolean delete(Anh53Fachdaten detachedInstance) {
        log.debug("Deleting Anh53Fachdaten instance " + detachedInstance);
        return new DatabaseAccess().delete(detachedInstance);
    }

    /**
     * Delete (mark as deleted) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean delete() {
        return Anh53Fachdaten.delete(this);
    }

    /**
     * Find an <code>Anh53Fachdaten</code> instance by its primary key
     * @param id the primary key value
     * @return <code>Anh53Fachdaten</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static Anh53Fachdaten findById(java.lang.Integer id) {
        log.debug("Getting Anh53Fachdaten instance with id: " + id);
        return (Anh53Fachdaten)
            new DatabaseAccess().get(Anh53Fachdaten.class, id);
    }

    /**
     * Get a list of all <code>Anh53Fachdaten</code>
     * @return <code>List&lt;Anh53Fachdaten&gt;</code>
     *         all <code>Anh53Fachdaten</code>
     */
    public static List<Anh53Fachdaten> getAll() {
        return DatabaseQuery.getAll(new Anh53Fachdaten());
    }

    /* Custom code goes below here! */
    public static Anh53Fachdaten findByObjektId(java.lang.Integer id){
        log.debug("Getting Anh53Fachdaten instance with connected BasisObjekt with id: " + id);
        List<Anh53Fachdaten> all = Anh53Fachdaten.getAll();
        for(Anh53Fachdaten i : all){
            if(i.getBasisObjekt().getId().equals(id)){
                return (Anh53Fachdaten) new DatabaseAccess().get(Anh53Fachdaten.class, i.getId());
            }
        }
        return null;
    }
}
