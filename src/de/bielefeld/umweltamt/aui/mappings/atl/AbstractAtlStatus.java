/*
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration.
 *
 * Created Wed Feb 16 15:12:00 CET 2005 by MyEclipse Hibernate Tool.
 */
package de.bielefeld.umweltamt.aui.mappings.atl;

import java.io.Serializable;

/**
 * A class that represents a row in the ATL_STATUS table. 
 * You can customize the behavior of this class by editing the class, {@link AtlStatus}.
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized * by MyEclipse Hibernate tool integration.
 */
public abstract class AbstractAtlStatus 
    implements Serializable
{
    /** The cached hash code value for this instance.  Settting to 0 triggers re-calculation. */
    private int hashValue = 0;

    /** The composite primary key value. */
    private java.lang.Integer id;

    /** The value of the simple bezeichnung property. */
    private java.lang.String bezeichnung;

    /**
     * Simple constructor of AbstractAtlStatus instances.
     */
    public AbstractAtlStatus()
    {
    }

    /**
     * Constructor of AbstractAtlEinheiten instances given a simple primary key.
     * @param id
     */
    public AbstractAtlStatus(java.lang.Integer id)
    {
        this.setId(id);
    }

    /**
     * Return the simple primary key value that identifies this object.
     * @return java.lang.Integer
     */
    public java.lang.Integer getId()
    {
        return id;
    }

    /**
     * Set the simple primary key value that identifies this object.
     * @param id
     */
    public void setId(java.lang.Integer id)
    {
        this.hashValue = 0;
        this.id = id;
    }

    /**
     * Return the value of the BEZEICHNUNG column.
     * @return java.lang.String
     */
    public java.lang.String getBezeichnung()
    {
        return this.bezeichnung;
    }

    /**
     * Set the value of the BEZEICHNUNG column.
     * @param bezeichnung
     */
    public void setBezeichnung(java.lang.String bezeichnung)
    {
        this.bezeichnung = bezeichnung;
    }

    /**
     * Implementation of the equals comparison on the basis of equality of the primary key values.
     * @param rhs
     * @return boolean
     */
    public boolean equals(Object rhs)
    {
        if (rhs == null)
            return false;
        if (! (rhs instanceof AtlEinheiten))
            return false;
        AtlEinheiten that = (AtlEinheiten) rhs;
        if (this.getId() != null && that.getId() != null)
        {
            if (! this.getId().equals(that.getId()))
            {
                return false;
            }
        }
        return true;
    }

    /**
     * Implementation of the hashCode method conforming to the Bloch pattern with
     * the exception of array properties (these are very unlikely primary key types).
     * @return int
     */
    public int hashCode()
    {
        if (this.hashValue == 0)
        {
            int result = 17;
            int idValue = this.getId() == null ? 0 : this.getId().hashCode();
            result = result * 37 + idValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }
}
