/*
 * Created Wed Feb 16 15:12:03 CET 2005 by MyEclipse Hibernate Tool.
 */
package de.bielefeld.umweltamt.aui.mappings.atl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import de.bielefeld.umweltamt.aui.AUIKataster;
import de.bielefeld.umweltamt.aui.HibernateSessionFactory;

/**
 * A class that represents a row in the 'ATL_SIELHAUT' table. 
 * This class may be customized as it is never re-generated 
 * after being created.
 */
public class AtlSielhaut
    extends AbstractAtlSielhaut
    implements Serializable
{

    /**
     * Simple constructor of AtlSielhaut instances.
     */
    public AtlSielhaut()
    {
    	//AUIKataster.debugOutput("Neues Sielhaut-Objekt", "AtlSielhaut");
    	
//    	setSielhaut(true);
//    	setAlarmplan(false);
//    	setNachprobe(false);
//    	setBSchlammprobe(false);
    	
    	Double zero = new Double(0.0);
    	setRechtswert(zero);
    	setHochwert(zero);
    }

    /**
     * Constructor of AtlSielhaut instances given a simple primary key.
     * @param id
     */
    public AtlSielhaut(java.lang.Integer id)
    {
        super(id);
    }

    /* Add customized code below */

    public String toString() {
		return "[Sielhaut:"+getId()+", " + getBezeichnung()+"]";
	}
    
    public static List findPunkte(String suche) {
    	String sucheF = suche.toLowerCase().trim() + "%";
    	
    	List punkte;
		try {
			Session session = HibernateSessionFactory.currentSession();
			
			punkte = session.createQuery(
					"from AtlSielhaut as sp where " +
					"lower(sp.bezeichnung) like ? " +
					"order by sp.bezeichnung")
					.setString(0, sucheF)
					.list();
			
		} catch (HibernateException e) {
			throw new RuntimeException("Datenbank-Fehler", e);
		} finally {
//			HibernateSessionFactory.closeSession();
		}
    	return punkte;
    }
    
    public static boolean saveSielhautPunkt(AtlSielhaut spunkt) {
    	boolean success;
    	
    	Transaction tx = null;
    	try {
			Session session = HibernateSessionFactory.currentSession();
			tx = session.beginTransaction();
			
			session.saveOrUpdate(spunkt);
			tx.commit();
			
			success = true;
			AUIKataster.debugOutput("Sielhautpunkt " + spunkt + " erfolgreich gespeichert!", "AtlSielhaut");
		} catch (HibernateException e) {
			success = false;
			e.printStackTrace();
			//throw new RuntimeException("Datenbank-Fehler (AtlSielhaut)", e);
			if (tx != null) {
				try {
					tx.rollback();
				} catch (HibernateException e1) {
					throw new RuntimeException("Datenbank-Fehler: tx.rollback() nicht m�glich! (AtlSielhaut)", e);
				}
			}
		} finally {
//			HibernateSessionFactory.closeSession();
		}
    	
    	return success;
    }
}
