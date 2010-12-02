/*
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration.
 *
 * Created Wed Feb 16 15:12:03 CET 2005 by MyEclipse Hibernate Tool.
 */
package de.bielefeld.umweltamt.aui.mappings.atl;

import java.io.Serializable;
import java.util.Set;

import de.bielefeld.umweltamt.aui.mappings.basis.BasisObjekt;

/**
 * A class that represents a row in the ATL_PROBEPKT table. 
 * You can customize the behavior of this class by editing the class, {@link AtlProbepkt}.
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized * by MyEclipse Hibernate tool integration.
 */
public abstract class AbstractAtlProbepkt 
    implements Serializable
{
    /** The cached hash code value for this instance.  Settting to 0 triggers re-calculation. */
    private int hashValue = 0;

    /** The composite primary key value. */
    private java.lang.Integer objektid;

    /** The value of the simple atlFirmen property. */
    private Integer atlFirmen;

    /** The value of the atlKlaeranlagen association. */
    private AtlKlaeranlagen atlKlaeranlagen;

    /** The value of the atlProbeart association. */
    private AtlProbeart atlProbeart;
    
    /** The value of the basisObjekt association. */
    private BasisObjekt basisObjekt;

    /** The value of the atlSielhaut association. */
    private AtlSielhaut atlSielhaut;

    /** The value of the simple beschreibung property. */
    private java.lang.String beschreibung;
    
    /** The value of the simple nummer property. */
    private java.lang.Integer nummer;
    
    private Set atlProbenahmen;

    /**
     * Simple constructor of AbstractAtlProbepkt instances.
     */
    public AbstractAtlProbepkt()
    {
    }

    /**
     * Constructor of AbstractAtlProbepkt instances given a simple primary key.
     * @param pktId
     */
    public AbstractAtlProbepkt(java.lang.Integer objektid)
    {
        this.setObjektid(objektid);
    }

    /**
     * Return the simple primary key value that identifies this object.
     * @return java.lang.Integer
     */
    public java.lang.Integer getObjektid()
    {
        return objektid;
    }

    /**
     * Set the simple primary key value that identifies this object.
     * @param pktId
     */
    public void setObjektid(java.lang.Integer objektid)
    {
        this.hashValue = 0;
        this.objektid = objektid;
    }

    /**
     * Return the value of the FIRMEN_ID column.
     * @return AtlFirmen
     */
    public Integer getAtlFirmen()
    {
        return this.atlFirmen;
    }

    /**
     * Set the value of the FIRMEN_ID column.
     * @param atlFirmen
     */
    public void setAtlFirmen(Integer atlFirmen)
    {
        this.atlFirmen = atlFirmen;
    }

    /**
     * Return the value of the SIELHAUT_ID column.
     * @return AtlSielhaut
     */
    public AtlSielhaut getAtlSielhaut()
    {
        return this.atlSielhaut;
    }

    /**
     * Set the value of the SIELHAUT_ID column.
     * @param atlSielhaut
     */
    public void setAtlSielhaut(AtlSielhaut atlSielhaut)
    {
        this.atlSielhaut = atlSielhaut;
    }

    /**
     * Return the value of the KA_ID column.
     * @return AtlKlaeranlagen
     */
    public AtlKlaeranlagen getAtlKlaeranlagen()
    {
        return this.atlKlaeranlagen;
    }

    /**
     * Set the value of the KA_ID column.
     * @param atlKlaeranlagen
     */
    public void setAtlKlaeranlagen(AtlKlaeranlagen atlKlaeranlagen)
    {
        this.atlKlaeranlagen = atlKlaeranlagen;
    }

    /**
     * Return the value of the ART_ID column.
     * @return AtlProbeart
     */
    public AtlProbeart getAtlProbeart()
    {
        return this.atlProbeart;
    }

    /**
     * Set the value of the ART_ID column.
     * @param atlProbeart
     */
    public void setAtlProbeart(AtlProbeart atlProbeart)
    {
        this.atlProbeart = atlProbeart;
    }
    
    /**
     * Return the value of the OBJEKT_ID column.
     * @return BasisObjekt
     */
	public BasisObjekt getBasisObjekt() {
		return basisObjekt;
	}
	
	/**
     * Set the value of the OBJEKT_ID column.
     * @param basisObjekt
     */
	public void setBasisObjekt(BasisObjekt basisObjekt) {
		this.basisObjekt = basisObjekt;
	}
	
    /**
     * Return the value of the BESCHREIBUNG column.
     * @return java.lang.String
     */
    public java.lang.String getBeschreibung()
    {
        return this.beschreibung;
    }

    /**
     * Set the value of the BESCHREIBUNG column.
     * @param beschreibung
     */
    public void setBeschreibung(java.lang.String beschreibung)
    {
        this.beschreibung = beschreibung;
    }
    
    /**
     * Return the value of the NR_PROBEPKT column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getNummer()
    {
        return this.nummer;
    }

    /**
     * Set the value of the NR_PROBEPKT column.
     * @param nummer
     */
    public void setNummer(java.lang.Integer nummer)
    {
        this.nummer = nummer;
    }

    /**
     * Return the set of the AtlProbenahmen.
     * @return AtlProbenahmen
     */
    public Set getAtlProbenahmen()
    {
        return this.atlProbenahmen;
    }

    /**
     * Set the set of the AtlProbenahmen.
     * @param atlProbenahmen
     */
    public void setAtlProbenahmen(Set atlProbenahmen)
    {
        this.atlProbenahmen = atlProbenahmen;
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
        if (! (rhs instanceof AtlProbepkt))
            return false;
        AtlProbepkt that = (AtlProbepkt) rhs;
        if (this.getObjektid() != null && that.getObjektid() != null)
        {
            if (! this.getObjektid().equals(that.getObjektid()))
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
            int pktIdValue = this.getObjektid() == null ? 0 : this.getObjektid().hashCode();
            result = result * 37 + pktIdValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }
}
