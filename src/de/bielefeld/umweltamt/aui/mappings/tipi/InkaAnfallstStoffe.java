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
 * A class that represents a row in the InkaAnfallstStoffe database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class InkaAnfallstStoffe  implements java.io.Serializable {

    /** Generated serialVersionUID for Serializable interface */
    private static final long serialVersionUID = DatabaseTipi.serialVersionUIDForInkaAnfallstStoffe;

    /* Primary key, foreign keys (relations) and table columns */
    private InkaAnfallstStoffeId id;
    private Integer anfallstelleVer;
    private Integer stoffVer;
    private Integer anfallstStoffeVer;
    private Calendar gueltigVon;
    private Calendar gueltigBis;
    private Calendar aenderungsDatum;
    private Calendar erfassungsDatum;
    private Integer historienNr;
    private Boolean istAktuellJn;

    /** Logging */
    private static final AuikLogger log = AuikLogger.getLogger();

    /** Default constructor */
    public InkaAnfallstStoffe() {
        // This place is intentionally left blank.
    }

    /** Minimal constructor */
    public InkaAnfallstStoffe(
        InkaAnfallstStoffeId id) {
        this.id = id;
    }

    /** Full constructor */
    public InkaAnfallstStoffe(
        InkaAnfallstStoffeId id, Integer anfallstelleVer, Integer stoffVer, Integer anfallstStoffeVer, Calendar gueltigVon, Calendar gueltigBis, Calendar aenderungsDatum, Calendar erfassungsDatum, Integer historienNr, Boolean istAktuellJn) {
        this.id = id;
        this.anfallstelleVer = anfallstelleVer;
        this.stoffVer = stoffVer;
        this.anfallstStoffeVer = anfallstStoffeVer;
        this.gueltigVon = gueltigVon;
        this.gueltigBis = gueltigBis;
        this.aenderungsDatum = aenderungsDatum;
        this.erfassungsDatum = erfassungsDatum;
        this.historienNr = historienNr;
        this.istAktuellJn = istAktuellJn;
    }

    /* Setter and getter methods */
    public InkaAnfallstStoffeId getId() {
        return this.id;
    }

    public void setId(InkaAnfallstStoffeId id) {
        this.id = id;
    }

    public Integer getAnfallstelleVer() {
        return this.anfallstelleVer;
    }

    public void setAnfallstelleVer(Integer anfallstelleVer) {
        this.anfallstelleVer = anfallstelleVer;
    }

    public Integer getStoffVer() {
        return this.stoffVer;
    }

    public void setStoffVer(Integer stoffVer) {
        this.stoffVer = stoffVer;
    }

    public Integer getAnfallstStoffeVer() {
        return this.anfallstStoffeVer;
    }

    public void setAnfallstStoffeVer(Integer anfallstStoffeVer) {
        this.anfallstStoffeVer = anfallstStoffeVer;
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

    /**
     * Get a string representation for debugging
     * @return String
     */
    public String toDebugString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append(getClass().getSimpleName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
        buffer.append("id").append("='").append(getId()).append("' ");
        buffer.append("anfallstelleVer").append("='").append(getAnfallstelleVer()).append("' ");
        buffer.append("stoffVer").append("='").append(getStoffVer()).append("' ");
        buffer.append("anfallstStoffeVer").append("='").append(getAnfallstStoffeVer()).append("' ");
        buffer.append("gueltigVon").append("='").append(getGueltigVon()).append("' ");
        buffer.append("gueltigBis").append("='").append(getGueltigBis()).append("' ");
        buffer.append("aenderungsDatum").append("='").append(getAenderungsDatum()).append("' ");
        buffer.append("erfassungsDatum").append("='").append(getErfassungsDatum()).append("' ");
        buffer.append("historienNr").append("='").append(getHistorienNr()).append("' ");
        buffer.append("istAktuellJn").append("='").append(getIstAktuellJn()).append("' ");
        buffer.append("]");

        return buffer.toString();
    }

    /**
     * Merge (save or update) a detached instance
     * @param detachedInstance the instance to merge
     * @return <code>InkaAnfallstStoffe</code> the merged instance,
     *         if everything went okay,
     *         <code>null</code> otherwise
     */
    public static InkaAnfallstStoffe merge(InkaAnfallstStoffe detachedInstance) {
        log.debug("Merging InkaAnfallstStoffe instance " + detachedInstance);
        return (InkaAnfallstStoffe) new DatabaseAccess().merge(detachedInstance);
    }

    /**
     * Merge (save or update) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean merge() {
        return InkaAnfallstStoffe.merge(this).equals(this);
    }

    /**
     * Delete (mark as deleted) a detached instance
     * @param detachedInstance the instance to delete
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public static boolean delete(InkaAnfallstStoffe detachedInstance) {
        log.debug("Deleting InkaAnfallstStoffe instance " + detachedInstance);
        return new DatabaseAccess().delete(detachedInstance);
    }

    /**
     * Delete (mark as deleted) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean delete() {
        return InkaAnfallstStoffe.delete(this);
    }

    /**
     * Find an <code>InkaAnfallstStoffe</code> instance by its primary key
     * @param id the primary key value
     * @return <code>InkaAnfallstStoffe</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static InkaAnfallstStoffe findById(InkaAnfallstStoffeId id) {
        log.debug("Getting InkaAnfallstStoffe instance with id: " + id);
        return (InkaAnfallstStoffe)
            new DatabaseAccess().get(InkaAnfallstStoffe.class, id);
    }

    /**
     * Get a list of all <code>InkaAnfallstStoffe</code>
     * @return <code>List&lt;InkaAnfallstStoffe&gt;</code>
     *         all <code>InkaAnfallstStoffe</code>
     */
    public static List<InkaAnfallstStoffe> getAll() {
        return DatabaseQuery.getAll(new InkaAnfallstStoffe());
    }

    /**
     * As we can not generate this bit of code completely
     * (ordering of the parameters is the main problem),
     * we jump to not generated code.
     * @return HistoryObject (the corresponding service type to InkaAnfallstStoffe)
     */
    public HistoryObject toServiceType() {
        return DatabaseTipi.toServiceTypeForClass(this);
    }

    /* Custom code goes below here! */

}
