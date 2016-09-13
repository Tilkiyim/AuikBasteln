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

package de.bielefeld.umweltamt.aui.mappings.atl;

import de.bielefeld.umweltamt.aui.mappings.DatabaseAccess;
import de.bielefeld.umweltamt.aui.mappings.DatabaseClassToString;
import de.bielefeld.umweltamt.aui.mappings.DatabaseQuery;
import de.bielefeld.umweltamt.aui.mappings.DatabaseSerialVersionUID;
import de.bielefeld.umweltamt.aui.utils.AuikLogger;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A class that represents a row in the AtlEinheiten database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class AtlEinheiten  implements java.io.Serializable {

    /** Generated serialVersionUID for Serializable interface */
    private static final long serialVersionUID =
        DatabaseSerialVersionUID.forAtlEinheiten;
    
    /* Primary key, foreign keys (relations) and table columns */
    private Integer id;
    private String bezeichnung;
    private boolean enabled;
    private boolean deleted;
    private Integer deaEinheitenMasseinheitenNr;
    private Set<AtlAnalyseposition> atlAnalysepositions = new HashSet<AtlAnalyseposition>(0);
    private Set<AtlMetaParameter> atlMetaParameters = new HashSet<AtlMetaParameter>(0);

    /** Logging */
    private static final AuikLogger log = AuikLogger.getLogger();

    /** Default constructor */
    public AtlEinheiten() {
        // This place is intentionally left blank.
    }

    /** Minimal constructor */
    public AtlEinheiten(
        Integer id, boolean enabled, boolean deleted) {
        this.id = id;
        this.enabled = enabled;
        this.deleted = deleted;
    }

    /** Full constructor */
    public AtlEinheiten(
        Integer id, String bezeichnung, boolean enabled, boolean deleted, Integer deaEinheitenMasseinheitenNr, Set<AtlAnalyseposition> atlAnalysepositions, Set<AtlMetaParameter> atlMetaParameters) {
        this.id = id;
        this.bezeichnung = bezeichnung;
        this.enabled = enabled;
        this.deleted = deleted;
        this.deaEinheitenMasseinheitenNr = deaEinheitenMasseinheitenNr;
        this.atlAnalysepositions = atlAnalysepositions;
        this.atlMetaParameters = atlMetaParameters;
    }

    /* Setter and getter methods */
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBezeichnung() {
        return this.bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
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

    public Integer getDeaEinheitenMasseinheitenNr() {
        return this.deaEinheitenMasseinheitenNr;
    }

    public void setDeaEinheitenMasseinheitenNr(Integer deaEinheitenMasseinheitenNr) {
        this.deaEinheitenMasseinheitenNr = deaEinheitenMasseinheitenNr;
    }

    public Set<AtlAnalyseposition> getAtlAnalysepositions() {
        return this.atlAnalysepositions;
    }

    public void setAtlAnalysepositions(Set<AtlAnalyseposition> atlAnalysepositions) {
        this.atlAnalysepositions = atlAnalysepositions;
    }

    public Set<AtlMetaParameter> getAtlMetaParameters() {
        return this.atlMetaParameters;
    }

    public void setAtlMetaParameters(Set<AtlMetaParameter> atlMetaParameters) {
        this.atlMetaParameters = atlMetaParameters;
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
     * Get a string representation for the gui
     * @return String
     */
    public String toGuiString() {
        return getBezeichnung();
    }

    /**
     * Get a string representation for debugging
     * @return String
     */
    public String toDebugString() {
        StringBuffer buffer = new StringBuffer();
        
        buffer.append(getClass().getSimpleName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
        buffer.append("id").append("='").append(getId()).append("' ");			
        buffer.append("bezeichnung").append("='").append(getBezeichnung()).append("' ");			
        buffer.append("enabled").append("='").append(isEnabled()).append("' ");			
        buffer.append("deleted").append("='").append(isDeleted()).append("' ");			
        buffer.append("deaEinheitenMasseinheitenNr").append("='").append(getDeaEinheitenMasseinheitenNr()).append("' ");			
        buffer.append("atlAnalysepositions").append("='").append(getAtlAnalysepositions()).append("' ");			
        buffer.append("atlMetaParameters").append("='").append(getAtlMetaParameters()).append("' ");			
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
        if (!(other instanceof AtlEinheiten)) return false;
        return (this.getId().equals(
            ((AtlEinheiten) other).getId()));
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
     * @return <code>AtlEinheiten</code> the merged instance,
     *         if everything went okay,
     *         <code>null</code> otherwise
     */
    public static AtlEinheiten merge(AtlEinheiten detachedInstance) {
        log.debug("Merging AtlEinheiten instance " + detachedInstance);
        return (AtlEinheiten) new DatabaseAccess().merge(detachedInstance);
    }

    /**
     * Merge (save or update) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean merge() {
        AtlEinheiten saved = AtlEinheiten.merge(this);
        if (saved == null) {
            return false;
        } else {
            this.copy(saved);
            return true;
        }
    }

    /**
     * Update this AtlEinheiten with its new values.<br>
     * This is meant to be used after merging!
     * @param copy AtlEinheiten
     */
    private void copy(AtlEinheiten copy) {
        this.id = copy.getId();            
        this.bezeichnung = copy.getBezeichnung();            
        this.enabled = copy.isEnabled();            
        this.deleted = copy.isDeleted();            
        this.deaEinheitenMasseinheitenNr = copy.getDeaEinheitenMasseinheitenNr();            
        this.atlAnalysepositions = copy.getAtlAnalysepositions();            
        this.atlMetaParameters = copy.getAtlMetaParameters();            
    }    

    /**
     * Delete (mark as deleted) a detached instance
     * @param detachedInstance the instance to delete
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public static boolean delete(AtlEinheiten detachedInstance) {
        log.debug("Deleting AtlEinheiten instance " + detachedInstance);
        return new DatabaseAccess().delete(detachedInstance);
    }

    /**
     * Delete (mark as deleted) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean delete() {
        return AtlEinheiten.delete(this);
    }

    /**
     * Find an <code>AtlEinheiten</code> instance by its primary key
     * @param id the primary key value
     * @return <code>AtlEinheiten</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static AtlEinheiten findById(java.lang.Integer id) {
        log.debug("Getting AtlEinheiten instance with id: " + id);
        return (AtlEinheiten)
            new DatabaseAccess().get(AtlEinheiten.class, id);
    }

    /**
     * Get a list of all <code>AtlEinheiten</code>
     * @return <code>List&lt;AtlEinheiten&gt;</code>
     *         all <code>AtlEinheiten</code>
     */
    public static List<AtlEinheiten> getAll() {
        return DatabaseQuery.getAll(new AtlEinheiten());
    }

    /* Custom code goes below here! */

}
