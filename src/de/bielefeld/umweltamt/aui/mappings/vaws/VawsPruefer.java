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
 * A class that represents a row in the VawsPruefer database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class VawsPruefer  implements java.io.Serializable {

    /** Generated serialVersionUID for Serializable interface */
    private static final long serialVersionUID =
        DatabaseSerialVersionUID.forVawsPruefer;
    
    /* Primary key, foreign keys (relations) and table columns */
    private Integer id;
    private String pruefer;
    private boolean enabled;
    private boolean deleted;

    /** Logging */
    private static final AuikLogger log = AuikLogger.getLogger();

    /** Default constructor */
    public VawsPruefer() {
        // This place is intentionally left blank.
    }

    /** Minimal constructor */
    public VawsPruefer(
        Integer id, boolean enabled, boolean deleted) {
        this.id = id;
        this.enabled = enabled;
        this.deleted = deleted;
    }

    /** Full constructor */
    public VawsPruefer(
        Integer id, String pruefer, boolean enabled, boolean deleted) {
        this.id = id;
        this.pruefer = pruefer;
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

    public String getPruefer() {
        return this.pruefer;
    }

    public void setPruefer(String pruefer) {
        this.pruefer = pruefer;
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
     * Get a string representation for the gui
     * @return String
     */
    public String toGuiString() {
        return getPruefer();
    }

    /**
     * Get a string representation for debugging
     * @return String
     */
    public String toDebugString() {
        StringBuffer buffer = new StringBuffer();
        
        buffer.append(getClass().getSimpleName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
        buffer.append("id").append("='").append(getId()).append("' ");			
        buffer.append("pruefer").append("='").append(getPruefer()).append("' ");			
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
        if (!(other instanceof VawsPruefer)) return false;
        return (this.getId().equals(
            ((VawsPruefer) other).getId()));
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
     * @return <code>VawsPruefer</code> the merged instance,
     *         if everything went okay,
     *         <code>null</code> otherwise
     */
    public static VawsPruefer merge(VawsPruefer detachedInstance) {
        log.debug("Merging VawsPruefer instance " + detachedInstance);
        return (VawsPruefer) new DatabaseAccess().merge(detachedInstance);
    }

    /**
     * Merge (save or update) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean merge() {
        VawsPruefer saved = VawsPruefer.merge(this);
        if (saved == null) {
            return false;
        } else {
            this.copy(saved);
            return true;
        }
    }

    /**
     * Update this VawsPruefer with its new values.<br>
     * This is meant to be used after merging!
     * @param copy VawsPruefer
     */
    private void copy(VawsPruefer copy) {
        this.id = copy.getId();            
        this.pruefer = copy.getPruefer();            
        this.enabled = copy.isEnabled();            
        this.deleted = copy.isDeleted();            
    }    

    /**
     * Delete (mark as deleted) a detached instance
     * @param detachedInstance the instance to delete
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public static boolean delete(VawsPruefer detachedInstance) {
        log.debug("Deleting VawsPruefer instance " + detachedInstance);
        return new DatabaseAccess().delete(detachedInstance);
    }

    /**
     * Delete (mark as deleted) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean delete() {
        return VawsPruefer.delete(this);
    }

    /**
     * Find an <code>VawsPruefer</code> instance by its primary key
     * @param id the primary key value
     * @return <code>VawsPruefer</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static VawsPruefer findById(java.lang.Integer id) {
        log.debug("Getting VawsPruefer instance with id: " + id);
        return (VawsPruefer)
            new DatabaseAccess().get(VawsPruefer.class, id);
    }

    /**
     * Get a list of all <code>VawsPruefer</code>
     * @return <code>List&lt;VawsPruefer&gt;</code>
     *         all <code>VawsPruefer</code>
     */
    public static List<VawsPruefer> getAll() {
        return DatabaseQuery.getAll(new VawsPruefer());
    }

    /* Custom code goes below here! */

}
