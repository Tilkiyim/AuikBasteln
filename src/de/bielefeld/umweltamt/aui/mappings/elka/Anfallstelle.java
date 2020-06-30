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

package de.bielefeld.umweltamt.aui.mappings.elka;

import de.bielefeld.umweltamt.aui.HibernateSessionFactory;
import de.bielefeld.umweltamt.aui.mappings.DatabaseAccess;
import de.bielefeld.umweltamt.aui.mappings.DatabaseClassToString;
import de.bielefeld.umweltamt.aui.mappings.DatabaseQuery;
import de.bielefeld.umweltamt.aui.mappings.DatabaseSerialVersionUID;
import de.bielefeld.umweltamt.aui.mappings.basis.Objekt;
import de.bielefeld.umweltamt.aui.mappings.indeinl.Anh40Fachdaten;
import de.bielefeld.umweltamt.aui.mappings.indeinl.Anh49Fachdaten;
import de.bielefeld.umweltamt.aui.mappings.indeinl.Anh50Fachdaten;
import de.bielefeld.umweltamt.aui.mappings.indeinl.Anh52Fachdaten;
import de.bielefeld.umweltamt.aui.mappings.indeinl.Anh55Fachdaten;
import de.bielefeld.umweltamt.aui.mappings.indeinl.Anh56Fachdaten;
import de.bielefeld.umweltamt.aui.mappings.indeinl.BwkFachdaten;
import de.bielefeld.umweltamt.aui.mappings.oberflgw.AfsNiederschlagswasser;
import de.bielefeld.umweltamt.aui.mappings.oberflgw.AfsStoffe;
import de.bielefeld.umweltamt.aui.utils.AuikLogger;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A class that represents a row in the Anfallstelle database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class Anfallstelle  implements java.io.Serializable {

    /** Generated serialVersionUID for Serializable interface */
    private static final long serialVersionUID =
        DatabaseSerialVersionUID.forAnfallstelle;
    
    /* Primary key, foreign keys (relations) and table columns */
    private Integer id;
    private Objekt objekt;
    private Integer seqId;
    private Date aktualDat;
    private Date erstellDat;
    private String anhangId;
    private String herkunft;
    private String anwendungsbereich;
    private String bezeichnung;
    private Date stillgelegtAm;
    private Integer abwaBeschaffOpt;
    private Integer betriebsweiseOpt;
    private Boolean enabled;
    private Boolean deleted;
    private BigDecimal maxVolTag;
    private BigDecimal maxVolStunde;
    private Integer volJahr;
    private String externalNr;
    private String anlagenart;
    private String bemerkungen;
    private Set<AfsStoffe> afsStoffes = new HashSet<AfsStoffe>(0);
    private Set<Referenz> referenzsForZAfsNr = new HashSet<Referenz>(0);
    private Set<AfsNiederschlagswasser> afsNiederschlagswassers = new HashSet<AfsNiederschlagswasser>(0);
    private Set<Referenz> referenzsForQAfsNr = new HashSet<Referenz>(0);
    private Set<BwkFachdaten> bwkFachdatens = new HashSet<BwkFachdaten>(0);
    private Set<Anh40Fachdaten> anh40Fachdatens = new HashSet<Anh40Fachdaten>(0);
    private Set<Anh49Fachdaten> anh49Fachdatens = new HashSet<Anh49Fachdaten>(0);
    private Set<Anh50Fachdaten> anh50Fachdatens = new HashSet<Anh50Fachdaten>(0);
    private Set<Anh52Fachdaten> anh52Fachdatens = new HashSet<Anh52Fachdaten>(0);
    private Set<Anh55Fachdaten> anh55Fachdatens = new HashSet<Anh55Fachdaten>(0);
    private Set<Anh56Fachdaten> anh56Fachdatens = new HashSet<Anh56Fachdaten>(0);

    /** Logging */
    private static final AuikLogger log = AuikLogger.getLogger();

    /** Default constructor */
    public Anfallstelle() {
        // This place is intentionally left blank.
    }

    /** Minimal constructor */
    public Anfallstelle(
        Integer id) {
        this.id = id;
    }

    /** Full constructor */
    public Anfallstelle(
        Integer id, Objekt objekt, Integer seqId, Date aktualDat, Date erstellDat, String anhangId, String herkunft, String anwendungsbereich, String bezeichnung, Date stillgelegtAm, Integer abwaBeschaffOpt, Integer betriebsweiseOpt, Boolean enabled, Boolean deleted, BigDecimal maxVolTag, BigDecimal maxVolStunde, Integer volJahr, String externalNr, String anlagenart, String bemerkungen, Set<AfsStoffe> afsStoffes, Set<Referenz> referenzsForZAfsNr, Set<AfsNiederschlagswasser> afsNiederschlagswassers, Set<Referenz> referenzsForQAfsNr, Set<BwkFachdaten> bwkFachdatens, Set<Anh40Fachdaten> anh40Fachdatens, Set<Anh49Fachdaten> anh49Fachdatens, Set<Anh50Fachdaten> anh50Fachdatens, Set<Anh52Fachdaten> anh52Fachdatens, Set<Anh55Fachdaten> anh55Fachdatens, Set<Anh56Fachdaten> anh56Fachdatens) {
        this.id = id;
        this.objekt = objekt;
        this.seqId = seqId;
        this.aktualDat = aktualDat;
        this.erstellDat = erstellDat;
        this.anhangId = anhangId;
        this.herkunft = herkunft;
        this.anwendungsbereich = anwendungsbereich;
        this.bezeichnung = bezeichnung;
        this.stillgelegtAm = stillgelegtAm;
        this.abwaBeschaffOpt = abwaBeschaffOpt;
        this.betriebsweiseOpt = betriebsweiseOpt;
        this.enabled = enabled;
        this.deleted = deleted;
        this.maxVolTag = maxVolTag;
        this.maxVolStunde = maxVolStunde;
        this.volJahr = volJahr;
        this.externalNr = externalNr;
        this.anlagenart = anlagenart;
        this.bemerkungen = bemerkungen;
        this.afsStoffes = afsStoffes;
        this.referenzsForZAfsNr = referenzsForZAfsNr;
        this.afsNiederschlagswassers = afsNiederschlagswassers;
        this.referenzsForQAfsNr = referenzsForQAfsNr;
        this.bwkFachdatens = bwkFachdatens;
        this.anh40Fachdatens = anh40Fachdatens;
        this.anh49Fachdatens = anh49Fachdatens;
        this.anh50Fachdatens = anh50Fachdatens;
        this.anh52Fachdatens = anh52Fachdatens;
        this.anh55Fachdatens = anh55Fachdatens;
        this.anh56Fachdatens = anh56Fachdatens;
    }

    /* Setter and getter methods */
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Objekt getObjekt() {
		return objekt;
	}

	public void setObjekt(Objekt objekt) {
		this.objekt = objekt;
	}

    public Integer getSeqId() {
        return this.seqId;
    }

    public void setSeqId(Integer seqId) {
        this.seqId = seqId;
    }

    public Date getAktualDat() {
        return this.aktualDat;
    }

    public void setAktualDat(Date aktualDat) {
        this.aktualDat = aktualDat;
    }

    public Date getErstellDat() {
        return this.erstellDat;
    }

    public void setErstellDat(Date erstellDat) {
        this.erstellDat = erstellDat;
    }

    public String getAnhangId() {
        return this.anhangId;
    }

    public void setAnhangId(String anhangId) {
        this.anhangId = anhangId;
    }

    public String getHerkunft() {
        return this.herkunft;
    }

    public void setHerkunft(String herkunft) {
        this.herkunft = herkunft;
    }

    public String getAnwendungsbereich() {
        return this.anwendungsbereich;
    }

    public void setAnwendungsbereich(String anwendungsbereich) {
        this.anwendungsbereich = anwendungsbereich;
    }

    public String getBezeichnung() {
        return this.bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Date getStillgelegtAm() {
        return this.stillgelegtAm;
    }

    public void setStillgelegtAm(Date stillgelegtAm) {
        this.stillgelegtAm = stillgelegtAm;
    }

    public Integer getAbwaBeschaffOpt() {
        return this.abwaBeschaffOpt;
    }

    public void setAbwaBeschaffOpt(Integer abwaBeschaffOpt) {
        this.abwaBeschaffOpt = abwaBeschaffOpt;
    }

    public Integer getBetriebsweiseOpt() {
        return this.betriebsweiseOpt;
    }

    public void setBetriebsweiseOpt(Integer betriebsweiseOpt) {
        this.betriebsweiseOpt = betriebsweiseOpt;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getDeleted() {
        return this.deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public BigDecimal getMaxVolTag() {
        return this.maxVolTag;
    }

    public void setMaxVolTag(BigDecimal maxVolTag) {
        this.maxVolTag = maxVolTag;
    }

    public BigDecimal getMaxVolStunde() {
        return this.maxVolStunde;
    }

    public void setMaxVolStunde(BigDecimal maxVolStunde) {
        this.maxVolStunde = maxVolStunde;
    }

    public Integer getVolJahr() {
        return this.volJahr;
    }

    public void setVolJahr(Integer volJahr) {
        this.volJahr = volJahr;
    }

    public String getExternalNr() {
        return this.externalNr;
    }

    public void setExternalNr(String externalNr) {
        this.externalNr = externalNr;
    }

    public String getAnlagenart() {
        return this.anlagenart;
    }

    public void setAnlagenart(String anlagenart) {
        this.anlagenart = anlagenart;
    }

    public String getBemerkungen() {
        return this.bemerkungen;
    }

    public void setBemerkungen(String bemerkungen) {
        this.bemerkungen = bemerkungen;
    }

    public Set<AfsStoffe> getAfsStoffes() {
        return this.afsStoffes;
    }

    public void setAfsStoffes(Set<AfsStoffe> afsStoffes) {
        this.afsStoffes = afsStoffes;
    }

    public Set<Referenz> getReferenzsForZAfsNr() {
        return this.referenzsForZAfsNr;
    }

    public void setReferenzsForZAfsNr(Set<Referenz> referenzsForZAfsNr) {
        this.referenzsForZAfsNr = referenzsForZAfsNr;
    }

    public Set<AfsNiederschlagswasser> getAfsNiederschlagswassers() {
        return this.afsNiederschlagswassers;
    }

    public void setAfsNiederschlagswassers(Set<AfsNiederschlagswasser> afsNiederschlagswassers) {
        this.afsNiederschlagswassers = afsNiederschlagswassers;
    }

    public Set<Referenz> getReferenzsForQAfsNr() {
        return this.referenzsForQAfsNr;
    }

    public void setReferenzsForQAfsNr(Set<Referenz> referenzsForQAfsNr) {
        this.referenzsForQAfsNr = referenzsForQAfsNr;
    }

    public Set<BwkFachdaten> getBwkFachdatens() {
        return this.bwkFachdatens;
    }

    public void setBwkFachdatens(Set<BwkFachdaten> bwkFachdatens) {
        this.bwkFachdatens = bwkFachdatens;
    }

    public Set<Anh40Fachdaten> getAnh40Fachdatens() {
        return this.anh40Fachdatens;
    }

    public void setAnh40Fachdatens(Set<Anh40Fachdaten> anh40Fachdatens) {
        this.anh40Fachdatens = anh40Fachdatens;
    }

    public Set<Anh49Fachdaten> getAnh49Fachdatens() {
        return this.anh49Fachdatens;
    }

    public void setAnh49Fachdatens(Set<Anh49Fachdaten> anh49Fachdatens) {
        this.anh49Fachdatens = anh49Fachdatens;
    }

    public Set<Anh50Fachdaten> getAnh50Fachdatens() {
        return this.anh50Fachdatens;
    }

    public void setAnh50Fachdatens(Set<Anh50Fachdaten> anh50Fachdatens) {
        this.anh50Fachdatens = anh50Fachdatens;
    }

    public Set<Anh52Fachdaten> getAnh52Fachdatens() {
        return this.anh52Fachdatens;
    }

    public void setAnh52Fachdatens(Set<Anh52Fachdaten> anh52Fachdatens) {
        this.anh52Fachdatens = anh52Fachdatens;
    }

    public Set<Anh55Fachdaten> getAnh55Fachdatens() {
        return this.anh55Fachdatens;
    }

    public void setAnh55Fachdatens(Set<Anh55Fachdaten> anh55Fachdatens) {
        this.anh55Fachdatens = anh55Fachdatens;
    }

    public Set<Anh56Fachdaten> getAnh56Fachdatens() {
        return this.anh56Fachdatens;
    }

    public void setAnh56Fachdatens(Set<Anh56Fachdaten> anh56Fachdatens) {
        this.anh56Fachdatens = anh56Fachdatens;
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
        buffer.append("seqId").append("='").append(getSeqId()).append("' ");			
        buffer.append("aktualDat").append("='").append(getAktualDat()).append("' ");			
        buffer.append("erstellDat").append("='").append(getErstellDat()).append("' ");			
        buffer.append("anhangId").append("='").append(getAnhangId()).append("' ");			
        buffer.append("herkunft").append("='").append(getHerkunft()).append("' ");			
        buffer.append("anwendungsbereich").append("='").append(getAnwendungsbereich()).append("' ");			
        buffer.append("bezeichnung").append("='").append(getBezeichnung()).append("' ");			
        buffer.append("stillgelegtAm").append("='").append(getStillgelegtAm()).append("' ");			
        buffer.append("abwaBeschaffOpt").append("='").append(getAbwaBeschaffOpt()).append("' ");			
        buffer.append("betriebsweiseOpt").append("='").append(getBetriebsweiseOpt()).append("' ");			
        buffer.append("enabled").append("='").append(getEnabled()).append("' ");			
        buffer.append("deleted").append("='").append(getDeleted()).append("' ");			
        buffer.append("maxVolTag").append("='").append(getMaxVolTag()).append("' ");			
        buffer.append("maxVolStunde").append("='").append(getMaxVolStunde()).append("' ");			
        buffer.append("volJahr").append("='").append(getVolJahr()).append("' ");			
        buffer.append("externalNr").append("='").append(getExternalNr()).append("' ");			
        buffer.append("afsStoffes").append("='").append(getAfsStoffes()).append("' ");			
        buffer.append("referenzsForZAfsNr").append("='").append(getReferenzsForZAfsNr()).append("' ");			
        buffer.append("afsNiederschlagswassers").append("='").append(getAfsNiederschlagswassers()).append("' ");			
        buffer.append("referenzsForQAfsNr").append("='").append(getReferenzsForQAfsNr()).append("' ");
        buffer.append("bwkFachdatens").append("='").append(getBwkFachdatens()).append("' ");
        buffer.append("anh40Fachdatens").append("='").append(getAnh40Fachdatens()).append("' ");
        buffer.append("anh49Fachdatens").append("='").append(getAnh49Fachdatens()).append("' ");
        buffer.append("anh50Fachdatens").append("='").append(getAnh40Fachdatens()).append("' ");
        buffer.append("anh52Fachdatens").append("='").append(getAnh52Fachdatens()).append("' ");
        buffer.append("anh55Fachdatens").append("='").append(getAnh55Fachdatens()).append("' ");
        buffer.append("anh56Fachdatens").append("='").append(getAnh56Fachdatens()).append("' ");			
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
        if (!(other instanceof Anfallstelle)) return false;
        return (this.getId().equals(
            ((Anfallstelle) other).getId()));
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
     * @return <code>Anfallstelle</code> the merged instance,
     *         if everything went okay,
     *         <code>null</code> otherwise
     */
    public static Anfallstelle merge(Anfallstelle detachedInstance) {
        log.debug("Merging Anfallstelle instance " + detachedInstance);
        return (Anfallstelle) new DatabaseAccess().merge(detachedInstance);
    }

    /**
     * Merge (save or update) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean merge() {
        Anfallstelle saved = Anfallstelle.merge(this);
        if (saved == null) {
            return false;
        } else {
            this.copy(saved);
            return true;
        }
    }

    /**
     * Update this Anfallstelle with its new values.<br>
     * This is meant to be used after merging!
     * @param copy Anfallstelle
     */
    private void copy(Anfallstelle copy) {
        this.id = copy.getId();            
        this.objekt = copy.getObjekt();              
        this.seqId = copy.getSeqId();            
        this.aktualDat = copy.getAktualDat();            
        this.erstellDat = copy.getErstellDat();            
        this.anhangId = copy.getAnhangId();            
        this.herkunft = copy.getHerkunft();            
        this.anwendungsbereich = copy.getAnwendungsbereich();            
        this.bezeichnung = copy.getBezeichnung();            
        this.stillgelegtAm = copy.getStillgelegtAm();            
        this.abwaBeschaffOpt = copy.getAbwaBeschaffOpt();            
        this.betriebsweiseOpt = copy.getBetriebsweiseOpt();            
        this.enabled = copy.getEnabled();            
        this.deleted = copy.getDeleted();            
        this.maxVolTag = copy.getMaxVolTag();            
        this.maxVolStunde = copy.getMaxVolStunde();            
        this.volJahr = copy.getVolJahr();            
        this.externalNr = copy.getExternalNr();            
        this.afsStoffes = copy.getAfsStoffes();            
        this.referenzsForZAfsNr = copy.getReferenzsForZAfsNr();            
        this.afsNiederschlagswassers = copy.getAfsNiederschlagswassers();            
        this.referenzsForQAfsNr = copy.getReferenzsForQAfsNr();     
        this.bwkFachdatens = copy.getBwkFachdatens();
        this.anh40Fachdatens = copy.getAnh40Fachdatens();
        this.anh49Fachdatens = copy.getAnh49Fachdatens();
        this.anh50Fachdatens = copy.getAnh50Fachdatens();
        this.anh55Fachdatens = copy.getAnh55Fachdatens();
        this.anh52Fachdatens = copy.getAnh52Fachdatens();
        this.anh56Fachdatens = copy.getAnh56Fachdatens();       
    }    

    /**
     * Delete (mark as deleted) a detached instance
     * @param detachedInstance the instance to delete
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public static boolean delete(Anfallstelle detachedInstance) {
        log.debug("Deleting Anfallstelle instance " + detachedInstance);
        return new DatabaseAccess().delete(detachedInstance);
    }

    /**
     * Delete (mark as deleted) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean delete() {
        return Anfallstelle.delete(this);
    }

    /**
     * Find an <code>Anfallstelle</code> instance by its primary key
     * @param id the primary key value
     * @return <code>Anfallstelle</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static Anfallstelle findById(java.lang.Integer id) {
        log.debug("Getting Anfallstelle instance with id: " + id);
        return (Anfallstelle)
            new DatabaseAccess().get(Anfallstelle.class, id);
    }

    /**
     * Get a list of all <code>Anfallstelle</code>
     * @return <code>List&lt;Anfallstelle&gt;</code>
     *         all <code>Anfallstelle</code>
     */
    public static List<Anfallstelle> getAll() {
        return DatabaseQuery.getAll(new Anfallstelle());
    }

	public static Anfallstelle findByObjektId(Integer id2) {
        Objekt objekt = (Objekt) HibernateSessionFactory.currentSession().createQuery("from Objekt where id= " + id2).list().get(0);
        Set<Anfallstelle> list = objekt.getAnfallstelles();
        return list.iterator().next();
	}

    /* Custom code goes below here! */


    public static Integer getBetriebsweiseIdFromDescription(String description) {
        if (description == null) {
            return null;
        }
        switch (description) {
            case "Chargenbetrieb": return 0;
            case "Durchlaufbetrieb": return 1;
            case "Kampagnebetrieb": return 2;
            default: return null;
        }
    }

    public static String getBetriebsweiseDescriptionFromId(Integer id) {
        if (id == null) {
            return "-";
        }
        switch (id) {
            case 0: return "Chargenbetrieb";
            case 1: return "Durchlaufbetrieb";
            case 2: return "Kampagnebetrieb";
            default: return "-";
        }
    }

    public static Integer getBeschaffenheitIdFromDescription(String description) {
        if (description == null) {
            return null;
        }
        switch (description) {
            case "Produktionsabwasser": return 0;
            case "Kühlwasser": return 1;
            case "Sanitärwasser": return 2;
            case "Niederschlagswasser mit Sonderbauwerk": return 3;
            case "Niederschlagswasser ohne Sonderbauwerk": return 4;
            case "Grubenwasser": return 5;
            case "Fischteiche": return 6;
            case "sonstiges Wasser": return 7;
            default: return null;
        }
    }

    public static String getBeschaffenheitDescriptionFromId(Integer id) {
        if (id == null) {
            return "-";
        }
        switch (id) {
            case 1: return "Produktionsabwasser";
            case 2: return "Kühlwasser";
            case 3: return "Sanitärwasser";
            case 4: return "Niederschlagswasser mit Sonderbauwerk";
            case 5: return "Niederschlagswasser ohne Sonderbauwerk";
            case 6: return "Grubenwasser";
            case 7: return "Fischteiche";
            case 8: return "sonstiges Wasser";
            default: return "-";
        }
    }
}
