/**
 * Copyright 2005-2011, Stadt Bielefeld
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

/*
 * Created Wed Feb 16 15:12:03 CET 2005 by MyEclipse Hibernate Tool.
 */
package de.bielefeld.umweltamt.aui.mappings.atl;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import de.bielefeld.umweltamt.aui.AUIKataster;
import de.bielefeld.umweltamt.aui.HibernateSessionFactory;
import de.bielefeld.umweltamt.aui.mappings.basis.BasisObjekt;
import de.bielefeld.umweltamt.aui.utils.AuikLogger;

/**
 * A class that represents a row in the 'ATL_SIELHAUT' table.
 * This class may be customized as it is never re-generated
 * after being created.
 */
public class AtlSielhaut
    extends AbstractAtlSielhaut
    implements Serializable
{
	/** Logging */
    private static final Logger log = AuikLogger.getLogger();

    /**
     * Simple constructor of AtlSielhaut instances.
     */
    public AtlSielhaut()
    {
        //AUIKataster.debugOutput("Neues SielhautBearbeiten-Objekt", "AtlSielhaut");

//        setSielhaut(true);
//        setAlarmplan(false);
//        setNachprobe(false);
//        setBSchlammprobe(false);

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
        return "[SielhautBearbeiten:"+getId()+", " + getBezeichnung()+"]";
    }

    public static List findPunkte(String suche) {
        String sucheF = suche.toLowerCase().trim() + "%";

        List punkte;
        try {
            Session session = HibernateSessionFactory.currentSession();

            punkte = session.createQuery(
                    "from AtlSielhaut as sp where " +
                    "lower(sp.bezeichnung) like ? " +
                    "order by sp.psielhaut desc, sp.pfirmenprobe desc, sp.bezeichnung")
                    .setString(0, sucheF)
                    .list();

        } catch (HibernateException e) {
            throw new RuntimeException("Datenbank-Fehler", e);
        } finally {
            HibernateSessionFactory.closeSession();
        }
        return punkte;
    }


    public static AtlSielhaut getSielhautByBez(String bezeichnung) {
        AtlSielhaut sielhaut;
String sucheF = bezeichnung.toLowerCase().trim() + "%";

        List punkte;
        try {
            Session session = HibernateSessionFactory.currentSession();

            punkte = session.createQuery(
                    "from AtlSielhaut as sp where " +
                    "lower(sp.bezeichnung) like ? " +
                    "order by sp.psielhaut desc, sp.pfirmenprobe desc, sp.bezeichnung")
                    .setString(0, sucheF)
                    .list();

            if (punkte.size() > 0) {
                sielhaut = (AtlSielhaut) punkte.get(0);

            } else {
                sielhaut = null;
            }
        } catch (HibernateException e) {
            sielhaut = null;
            throw new RuntimeException("Datenbank-Fehler", e);
        } finally {
            HibernateSessionFactory.closeSession();
        }

        return sielhaut;
    }




    /**
     * Lädt ein Objekt aus der Datenbank.
     * @param id Der Primärschlüssel des zu ladenden Objekts.
     * @return  Das BasisObjekt mit dem Primärschlüssel oder <code>null</code>,
     *             falls ein solches nicht gefunden wurde.
     */
    public static AtlSielhaut getSielhaut(Integer id) {
        AtlSielhaut sielhaut;
        try {
            Session session = HibernateSessionFactory.currentSession();
            sielhaut = (AtlSielhaut) session.get(AtlSielhaut.class, id);
            HibernateSessionFactory.closeSession();
        } catch (HibernateException e) {
            sielhaut = null;
        }

        return sielhaut;
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
            log.debug("Sielhautpunkt " + spunkt + " erfolgreich gespeichert!");
        } catch (HibernateException e) {
            success = false;
            e.printStackTrace();
            //throw new RuntimeException("Datenbank-Fehler (AtlSielhaut)", e);
            if (tx != null) {
                try {
                    tx.rollback();
                } catch (HibernateException e1) {
                    throw new RuntimeException("Datenbank-Fehler: tx.rollback() nicht möglich! (AtlSielhaut)", e);
                }
            }
        } finally {
            HibernateSessionFactory.closeSession();
        }

        return success;
    }
}
