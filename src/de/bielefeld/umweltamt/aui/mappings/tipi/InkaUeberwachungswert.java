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

// Generated by Hibernate Tools 3.3.0.GA

package de.bielefeld.umweltamt.aui.mappings.tipi;

import java.util.Calendar;
import java.util.List;

import de.bielefeld.umweltamt.aui.mappings.DatabaseAccess;
import de.bielefeld.umweltamt.aui.mappings.DatabaseQuery;
import de.bielefeld.umweltamt.aui.utils.AuikLogger;
import de.nrw.lds.tipi.general.HistoryObject;

/**
 * A class that represents a row in the InkaUeberwachungswert database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class InkaUeberwachungswert  implements java.io.Serializable {

    /** Generated serialVersionUID for Serializable interface */
    private static final long serialVersionUID = DatabaseTipi.serialVersionUIDForInkaUeberwachungswert;

    /* Primary key, foreign keys (relations) and table columns */
    private InkaUeberwachungswertId id;
    private Integer parameterVer;
    private String gemeindekennzahl;
    private Integer gemeindeVer;
    private Integer uebergabestelleLfdNr;
    private Integer uebergabestelleVer;
    private Integer messstelleVer;
    private Boolean selbstAmtlJn;
    private Integer ueberwachungswertVer;
    private Calendar gueltigVon;
    private Calendar gueltigBis;
    private Calendar aenderungsDatum;
    private Calendar erfassungsDatum;
    private Integer historienNr;
    private Boolean istAktuellJn;
    private Integer genehmigungNr;
    private Integer genehmigungVer;
    private Integer anzJahr;
    private Double uewert;
    private Double uewertObergr;
    private Double uewertUntergr;
    private Double jahresfracht;

    /** Logging */
    private static final AuikLogger log = AuikLogger.getLogger();

    /** Default constructor */
    public InkaUeberwachungswert() {
        // This place is intentionally left blank.
    }

    /** Minimal constructor */
    public InkaUeberwachungswert(
        InkaUeberwachungswertId id) {
        this.id = id;
    }

    /** Full constructor */
    public InkaUeberwachungswert(
        InkaUeberwachungswertId id, Integer parameterVer, String gemeindekennzahl, Integer gemeindeVer, Integer uebergabestelleLfdNr, Integer uebergabestelleVer, Integer messstelleVer, Boolean selbstAmtlJn, Integer ueberwachungswertVer, Calendar gueltigVon, Calendar gueltigBis, Calendar aenderungsDatum, Calendar erfassungsDatum, Integer historienNr, Boolean istAktuellJn, Integer genehmigungNr, Integer genehmigungVer, Integer anzJahr, Double uewert, Double uewertObergr, Double uewertUntergr, Double jahresfracht) {
        this.id = id;
        this.parameterVer = parameterVer;
        this.gemeindekennzahl = gemeindekennzahl;
        this.gemeindeVer = gemeindeVer;
        this.uebergabestelleLfdNr = uebergabestelleLfdNr;
        this.uebergabestelleVer = uebergabestelleVer;
        this.messstelleVer = messstelleVer;
        this.selbstAmtlJn = selbstAmtlJn;
        this.ueberwachungswertVer = ueberwachungswertVer;
        this.gueltigVon = gueltigVon;
        this.gueltigBis = gueltigBis;
        this.aenderungsDatum = aenderungsDatum;
        this.erfassungsDatum = erfassungsDatum;
        this.historienNr = historienNr;
        this.istAktuellJn = istAktuellJn;
        this.genehmigungNr = genehmigungNr;
        this.genehmigungVer = genehmigungVer;
        this.anzJahr = anzJahr;
        this.uewert = uewert;
        this.uewertObergr = uewertObergr;
        this.uewertUntergr = uewertUntergr;
        this.jahresfracht = jahresfracht;
    }

    /* Setter and getter methods */
    public InkaUeberwachungswertId getId() {
        return this.id;
    }

    public void setId(InkaUeberwachungswertId id) {
        this.id = id;
    }

    public Integer getParameterVer() {
        return this.parameterVer;
    }

    public void setParameterVer(Integer parameterVer) {
        this.parameterVer = parameterVer;
    }

    public String getGemeindekennzahl() {
        return this.gemeindekennzahl;
    }

    public void setGemeindekennzahl(String gemeindekennzahl) {
        this.gemeindekennzahl = gemeindekennzahl;
    }

    public Integer getGemeindeVer() {
        return this.gemeindeVer;
    }

    public void setGemeindeVer(Integer gemeindeVer) {
        this.gemeindeVer = gemeindeVer;
    }

    public Integer getUebergabestelleLfdNr() {
        return this.uebergabestelleLfdNr;
    }

    public void setUebergabestelleLfdNr(Integer uebergabestelleLfdNr) {
        this.uebergabestelleLfdNr = uebergabestelleLfdNr;
    }

    public Integer getUebergabestelleVer() {
        return this.uebergabestelleVer;
    }

    public void setUebergabestelleVer(Integer uebergabestelleVer) {
        this.uebergabestelleVer = uebergabestelleVer;
    }

    public Integer getMessstelleVer() {
        return this.messstelleVer;
    }

    public void setMessstelleVer(Integer messstelleVer) {
        this.messstelleVer = messstelleVer;
    }

    public Boolean getSelbstAmtlJn() {
        return this.selbstAmtlJn;
    }

    public void setSelbstAmtlJn(Boolean selbstAmtlJn) {
        this.selbstAmtlJn = selbstAmtlJn;
    }

    public Integer getUeberwachungswertVer() {
        return this.ueberwachungswertVer;
    }

    public void setUeberwachungswertVer(Integer ueberwachungswertVer) {
        this.ueberwachungswertVer = ueberwachungswertVer;
    }

    public Calendar getGueltigVon() {
        return this.gueltigVon;
    }

    public void setGueltigVon(Calendar gueltigVon) {
        this.gueltigVon = gueltigVon;
    }

    public Calendar getGueltigBis() {
        return this.gueltigBis;
    }

    public void setGueltigBis(Calendar gueltigBis) {
        this.gueltigBis = gueltigBis;
    }

    public Calendar getAenderungsDatum() {
        return this.aenderungsDatum;
    }

    public void setAenderungsDatum(Calendar aenderungsDatum) {
        this.aenderungsDatum = aenderungsDatum;
    }

    public Calendar getErfassungsDatum() {
        return this.erfassungsDatum;
    }

    public void setErfassungsDatum(Calendar erfassungsDatum) {
        this.erfassungsDatum = erfassungsDatum;
    }

    public Integer getHistorienNr() {
        return this.historienNr;
    }

    public void setHistorienNr(Integer historienNr) {
        this.historienNr = historienNr;
    }

    public Boolean getIstAktuellJn() {
        return this.istAktuellJn;
    }

    public void setIstAktuellJn(Boolean istAktuellJn) {
        this.istAktuellJn = istAktuellJn;
    }

    public Integer getGenehmigungNr() {
        return this.genehmigungNr;
    }

    public void setGenehmigungNr(Integer genehmigungNr) {
        this.genehmigungNr = genehmigungNr;
    }

    public Integer getGenehmigungVer() {
        return this.genehmigungVer;
    }

    public void setGenehmigungVer(Integer genehmigungVer) {
        this.genehmigungVer = genehmigungVer;
    }

    public Integer getAnzJahr() {
        return this.anzJahr;
    }

    public void setAnzJahr(Integer anzJahr) {
        this.anzJahr = anzJahr;
    }

    public Double getUewert() {
        return this.uewert;
    }

    public void setUewert(Double uewert) {
        this.uewert = uewert;
    }

    public Double getUewertObergr() {
        return this.uewertObergr;
    }

    public void setUewertObergr(Double uewertObergr) {
        this.uewertObergr = uewertObergr;
    }

    public Double getUewertUntergr() {
        return this.uewertUntergr;
    }

    public void setUewertUntergr(Double uewertUntergr) {
        this.uewertUntergr = uewertUntergr;
    }

    public Double getJahresfracht() {
        return this.jahresfracht;
    }

    public void setJahresfracht(Double jahresfracht) {
        this.jahresfracht = jahresfracht;
    }

    /**
     * Get a string representation for debugging
     * @return String
     */
    public String toDebugString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append(getClass().getSimpleName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
        buffer.append("id").append("='").append(getId()).append("' ");
        buffer.append("parameterVer").append("='").append(getParameterVer()).append("' ");
        buffer.append("gemeindekennzahl").append("='").append(getGemeindekennzahl()).append("' ");
        buffer.append("gemeindeVer").append("='").append(getGemeindeVer()).append("' ");
        buffer.append("uebergabestelleLfdNr").append("='").append(getUebergabestelleLfdNr()).append("' ");
        buffer.append("uebergabestelleVer").append("='").append(getUebergabestelleVer()).append("' ");
        buffer.append("messstelleVer").append("='").append(getMessstelleVer()).append("' ");
        buffer.append("selbstAmtlJn").append("='").append(getSelbstAmtlJn()).append("' ");
        buffer.append("ueberwachungswertVer").append("='").append(getUeberwachungswertVer()).append("' ");
        buffer.append("gueltigVon").append("='").append(getGueltigVon()).append("' ");
        buffer.append("gueltigBis").append("='").append(getGueltigBis()).append("' ");
        buffer.append("aenderungsDatum").append("='").append(getAenderungsDatum()).append("' ");
        buffer.append("erfassungsDatum").append("='").append(getErfassungsDatum()).append("' ");
        buffer.append("historienNr").append("='").append(getHistorienNr()).append("' ");
        buffer.append("istAktuellJn").append("='").append(getIstAktuellJn()).append("' ");
        buffer.append("genehmigungNr").append("='").append(getGenehmigungNr()).append("' ");
        buffer.append("genehmigungVer").append("='").append(getGenehmigungVer()).append("' ");
        buffer.append("anzJahr").append("='").append(getAnzJahr()).append("' ");
        buffer.append("uewert").append("='").append(getUewert()).append("' ");
        buffer.append("uewertObergr").append("='").append(getUewertObergr()).append("' ");
        buffer.append("uewertUntergr").append("='").append(getUewertUntergr()).append("' ");
        buffer.append("jahresfracht").append("='").append(getJahresfracht()).append("' ");
        buffer.append("]");

        return buffer.toString();
    }

    /**
     * Merge (save or update) a detached instance
     * @param detachedInstance the instance to merge
     * @return <code>InkaUeberwachungswert</code> the merged instance,
     *         if everything went okay,
     *         <code>null</code> otherwise
     */
    public static InkaUeberwachungswert merge(InkaUeberwachungswert detachedInstance) {
        log.debug("Merging InkaUeberwachungswert instance " + detachedInstance);
        return (InkaUeberwachungswert) new DatabaseAccess().merge(detachedInstance);
    }

    /**
     * Merge (save or update) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean merge() {
        return InkaUeberwachungswert.merge(this).equals(this);
    }

    /**
     * Delete (mark as deleted) a detached instance
     * @param detachedInstance the instance to delete
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public static boolean delete(InkaUeberwachungswert detachedInstance) {
        log.debug("Deleting InkaUeberwachungswert instance " + detachedInstance);
        return new DatabaseAccess().delete(detachedInstance);
    }

    /**
     * Delete (mark as deleted) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean delete() {
        return InkaUeberwachungswert.delete(this);
    }

    /**
     * Find an <code>InkaUeberwachungswert</code> instance by its primary key
     * @param id the primary key value
     * @return <code>InkaUeberwachungswert</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static InkaUeberwachungswert findById(InkaUeberwachungswertId id) {
        log.debug("Getting InkaUeberwachungswert instance with id: " + id);
        return (InkaUeberwachungswert)
            new DatabaseAccess().get(InkaUeberwachungswert.class, id);
    }

    /**
     * Get a list of all <code>InkaUeberwachungswert</code>
     * @return <code>List&lt;InkaUeberwachungswert&gt;</code>
     *         all <code>InkaUeberwachungswert</code>
     */
    public static List<InkaUeberwachungswert> getAll() {
        return DatabaseQuery.getAll(new InkaUeberwachungswert());
    }

    /**
     * As we can not generate this bit of code completely
     * (ordering of the parameters is the main problem),
     * we jump to not generated code.
     * @return HistoryObject (the corresponding service type to InkaUeberwachungswert)
     */
    public HistoryObject toServiceType() {
        return DatabaseTipi.toServiceTypeForClass(this);
    }

    /* Custom code goes below here! */

}
