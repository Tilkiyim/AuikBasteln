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
 * Created Tue Sep 06 14:47:00 CEST 2005 by MyEclipse Hibernate Tool.
 */
package de.bielefeld.umweltamt.aui.mappings.vaws;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import de.bielefeld.umweltamt.aui.AUIKataster;
import de.bielefeld.umweltamt.aui.HibernateSessionFactory;
import de.bielefeld.umweltamt.aui.utils.AuikLogger;

/**
 * A class that represents a row in the 'VAWS_KONTROLLEN' table.
 * This class may be customized as it is never re-generated
 * after being created.
 */
public class VawsKontrollen
    extends AbstractVawsKontrollen
    implements Serializable
{
	/** Logging */
    private static final Logger log = AuikLogger.getLogger();

    /**
     * Simple constructor of VawsKontrollen instances.
     */
    public VawsKontrollen() {
    }

    /**
     * Constructor of VawsKontrollen instances given a simple primary key.
     * @param kontrollid
     */
    public VawsKontrollen(java.lang.Integer kontrollid) {
        super(kontrollid);
    }

    // Statischer Teil:

    /**
     * Liefert alle Kontroll-Einträge deren "Nächste Prüfung" in der Vergangenheit
     * liegt und die nicht abgeschlossen sind.
     * @return Eine Liste mit VawsKontrollen-Objekten.
     */
    public static List getAuswertung() {
        List kontrollen;
        String query = "from VawsKontrollen vk where " +
                "vk.naechstepruefung < ? " +
                "and vk.pruefungabgeschlossen = ? " +
                "order by vk.naechstepruefung, vk.vawsFachdaten";

        try {
            Session session = HibernateSessionFactory.currentSession();
            kontrollen = session.createQuery(
                    query)
                    .setDate(0, new Date())
                    .setBoolean(1, false)
//                    .setCacheable(true)
                    .list();

        } catch (HibernateException e) {
            throw new RuntimeException("Datenbank-Fehler", e);
        } finally {
            HibernateSessionFactory.closeSession();
        }

        return kontrollen;
    }

    /**
     * Liefert alle Kontroll-Einträge zu einem bestimmten
     * VawsFachdatensatz.
     * @param fachdaten Der Fachdatensatz.
     * @return Eine Liste mit VawsKontrollen-Objekten.
     */
    public static List getKontrollen(VawsFachdaten fachdaten) {
        List kontrollen;

        if (fachdaten.getBehaelterId() == null)
        {
            kontrollen = new ArrayList();
        } else {
            try {
                Session session = HibernateSessionFactory.currentSession();

                kontrollen = session.createQuery(
                        "from VawsKontrollen vk where " +
                        "vk.vawsFachdaten = ? " +
                        "order by vk.pruefungabgeschlossen desc, vk.pruefdatum, vk.naechstepruefung")
                        .setEntity(0, fachdaten)
                        .list();

                log.debug(kontrollen.size() + " Kontrollen-Einträge für FD "
                		+ fachdaten + " gefunden!");
            } catch (HibernateException e) {
                throw new RuntimeException("Datenbank-Fehler", e);
            } finally {
                HibernateSessionFactory.closeSession();
            }
        }

        return kontrollen;
    }

    /**
     * Speichert einen VAWS-Kontrollen-Eintrag in der Datenbank.
     * @param kontrolle Der zu speichernde Datensatz.
     * @return <code>true</code>, falls beim Speichern kein Fehler auftritt, sonst <code>false</code>.
     */
    public static boolean saveKontrolle(VawsKontrollen kontrolle) {
        boolean saved;

        Transaction tx = null;
        try {
            Session session = HibernateSessionFactory.currentSession();
            tx = session.beginTransaction();
            session.saveOrUpdate(kontrolle);
            tx.commit();
            saved = true;
        } catch (HibernateException e) {
            saved = false;
            e.printStackTrace();
            if (tx != null) {
                try {
                    tx.rollback();
                } catch (HibernateException e1) {
                    AUIKataster.handleDBException(e1, "VawsKontrollen.save", false);
                }
            }
        } finally {
            HibernateSessionFactory.closeSession();
        }

        return saved;
    }

    /**
     * Löscht einen vorhandenen Datensatz aus der Datenbank.
     * @param kontrolle Der Datensatz, der gelöscht werden soll.
     * @return <code>true</code>, wenn der Datensatz gelöscht wurde oder
     * <code>false</code> falls dabei ein Fehler auftrat (z.B. der Datensatz
     * nicht in der Datenbank existiert).
     */
    public static boolean removeKontrolle(VawsKontrollen kontrolle) {
        boolean removed;

        Transaction tx = null;
        try {
            Session session = HibernateSessionFactory.currentSession();
            tx = session.beginTransaction();
            session.delete(kontrolle);
            tx.commit();
            removed = true;
        } catch (HibernateException e) {
            removed = false;
            e.printStackTrace();
            if (tx != null) {
                try {
                    tx.rollback();
                } catch (HibernateException e1) {
                    AUIKataster.handleDBException(e1, "VawsKontrollen.remove", false);
                }
            }
        } finally {
            HibernateSessionFactory.closeSession();
        }

        return removed;
    }
}
