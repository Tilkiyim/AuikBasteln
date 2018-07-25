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
import de.bielefeld.umweltamt.aui.mappings.oberflgw.Versickerungsanlage;
import de.bielefeld.umweltamt.aui.utils.AuikLogger;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A class that represents a row in the Einleitungsstelle database table.<br>
 * This class is meant to serve as a model and should be copied into the
 * appropriate package and may be customized below the given mark.
 */
public class Einleitungsstelle  implements java.io.Serializable {

    /** Generated serialVersionUID for Serializable interface */
    private static final long serialVersionUID =
        DatabaseSerialVersionUID.forEinleitungsstelle;
    
    /* Primary key, foreign keys (relations) and table columns */
    private Integer id;
    private Integer objektid;
    private Objekt objekt;
    private Date aktualDat;
    private Date erstellDat;
    private String herkunft;
    private String bezeichnung;
    private String gewaessernameAlias3;
    private String gewaessernameNs;
    private String nadiaId;
    private Date stillgelegtAm;
    private Boolean typIndirekt;
    private Boolean typIndGewDirekt;
    private Boolean typKommTrenn;
    private Boolean typPrivatTrenn;
    private Boolean typSonstige;
    private Boolean typAusserortStrasseneinl;
    private Double stationierungNs3;
    private Double einzugsgebiet;
    private Double stationierungSt3;
    private Integer abgaberelEinl;
    private Integer e32;
    private Integer n32;
    private Integer kanalArtOpt;
    private Integer stationierung3Opt;
    private Integer schutzzoneOpt;
    private Boolean deleted;
    private Boolean enabled;
    private boolean typIndirekteinleitungTog;
    private boolean typIndusGewerbDirekteinleitungTog;
    private boolean typKommNwMischTog;
    private boolean typKommNwTrennTog;
    private boolean typNwPrivatTrennTog;
    private boolean typIndusGewerbNwMischTog;
    private boolean typIndusGewerbNwTrennTog;
    private boolean typGrubenwasserTog;
    private boolean typKleinklaeranlageTog;
    private boolean typKommKaTog;
    private boolean typAusseroertlicheStrasseneinleitungTog;
    private boolean typSonstigeTog;
    private Integer abgaberelevanteEltOpt;
    private String gewaesser3Id;
    private String ofwkNrwId;
    private String ofwkNrwAuflageId;
    private Integer ofwkNrwOpt;
    private String seeNs3Id;
    private String seenameAlias3;
    private String seeAuflage3Id;
    private String see3Id;
    private String einleitungsstellenId;
    private String gewaesserAuflage3Id;
    private String flussGebiet3Id;
    private String bemerkung;
    private String flussAuflage3Id;
    private String gewaessernameNs3;
    private String gewaesserNs3Id;
    private String gwkId;
    private boolean kaNichtInNrwTog;
    private String kaNameAusserhalbNrw;
    private String externalNr;
    private Set<Versickerungsanlage> versickerungsanlages = new HashSet<Versickerungsanlage>(0);
    private Set<Referenz> referenzsForQElsNr = new HashSet<Referenz>(0);
    private Set<Referenz> referenzsForZElsNr = new HashSet<Referenz>(0);

    /** Logging */
    private static final AuikLogger log = AuikLogger.getLogger();

    /** Default constructor */
    public Einleitungsstelle() {
        // This place is intentionally left blank.
    }

    /** Minimal constructor */
    public Einleitungsstelle(
        Integer id, boolean typIndirekteinleitungTog, boolean typIndusGewerbDirekteinleitungTog, boolean typKommNwMischTog, boolean typKommNwTrennTog, boolean typNwPrivatTrennTog, boolean typIndusGewerbNwMischTog, boolean typIndusGewerbNwTrennTog, boolean typGrubenwasserTog, boolean typKleinklaeranlageTog, boolean typKommKaTog, boolean typAusseroertlicheStrasseneinleitungTog, boolean typSonstigeTog, boolean kaNichtInNrwTog) {
        this.id = id;
        this.typIndirekteinleitungTog = typIndirekteinleitungTog;
        this.typIndusGewerbDirekteinleitungTog = typIndusGewerbDirekteinleitungTog;
        this.typKommNwMischTog = typKommNwMischTog;
        this.typKommNwTrennTog = typKommNwTrennTog;
        this.typNwPrivatTrennTog = typNwPrivatTrennTog;
        this.typIndusGewerbNwMischTog = typIndusGewerbNwMischTog;
        this.typIndusGewerbNwTrennTog = typIndusGewerbNwTrennTog;
        this.typGrubenwasserTog = typGrubenwasserTog;
        this.typKleinklaeranlageTog = typKleinklaeranlageTog;
        this.typKommKaTog = typKommKaTog;
        this.typAusseroertlicheStrasseneinleitungTog = typAusseroertlicheStrasseneinleitungTog;
        this.typSonstigeTog = typSonstigeTog;
        this.kaNichtInNrwTog = kaNichtInNrwTog;
    }

    /** Full constructor */
    public Einleitungsstelle(
        Integer id, Integer objektid, Date aktualDat, Date erstellDat, String herkunft, String bezeichnung, String gewaessernameAlias3, String gewaessernameNs, String nadiaId, Date stillgelegtAm, Boolean typIndirekt, Boolean typIndGewDirekt, Boolean typKommTrenn, Boolean typPrivatTrenn, Boolean typSonstige, Boolean typAusserortStrasseneinl, Double stationierungNs3, Double einzugsgebiet, Double stationierungSt3, Integer abgaberelEinl, Integer e32, Integer n32, Integer kanalArtOpt, Integer stationierung3Opt, Integer schutzzoneOpt, Boolean deleted, Boolean enabled, boolean typIndirekteinleitungTog, boolean typIndusGewerbDirekteinleitungTog, boolean typKommNwMischTog, boolean typKommNwTrennTog, boolean typNwPrivatTrennTog, boolean typIndusGewerbNwMischTog, boolean typIndusGewerbNwTrennTog, boolean typGrubenwasserTog, boolean typKleinklaeranlageTog, boolean typKommKaTog, boolean typAusseroertlicheStrasseneinleitungTog, boolean typSonstigeTog, Integer abgaberelevanteEltOpt, String gewaesser3Id, String ofwkNrwId, String ofwkNrwAuflageId, Integer ofwkNrwOpt, String seeNs3Id, String seenameAlias3, String seeAuflage3Id, String see3Id, String einleitungsstellenId, String gewaesserAuflage3Id, String flussGebiet3Id, String bemerkung, String flussAuflage3Id, String gewaessernameNs3, String gewaesserNs3Id, String gwkId, boolean kaNichtInNrwTog, String kaNameAusserhalbNrw, String externalNr, Set<Versickerungsanlage> versickerungsanlages, Set<Referenz> referenzsForQElsNr, Set<Referenz> referenzsForZElsNr) {
        this.id = id;
        this.objektid = objektid;
        this.aktualDat = aktualDat;
        this.erstellDat = erstellDat;
        this.herkunft = herkunft;
        this.bezeichnung = bezeichnung;
        this.gewaessernameAlias3 = gewaessernameAlias3;
        this.gewaessernameNs = gewaessernameNs;
        this.nadiaId = nadiaId;
        this.stillgelegtAm = stillgelegtAm;
        this.typIndirekt = typIndirekt;
        this.typIndGewDirekt = typIndGewDirekt;
        this.typKommTrenn = typKommTrenn;
        this.typPrivatTrenn = typPrivatTrenn;
        this.typSonstige = typSonstige;
        this.typAusserortStrasseneinl = typAusserortStrasseneinl;
        this.stationierungNs3 = stationierungNs3;
        this.einzugsgebiet = einzugsgebiet;
        this.stationierungSt3 = stationierungSt3;
        this.abgaberelEinl = abgaberelEinl;
        this.e32 = e32;
        this.n32 = n32;
        this.kanalArtOpt = kanalArtOpt;
        this.stationierung3Opt = stationierung3Opt;
        this.schutzzoneOpt = schutzzoneOpt;
        this.deleted = deleted;
        this.enabled = enabled;
        this.typIndirekteinleitungTog = typIndirekteinleitungTog;
        this.typIndusGewerbDirekteinleitungTog = typIndusGewerbDirekteinleitungTog;
        this.typKommNwMischTog = typKommNwMischTog;
        this.typKommNwTrennTog = typKommNwTrennTog;
        this.typNwPrivatTrennTog = typNwPrivatTrennTog;
        this.typIndusGewerbNwMischTog = typIndusGewerbNwMischTog;
        this.typIndusGewerbNwTrennTog = typIndusGewerbNwTrennTog;
        this.typGrubenwasserTog = typGrubenwasserTog;
        this.typKleinklaeranlageTog = typKleinklaeranlageTog;
        this.typKommKaTog = typKommKaTog;
        this.typAusseroertlicheStrasseneinleitungTog = typAusseroertlicheStrasseneinleitungTog;
        this.typSonstigeTog = typSonstigeTog;
        this.abgaberelevanteEltOpt = abgaberelevanteEltOpt;
        this.gewaesser3Id = gewaesser3Id;
        this.ofwkNrwId = ofwkNrwId;
        this.ofwkNrwAuflageId = ofwkNrwAuflageId;
        this.ofwkNrwOpt = ofwkNrwOpt;
        this.seeNs3Id = seeNs3Id;
        this.seenameAlias3 = seenameAlias3;
        this.seeAuflage3Id = seeAuflage3Id;
        this.see3Id = see3Id;
        this.einleitungsstellenId = einleitungsstellenId;
        this.gewaesserAuflage3Id = gewaesserAuflage3Id;
        this.flussGebiet3Id = flussGebiet3Id;
        this.bemerkung = bemerkung;
        this.flussAuflage3Id = flussAuflage3Id;
        this.gewaessernameNs3 = gewaessernameNs3;
        this.gewaesserNs3Id = gewaesserNs3Id;
        this.gwkId = gwkId;
        this.kaNichtInNrwTog = kaNichtInNrwTog;
        this.kaNameAusserhalbNrw = kaNameAusserhalbNrw;
        this.externalNr = externalNr;
        this.versickerungsanlages = versickerungsanlages;
        this.referenzsForQElsNr = referenzsForQElsNr;
        this.referenzsForZElsNr = referenzsForZElsNr;
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

	public Integer getObjektid() {
        return this.objektid;
    }

    public void setObjektid(Integer objektid) {
        this.objektid = objektid;
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

    public String getHerkunft() {
        return this.herkunft;
    }

    public void setHerkunft(String herkunft) {
        this.herkunft = herkunft;
    }

    public String getBezeichnung() {
        return this.bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getGewaessernameAlias3() {
        return this.gewaessernameAlias3;
    }

    public void setGewaessernameAlias3(String gewaessernameAlias3) {
        this.gewaessernameAlias3 = gewaessernameAlias3;
    }

    public String getGewaessernameNs() {
        return this.gewaessernameNs;
    }

    public void setGewaessernameNs(String gewaessernameNs) {
        this.gewaessernameNs = gewaessernameNs;
    }

    public String getNadiaId() {
        return this.nadiaId;
    }

    public void setNadiaId(String nadiaId) {
        this.nadiaId = nadiaId;
    }

    public Date getStillgelegtAm() {
        return this.stillgelegtAm;
    }

    public void setStillgelegtAm(Date stillgelegtAm) {
        this.stillgelegtAm = stillgelegtAm;
    }

    public Boolean getTypIndirekt() {
        return this.typIndirekt;
    }

    public void setTypIndirekt(Boolean typIndirekt) {
        this.typIndirekt = typIndirekt;
    }

    public Boolean getTypIndGewDirekt() {
        return this.typIndGewDirekt;
    }

    public void setTypIndGewDirekt(Boolean typIndGewDirekt) {
        this.typIndGewDirekt = typIndGewDirekt;
    }

    public Boolean getTypKommTrenn() {
        return this.typKommTrenn;
    }

    public void setTypKommTrenn(Boolean typKommTrenn) {
        this.typKommTrenn = typKommTrenn;
    }

    public Boolean getTypPrivatTrenn() {
        return this.typPrivatTrenn;
    }

    public void setTypPrivatTrenn(Boolean typPrivatTrenn) {
        this.typPrivatTrenn = typPrivatTrenn;
    }

    public Boolean getTypSonstige() {
        return this.typSonstige;
    }

    public void setTypSonstige(Boolean typSonstige) {
        this.typSonstige = typSonstige;
    }

    public Boolean getTypAusserortStrasseneinl() {
        return this.typAusserortStrasseneinl;
    }

    public void setTypAusserortStrasseneinl(Boolean typAusserortStrasseneinl) {
        this.typAusserortStrasseneinl = typAusserortStrasseneinl;
    }

    public Double getStationierungNs3() {
        return this.stationierungNs3;
    }

    public void setStationierungNs3(Double stationierungNs3) {
        this.stationierungNs3 = stationierungNs3;
    }

    public Double getEinzugsgebiet() {
        return this.einzugsgebiet;
    }

    public void setEinzugsgebiet(Double einzugsgebiet) {
        this.einzugsgebiet = einzugsgebiet;
    }

    public Double getStationierungSt3() {
        return this.stationierungSt3;
    }

    public void setStationierungSt3(Double stationierungSt3) {
        this.stationierungSt3 = stationierungSt3;
    }

    public Integer getAbgaberelEinl() {
        return this.abgaberelEinl;
    }

    public void setAbgaberelEinl(Integer abgaberelEinl) {
        this.abgaberelEinl = abgaberelEinl;
    }

    public Integer getE32() {
        return this.e32;
    }

    public void setE32(Integer e32) {
        this.e32 = e32;
    }

    public Integer getN32() {
        return this.n32;
    }

    public void setN32(Integer n32) {
        this.n32 = n32;
    }

    public Integer getKanalArtOpt() {
        return this.kanalArtOpt;
    }

    public void setKanalArtOpt(Integer kanalArtOpt) {
        this.kanalArtOpt = kanalArtOpt;
    }

    public Integer getStationierung3Opt() {
        return this.stationierung3Opt;
    }

    public void setStationierung3Opt(Integer stationierung3Opt) {
        this.stationierung3Opt = stationierung3Opt;
    }

    public Integer getSchutzzoneOpt() {
        return this.schutzzoneOpt;
    }

    public void setSchutzzoneOpt(Integer schutzzoneOpt) {
        this.schutzzoneOpt = schutzzoneOpt;
    }

    public Boolean getDeleted() {
        return this.deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isTypIndirekteinleitungTog() {
        return this.typIndirekteinleitungTog;
    }

    public void setTypIndirekteinleitungTog(boolean typIndirekteinleitungTog) {
        this.typIndirekteinleitungTog = typIndirekteinleitungTog;
    }

    public boolean isTypIndusGewerbDirekteinleitungTog() {
        return this.typIndusGewerbDirekteinleitungTog;
    }

    public void setTypIndusGewerbDirekteinleitungTog(boolean typIndusGewerbDirekteinleitungTog) {
        this.typIndusGewerbDirekteinleitungTog = typIndusGewerbDirekteinleitungTog;
    }

    public boolean isTypKommNwMischTog() {
        return this.typKommNwMischTog;
    }

    public void setTypKommNwMischTog(boolean typKommNwMischTog) {
        this.typKommNwMischTog = typKommNwMischTog;
    }

    public boolean isTypKommNwTrennTog() {
        return this.typKommNwTrennTog;
    }

    public void setTypKommNwTrennTog(boolean typKommNwTrennTog) {
        this.typKommNwTrennTog = typKommNwTrennTog;
    }

    public boolean isTypNwPrivatTrennTog() {
        return this.typNwPrivatTrennTog;
    }

    public void setTypNwPrivatTrennTog(boolean typNwPrivatTrennTog) {
        this.typNwPrivatTrennTog = typNwPrivatTrennTog;
    }

    public boolean isTypIndusGewerbNwMischTog() {
        return this.typIndusGewerbNwMischTog;
    }

    public void setTypIndusGewerbNwMischTog(boolean typIndusGewerbNwMischTog) {
        this.typIndusGewerbNwMischTog = typIndusGewerbNwMischTog;
    }

    public boolean isTypIndusGewerbNwTrennTog() {
        return this.typIndusGewerbNwTrennTog;
    }

    public void setTypIndusGewerbNwTrennTog(boolean typIndusGewerbNwTrennTog) {
        this.typIndusGewerbNwTrennTog = typIndusGewerbNwTrennTog;
    }

    public boolean isTypGrubenwasserTog() {
        return this.typGrubenwasserTog;
    }

    public void setTypGrubenwasserTog(boolean typGrubenwasserTog) {
        this.typGrubenwasserTog = typGrubenwasserTog;
    }

    public boolean isTypKleinklaeranlageTog() {
        return this.typKleinklaeranlageTog;
    }

    public void setTypKleinklaeranlageTog(boolean typKleinklaeranlageTog) {
        this.typKleinklaeranlageTog = typKleinklaeranlageTog;
    }

    public boolean isTypKommKaTog() {
        return this.typKommKaTog;
    }

    public void setTypKommKaTog(boolean typKommKaTog) {
        this.typKommKaTog = typKommKaTog;
    }

    public boolean isTypAusseroertlicheStrasseneinleitungTog() {
        return this.typAusseroertlicheStrasseneinleitungTog;
    }

    public void setTypAusseroertlicheStrasseneinleitungTog(boolean typAusseroertlicheStrasseneinleitungTog) {
        this.typAusseroertlicheStrasseneinleitungTog = typAusseroertlicheStrasseneinleitungTog;
    }

    public boolean isTypSonstigeTog() {
        return this.typSonstigeTog;
    }

    public void setTypSonstigeTog(boolean typSonstigeTog) {
        this.typSonstigeTog = typSonstigeTog;
    }

    public Integer getAbgaberelevanteEltOpt() {
        return this.abgaberelevanteEltOpt;
    }

    public void setAbgaberelevanteEltOpt(Integer abgaberelevanteEltOpt) {
        this.abgaberelevanteEltOpt = abgaberelevanteEltOpt;
    }

    public String getGewaesser3Id() {
        return this.gewaesser3Id;
    }

    public void setGewaesser3Id(String gewaesser3Id) {
        this.gewaesser3Id = gewaesser3Id;
    }

    public String getOfwkNrwId() {
        return this.ofwkNrwId;
    }

    public void setOfwkNrwId(String ofwkNrwId) {
        this.ofwkNrwId = ofwkNrwId;
    }

    public String getOfwkNrwAuflageId() {
        return this.ofwkNrwAuflageId;
    }

    public void setOfwkNrwAuflageId(String ofwkNrwAuflageId) {
        this.ofwkNrwAuflageId = ofwkNrwAuflageId;
    }

    public Integer getOfwkNrwOpt() {
        return this.ofwkNrwOpt;
    }

    public void setOfwkNrwOpt(Integer ofwkNrwOpt) {
        this.ofwkNrwOpt = ofwkNrwOpt;
    }

    public String getSeeNs3Id() {
        return this.seeNs3Id;
    }

    public void setSeeNs3Id(String seeNs3Id) {
        this.seeNs3Id = seeNs3Id;
    }

    public String getSeenameAlias3() {
        return this.seenameAlias3;
    }

    public void setSeenameAlias3(String seenameAlias3) {
        this.seenameAlias3 = seenameAlias3;
    }

    public String getSeeAuflage3Id() {
        return this.seeAuflage3Id;
    }

    public void setSeeAuflage3Id(String seeAuflage3Id) {
        this.seeAuflage3Id = seeAuflage3Id;
    }

    public String getSee3Id() {
        return this.see3Id;
    }

    public void setSee3Id(String see3Id) {
        this.see3Id = see3Id;
    }

    public String getEinleitungsstellenId() {
        return this.einleitungsstellenId;
    }

    public void setEinleitungsstellenId(String einleitungsstellenId) {
        this.einleitungsstellenId = einleitungsstellenId;
    }

    public String getGewaesserAuflage3Id() {
        return this.gewaesserAuflage3Id;
    }

    public void setGewaesserAuflage3Id(String gewaesserAuflage3Id) {
        this.gewaesserAuflage3Id = gewaesserAuflage3Id;
    }

    public String getFlussGebiet3Id() {
        return this.flussGebiet3Id;
    }

    public void setFlussGebiet3Id(String flussGebiet3Id) {
        this.flussGebiet3Id = flussGebiet3Id;
    }

    public String getBemerkung() {
        return this.bemerkung;
    }

    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    public String getFlussAuflage3Id() {
        return this.flussAuflage3Id;
    }

    public void setFlussAuflage3Id(String flussAuflage3Id) {
        this.flussAuflage3Id = flussAuflage3Id;
    }

    public String getGewaessernameNs3() {
        return this.gewaessernameNs3;
    }

    public void setGewaessernameNs3(String gewaessernameNs3) {
        this.gewaessernameNs3 = gewaessernameNs3;
    }

    public String getGewaesserNs3Id() {
        return this.gewaesserNs3Id;
    }

    public void setGewaesserNs3Id(String gewaesserNs3Id) {
        this.gewaesserNs3Id = gewaesserNs3Id;
    }

    public String getGwkId() {
        return this.gwkId;
    }

    public void setGwkId(String gwkId) {
        this.gwkId = gwkId;
    }

    public boolean isKaNichtInNrwTog() {
        return this.kaNichtInNrwTog;
    }

    public void setKaNichtInNrwTog(boolean kaNichtInNrwTog) {
        this.kaNichtInNrwTog = kaNichtInNrwTog;
    }

    public String getKaNameAusserhalbNrw() {
        return this.kaNameAusserhalbNrw;
    }

    public void setKaNameAusserhalbNrw(String kaNameAusserhalbNrw) {
        this.kaNameAusserhalbNrw = kaNameAusserhalbNrw;
    }

    public String getExternalNr() {
        return this.externalNr;
    }

    public void setExternalNr(String externalNr) {
        this.externalNr = externalNr;
    }

    public Set<Versickerungsanlage> getVersickerungsanlages() {
        return this.versickerungsanlages;
    }

    public void setVersickerungsanlages(Set<Versickerungsanlage> versickerungsanlages) {
        this.versickerungsanlages = versickerungsanlages;
    }

    public Set<Referenz> getReferenzsForQElsNr() {
        return this.referenzsForQElsNr;
    }

    public void setReferenzsForQElsNr(Set<Referenz> referenzsForQElsNr) {
        this.referenzsForQElsNr = referenzsForQElsNr;
    }

    public Set<Referenz> getReferenzsForZElsNr() {
        return this.referenzsForZElsNr;
    }

    public void setReferenzsForZElsNr(Set<Referenz> referenzsForZElsNr) {
        this.referenzsForZElsNr = referenzsForZElsNr;
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
        buffer.append("objektid").append("='").append(getObjektid()).append("' ");			
        buffer.append("aktualDat").append("='").append(getAktualDat()).append("' ");			
        buffer.append("erstellDat").append("='").append(getErstellDat()).append("' ");			
        buffer.append("herkunft").append("='").append(getHerkunft()).append("' ");			
        buffer.append("bezeichnung").append("='").append(getBezeichnung()).append("' ");			
        buffer.append("gewaessernameAlias3").append("='").append(getGewaessernameAlias3()).append("' ");			
        buffer.append("gewaessernameNs").append("='").append(getGewaessernameNs()).append("' ");			
        buffer.append("nadiaId").append("='").append(getNadiaId()).append("' ");			
        buffer.append("stillgelegtAm").append("='").append(getStillgelegtAm()).append("' ");			
        buffer.append("typIndirekt").append("='").append(getTypIndirekt()).append("' ");			
        buffer.append("typIndGewDirekt").append("='").append(getTypIndGewDirekt()).append("' ");			
        buffer.append("typKommTrenn").append("='").append(getTypKommTrenn()).append("' ");			
        buffer.append("typPrivatTrenn").append("='").append(getTypPrivatTrenn()).append("' ");			
        buffer.append("typSonstige").append("='").append(getTypSonstige()).append("' ");			
        buffer.append("typAusserortStrasseneinl").append("='").append(getTypAusserortStrasseneinl()).append("' ");			
        buffer.append("stationierungNs3").append("='").append(getStationierungNs3()).append("' ");			
        buffer.append("einzugsgebiet").append("='").append(getEinzugsgebiet()).append("' ");			
        buffer.append("stationierungSt3").append("='").append(getStationierungSt3()).append("' ");			
        buffer.append("abgaberelEinl").append("='").append(getAbgaberelEinl()).append("' ");			
        buffer.append("e32").append("='").append(getE32()).append("' ");			
        buffer.append("n32").append("='").append(getN32()).append("' ");			
        buffer.append("kanalArtOpt").append("='").append(getKanalArtOpt()).append("' ");			
        buffer.append("stationierung3Opt").append("='").append(getStationierung3Opt()).append("' ");			
        buffer.append("schutzzoneOpt").append("='").append(getSchutzzoneOpt()).append("' ");			
        buffer.append("deleted").append("='").append(getDeleted()).append("' ");			
        buffer.append("enabled").append("='").append(getEnabled()).append("' ");			
        buffer.append("typIndirekteinleitungTog").append("='").append(isTypIndirekteinleitungTog()).append("' ");			
        buffer.append("typIndusGewerbDirekteinleitungTog").append("='").append(isTypIndusGewerbDirekteinleitungTog()).append("' ");			
        buffer.append("typKommNwMischTog").append("='").append(isTypKommNwMischTog()).append("' ");			
        buffer.append("typKommNwTrennTog").append("='").append(isTypKommNwTrennTog()).append("' ");			
        buffer.append("typNwPrivatTrennTog").append("='").append(isTypNwPrivatTrennTog()).append("' ");			
        buffer.append("typIndusGewerbNwMischTog").append("='").append(isTypIndusGewerbNwMischTog()).append("' ");			
        buffer.append("typIndusGewerbNwTrennTog").append("='").append(isTypIndusGewerbNwTrennTog()).append("' ");			
        buffer.append("typGrubenwasserTog").append("='").append(isTypGrubenwasserTog()).append("' ");			
        buffer.append("typKleinklaeranlageTog").append("='").append(isTypKleinklaeranlageTog()).append("' ");			
        buffer.append("typKommKaTog").append("='").append(isTypKommKaTog()).append("' ");			
        buffer.append("typAusseroertlicheStrasseneinleitungTog").append("='").append(isTypAusseroertlicheStrasseneinleitungTog()).append("' ");			
        buffer.append("typSonstigeTog").append("='").append(isTypSonstigeTog()).append("' ");			
        buffer.append("abgaberelevanteEltOpt").append("='").append(getAbgaberelevanteEltOpt()).append("' ");			
        buffer.append("gewaesser3Id").append("='").append(getGewaesser3Id()).append("' ");			
        buffer.append("ofwkNrwId").append("='").append(getOfwkNrwId()).append("' ");			
        buffer.append("ofwkNrwAuflageId").append("='").append(getOfwkNrwAuflageId()).append("' ");			
        buffer.append("ofwkNrwOpt").append("='").append(getOfwkNrwOpt()).append("' ");			
        buffer.append("seeNs3Id").append("='").append(getSeeNs3Id()).append("' ");			
        buffer.append("seenameAlias3").append("='").append(getSeenameAlias3()).append("' ");			
        buffer.append("seeAuflage3Id").append("='").append(getSeeAuflage3Id()).append("' ");			
        buffer.append("see3Id").append("='").append(getSee3Id()).append("' ");			
        buffer.append("einleitungsstellenId").append("='").append(getEinleitungsstellenId()).append("' ");			
        buffer.append("gewaesserAuflage3Id").append("='").append(getGewaesserAuflage3Id()).append("' ");			
        buffer.append("flussGebiet3Id").append("='").append(getFlussGebiet3Id()).append("' ");			
        buffer.append("bemerkung").append("='").append(getBemerkung()).append("' ");			
        buffer.append("flussAuflage3Id").append("='").append(getFlussAuflage3Id()).append("' ");			
        buffer.append("gewaessernameNs3").append("='").append(getGewaessernameNs3()).append("' ");			
        buffer.append("gewaesserNs3Id").append("='").append(getGewaesserNs3Id()).append("' ");			
        buffer.append("gwkId").append("='").append(getGwkId()).append("' ");			
        buffer.append("kaNichtInNrwTog").append("='").append(isKaNichtInNrwTog()).append("' ");			
        buffer.append("kaNameAusserhalbNrw").append("='").append(getKaNameAusserhalbNrw()).append("' ");			
        buffer.append("externalNr").append("='").append(getExternalNr()).append("' ");			
        buffer.append("versickerungsanlages").append("='").append(getVersickerungsanlages()).append("' ");			
        buffer.append("referenzsForQElsNr").append("='").append(getReferenzsForQElsNr()).append("' ");			
        buffer.append("referenzsForZElsNr").append("='").append(getReferenzsForZElsNr()).append("' ");			
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
        if (!(other instanceof Einleitungsstelle)) return false;
        return (this.getId().equals(
            ((Einleitungsstelle) other).getId()));
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
     * @return <code>Einleitungsstelle</code> the merged instance,
     *         if everything went okay,
     *         <code>null</code> otherwise
     */
    public static Einleitungsstelle merge(Einleitungsstelle detachedInstance) {
        log.debug("Merging Einleitungsstelle instance " + detachedInstance);
        return (Einleitungsstelle) new DatabaseAccess().merge(detachedInstance);
    }

    /**
     * Merge (save or update) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean merge() {
        Einleitungsstelle saved = Einleitungsstelle.merge(this);
        if (saved == null) {
            return false;
        } else {
            this.copy(saved);
            return true;
        }
    }

    /**
     * Update this Einleitungsstelle with its new values.<br>
     * This is meant to be used after merging!
     * @param copy Einleitungsstelle
     */
    private void copy(Einleitungsstelle copy) {
        this.id = copy.getId();            
        this.objektid = copy.getObjektid();            
        this.aktualDat = copy.getAktualDat();            
        this.erstellDat = copy.getErstellDat();            
        this.herkunft = copy.getHerkunft();            
        this.bezeichnung = copy.getBezeichnung();            
        this.gewaessernameAlias3 = copy.getGewaessernameAlias3();            
        this.gewaessernameNs = copy.getGewaessernameNs();            
        this.nadiaId = copy.getNadiaId();            
        this.stillgelegtAm = copy.getStillgelegtAm();            
        this.typIndirekt = copy.getTypIndirekt();            
        this.typIndGewDirekt = copy.getTypIndGewDirekt();            
        this.typKommTrenn = copy.getTypKommTrenn();            
        this.typPrivatTrenn = copy.getTypPrivatTrenn();            
        this.typSonstige = copy.getTypSonstige();            
        this.typAusserortStrasseneinl = copy.getTypAusserortStrasseneinl();            
        this.stationierungNs3 = copy.getStationierungNs3();            
        this.einzugsgebiet = copy.getEinzugsgebiet();            
        this.stationierungSt3 = copy.getStationierungSt3();            
        this.abgaberelEinl = copy.getAbgaberelEinl();            
        this.e32 = copy.getE32();            
        this.n32 = copy.getN32();            
        this.kanalArtOpt = copy.getKanalArtOpt();            
        this.stationierung3Opt = copy.getStationierung3Opt();            
        this.schutzzoneOpt = copy.getSchutzzoneOpt();            
        this.deleted = copy.getDeleted();            
        this.enabled = copy.getEnabled();            
        this.typIndirekteinleitungTog = copy.isTypIndirekteinleitungTog();            
        this.typIndusGewerbDirekteinleitungTog = copy.isTypIndusGewerbDirekteinleitungTog();            
        this.typKommNwMischTog = copy.isTypKommNwMischTog();            
        this.typKommNwTrennTog = copy.isTypKommNwTrennTog();            
        this.typNwPrivatTrennTog = copy.isTypNwPrivatTrennTog();            
        this.typIndusGewerbNwMischTog = copy.isTypIndusGewerbNwMischTog();            
        this.typIndusGewerbNwTrennTog = copy.isTypIndusGewerbNwTrennTog();            
        this.typGrubenwasserTog = copy.isTypGrubenwasserTog();            
        this.typKleinklaeranlageTog = copy.isTypKleinklaeranlageTog();            
        this.typKommKaTog = copy.isTypKommKaTog();            
        this.typAusseroertlicheStrasseneinleitungTog = copy.isTypAusseroertlicheStrasseneinleitungTog();            
        this.typSonstigeTog = copy.isTypSonstigeTog();            
        this.abgaberelevanteEltOpt = copy.getAbgaberelevanteEltOpt();            
        this.gewaesser3Id = copy.getGewaesser3Id();            
        this.ofwkNrwId = copy.getOfwkNrwId();            
        this.ofwkNrwAuflageId = copy.getOfwkNrwAuflageId();            
        this.ofwkNrwOpt = copy.getOfwkNrwOpt();            
        this.seeNs3Id = copy.getSeeNs3Id();            
        this.seenameAlias3 = copy.getSeenameAlias3();            
        this.seeAuflage3Id = copy.getSeeAuflage3Id();            
        this.see3Id = copy.getSee3Id();            
        this.einleitungsstellenId = copy.getEinleitungsstellenId();            
        this.gewaesserAuflage3Id = copy.getGewaesserAuflage3Id();            
        this.flussGebiet3Id = copy.getFlussGebiet3Id();            
        this.bemerkung = copy.getBemerkung();            
        this.flussAuflage3Id = copy.getFlussAuflage3Id();            
        this.gewaessernameNs3 = copy.getGewaessernameNs3();            
        this.gewaesserNs3Id = copy.getGewaesserNs3Id();            
        this.gwkId = copy.getGwkId();            
        this.kaNichtInNrwTog = copy.isKaNichtInNrwTog();            
        this.kaNameAusserhalbNrw = copy.getKaNameAusserhalbNrw();            
        this.externalNr = copy.getExternalNr();            
        this.versickerungsanlages = copy.getVersickerungsanlages();            
        this.referenzsForQElsNr = copy.getReferenzsForQElsNr();            
        this.referenzsForZElsNr = copy.getReferenzsForZElsNr();            
    }    

    /**
     * Delete (mark as deleted) a detached instance
     * @param detachedInstance the instance to delete
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public static boolean delete(Einleitungsstelle detachedInstance) {
        log.debug("Deleting Einleitungsstelle instance " + detachedInstance);
        return new DatabaseAccess().delete(detachedInstance);
    }

    /**
     * Delete (mark as deleted) this instance
     * @return <code>true</code>, if everything went okay,
     *         <code>false</code> otherwise
     */
    public boolean delete() {
        return Einleitungsstelle.delete(this);
    }

    /**
     * Find an <code>Einleitungsstelle</code> instance by its primary key
     * @param id the primary key value
     * @return <code>Einleitungsstelle</code> the requested instance,
     *         if one exists,
     *         <code>null</code> otherwise
     */
    public static Einleitungsstelle findById(java.lang.Integer id) {
        log.debug("Getting Einleitungsstelle instance with id: " + id);
        return (Einleitungsstelle)
            new DatabaseAccess().get(Einleitungsstelle.class, id);
    }

    /**
     * Get a list of all <code>Einleitungsstelle</code>
     * @return <code>List&lt;Einleitungsstelle&gt;</code>
     *         all <code>Einleitungsstelle</code>
     */
    public static List<Einleitungsstelle> getAll() {
        return DatabaseQuery.getAll(new Einleitungsstelle());
    }

    /* Custom code goes below here! */

    public static Einleitungsstelle findByObjektId(java.lang.Integer id) {
        Objekt objekt = (Objekt) HibernateSessionFactory.currentSession().createQuery("from Objekt where id= " + id).list().get(0);
        Set<Einleitungsstelle> list = objekt.getEinleitungsstelles();
        return list.iterator().next();
    }
}
