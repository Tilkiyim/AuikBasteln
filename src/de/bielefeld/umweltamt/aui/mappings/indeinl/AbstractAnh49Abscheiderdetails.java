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

package de.bielefeld.umweltamt.aui.mappings.indeinl;

import java.io.Serializable;

import de.bielefeld.umweltamt.aui.mappings.StupidHelperClassWhichWillBeGoneSoon;

/**
 * A class that represents a row in the ANH_49_ABSCHEIDERDETAILS table. You can
 * customize the behavior of this class by editing the class, {@link
 * Anh49Abscheiderdetails()}.
 */
public abstract class AbstractAnh49Abscheiderdetails extends
    StupidHelperClassWhichWillBeGoneSoon implements Serializable {
    private static final long serialVersionUID = -1822237692610542309L;

    /**
     * The cached hash code value for this instance. Setting to 0 triggers
     * re-calculation.
     */
    private int hashValue = 0;

    /** The composite primary key value. */
    private java.lang.Integer abscheiderid;

    /** The value of the anh49Fachdaten association. */
    private Anh49Fachdaten Anh49Fachdaten;

    /** The value of the simple abscheidernr property. */
    private java.lang.Integer abscheidernr;

    /** The value of the simple von property. */
    private java.lang.Integer von;

    /** The value of the simple lage property. */
    private java.lang.String lage;

    /** The value of the simple nenngroesse property. */
    private java.lang.Integer nenngroesse;

    /** The value of the simple tankstelle property. */
    private java.lang.Boolean tankstelle;

    /** The value of the simple waschplatzHalle property. */
    private java.lang.Boolean waschplatzHalle;

    /** The value of the simple kfzBetrieb property. */
    private java.lang.Boolean kfzBetrieb;

    /** The value of the simple lebensmittelbetrieb property. */
    private java.lang.Boolean lebensmittelbetrieb;

    /** The value of the simple wohnhaus property. */
    private java.lang.Boolean wohnhaus;

    /** The value of the simple oberflaechenentwaesserung property. */
    private java.lang.Boolean oberflaechenentwaesserung;

    /** The value of the simple produktionsabwasser property. */
    private java.lang.Boolean produktionsabwasser;

    /** The value of the simple schlammfang property. */
    private java.lang.Boolean schlammfang;

    /** The value of the simple benzinOelabscheider property. */
    private java.lang.Boolean benzinOelabscheider;

    /** The value of the simple koaleszenzfilter property. */
    private java.lang.Boolean koaleszenzfilter;

    /** The value of the simple integriert property. */
    private java.lang.Boolean integriert;

    /** The value of the simple emulsionsspaltanlage property. */
    private java.lang.Boolean emulsionsspaltanlage;

    /** The value of the simple fettabscheider property. */
    private java.lang.Boolean fettabscheider;

    /** The value of the simple baujahr property. */
    private java.lang.String baujahr;

    /** The value of the simple din1999 property. */
    private java.lang.Boolean din1999;

    /** The value of the simple bauartzulassungsnummer property. */
    private java.lang.String bauartzulassungsnummer;

    /** The value of the simple ngSf property. */
    private java.lang.Integer ngSf;

    /** The value of the simple ngBa property. */
    private java.lang.Integer ngBa;

    /** The value of the simple ngKa property. */
    private java.lang.Integer ngKa;

    /** The value of the simple schwimmer property. */
    private java.lang.Boolean schwimmer;

    /** The value of the simple warnsignal property. */
    private java.lang.Boolean warnsignal;

    /** The value of the simple wartungsvertrag property. */
    private java.lang.Boolean wartungsvertrag;

    /** The value of the simple vertragspartner property. */
    private java.lang.String vertragspartner;

    /** The value of the simple letzteWartung property. */
    private java.lang.String letzteWartung;

    /** The value of the simple letzteLeerung property. */
    private java.lang.String letzteLeerung;

    /** The value of the simple hersteller property. */
    private java.lang.String hersteller;

    /** The value of the simple schmutzwasserkanal property. */
    private java.lang.Boolean schmutzwasserkanal;

    /** The value of the simple regenwasserkanal property. */
    private java.lang.Boolean regenwasserkanal;

    /** The value of the simple mischwasserkanal property. */
    private java.lang.Boolean mischwasserkanal;

    /** The value of the simple direkteinleiter property. */
    private java.lang.Boolean direkteinleiter;

    /** The value of the simple entsorgungnachweis property. */
    private java.lang.String entsorgungnachweis;

    /** The value of the simple entsorgungsvertrag property. */
    private java.lang.String entsorgungsvertrag;

    /** The value of the simple entsorgungsintervalle property. */
    private java.lang.String entsorgungsintervalle;

    /** The value of the simple flaeche property. */
    private java.lang.Integer flaeche;

    /** The value of the simple bemerkung property. */
    private java.lang.String bemerkung;

    /** The value of the simple entsorgungsnachweis property. */
    private java.util.Date entsorgungsnachweis;

    /** The value of the simple entsorgungsnachweisDurch property. */
    private java.lang.String entsorgungsnachweisDurch;

    /**
     * Simple constructor of AbstractAnh49Abscheiderdetails instances.
     */
    public AbstractAnh49Abscheiderdetails() {
    }

    /**
     * Constructor of AbstractAnh49Abscheiderdetails instances given a simple
     * primary key.
     * @param abscheiderid
     */
    public AbstractAnh49Abscheiderdetails(java.lang.Integer abscheiderid) {
        this.setAbscheiderid(abscheiderid);
    }

    /**
     * Return the simple primary key value that identifies this object.
     * @return java.lang.Integer
     */
    public java.lang.Integer getAbscheiderid() {
        return abscheiderid;
    }

    /**
     * Set the simple primary key value that identifies this object.
     * @param abscheiderid
     */
    public void setAbscheiderid(java.lang.Integer abscheiderid) {
        this.hashValue = 0;
        this.abscheiderid = abscheiderid;
    }

    /**
     * Return the value of the ANH49ID column.
     * @return Anh49Fachdaten
     */
    public Anh49Fachdaten getAnh49Fachdaten() {
        return this.Anh49Fachdaten;
    }

    /**
     * Set the value of the ANH49ID column.
     * @param anh49Fachdaten
     */
    public void setAnh49Fachdaten(Anh49Fachdaten Anh49Fachdaten) {
        this.Anh49Fachdaten = Anh49Fachdaten;
    }

    /**
     * Return the value of the ABSCHEIDERNR column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getAbscheidernr() {
        return this.abscheidernr;
    }

    /**
     * Set the value of the ABSCHEIDERNR column.
     * @param abscheidernr
     */
    public void setAbscheidernr(java.lang.Integer abscheidernr) {
        this.abscheidernr = abscheidernr;
    }

    /**
     * Return the value of the VON column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getVon() {
        return this.von;
    }

    /**
     * Set the value of the VON column.
     * @param von
     */
    public void setVon(java.lang.Integer von) {
        this.von = von;
    }

    /**
     * Return the value of the LAGE column.
     * @return java.lang.String
     */
    public java.lang.String getLage() {
        return this.lage;
    }

    /**
     * Set the value of the LAGE column.
     * @param lage
     */
    public void setLage(java.lang.String lage) {
        this.lage = lage;
    }

    /**
     * Return the value of the NENNGROESSE column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getNenngroesse() {
        return this.nenngroesse;
    }

    /**
     * Set the value of the NENNGROESSE column.
     * @param nenngroesse
     */
    public void setNenngroesse(java.lang.Integer nenngroesse) {
        this.nenngroesse = nenngroesse;
    }

    /**
     * Return the value of the TANKSTELLE column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getTankstelle() {
        return this.tankstelle;
    }

    /**
     * Set the value of the TANKSTELLE column.
     * @param tankstelle
     */
    public void setTankstelle(java.lang.Boolean tankstelle) {
        this.tankstelle = tankstelle;
    }

    /**
     * Return the value of the WASCHPLATZ_HALLE column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getWaschplatzHalle() {
        return this.waschplatzHalle;
    }

    /**
     * Set the value of the WASCHPLATZ_HALLE column.
     * @param waschplatzHalle
     */
    public void setWaschplatzHalle(java.lang.Boolean waschplatzHalle) {
        this.waschplatzHalle = waschplatzHalle;
    }

    /**
     * Return the value of the KFZ_BETRIEB column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getKfzBetrieb() {
        return this.kfzBetrieb;
    }

    /**
     * Set the value of the KFZ_BETRIEB column.
     * @param kfzBetrieb
     */
    public void setKfzBetrieb(java.lang.Boolean kfzBetrieb) {
        this.kfzBetrieb = kfzBetrieb;
    }

    /**
     * Return the value of the LEBENSMITTELBETRIEB column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getLebensmittelbetrieb() {
        return this.lebensmittelbetrieb;
    }

    /**
     * Set the value of the LEBENSMITTELBETRIEB column.
     * @param lebensmittelbetrieb
     */
    public void setLebensmittelbetrieb(java.lang.Boolean lebensmittelbetrieb) {
        this.lebensmittelbetrieb = lebensmittelbetrieb;
    }

    /**
     * Return the value of the WOHNHAUS column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getWohnhaus() {
        return this.wohnhaus;
    }

    /**
     * Set the value of the WOHNHAUS column.
     * @param wohnhaus
     */
    public void setWohnhaus(java.lang.Boolean wohnhaus) {
        this.wohnhaus = wohnhaus;
    }

    /**
     * Return the value of the OBERFLAECHENENTWAESSERUNG column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getOberflaechenentwaesserung() {
        return this.oberflaechenentwaesserung;
    }

    /**
     * Set the value of the OBERFLAECHENENTWAESSERUNG column.
     * @param oberflaechenentwaesserung
     */
    public void setOberflaechenentwaesserung(
        java.lang.Boolean oberflaechenentwaesserung) {
        this.oberflaechenentwaesserung = oberflaechenentwaesserung;
    }

    /**
     * Return the value of the PRODUKTIONSABWASSER column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getProduktionsabwasser() {
        return this.produktionsabwasser;
    }

    /**
     * Set the value of the PRODUKTIONSABWASSER column.
     * @param produktionsabwasser
     */
    public void setProduktionsabwasser(java.lang.Boolean produktionsabwasser) {
        this.produktionsabwasser = produktionsabwasser;
    }

    /**
     * Return the value of the SCHLAMMFANG column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getSchlammfang() {
        return this.schlammfang;
    }

    /**
     * Set the value of the SCHLAMMFANG column.
     * @param schlammfang
     */
    public void setSchlammfang(java.lang.Boolean schlammfang) {
        this.schlammfang = schlammfang;
    }

    /**
     * Return the value of the BENZIN_OELABSCHEIDER column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getBenzinOelabscheider() {
        return this.benzinOelabscheider;
    }

    /**
     * Set the value of the BENZIN_OELABSCHEIDER column.
     * @param benzinOelabscheider
     */
    public void setBenzinOelabscheider(java.lang.Boolean benzinOelabscheider) {
        this.benzinOelabscheider = benzinOelabscheider;
    }

    /**
     * Return the value of the KOALESZENZFILTER column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getKoaleszenzfilter() {
        return this.koaleszenzfilter;
    }

    /**
     * Set the value of the KOALESZENZFILTER column.
     * @param koaleszenzfilter
     */
    public void setKoaleszenzfilter(java.lang.Boolean koaleszenzfilter) {
        this.koaleszenzfilter = koaleszenzfilter;
    }

    /**
     * Return the value of the INTEGRIERT column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getIntegriert() {
        return this.integriert;
    }

    /**
     * Set the value of the INTEGRIERT column.
     * @param integriert
     */
    public void setIntegriert(java.lang.Boolean integriert) {
        this.integriert = integriert;
    }

    /**
     * Return the value of the EMULSIONSSPALTANLAGE column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getEmulsionsspaltanlage() {
        return this.emulsionsspaltanlage;
    }

    /**
     * Set the value of the EMULSIONSSPALTANLAGE column.
     * @param emulsionsspaltanlage
     */
    public void setEmulsionsspaltanlage(java.lang.Boolean emulsionsspaltanlage) {
        this.emulsionsspaltanlage = emulsionsspaltanlage;
    }

    /**
     * Return the value of the FETTABSCHEIDER column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getFettabscheider() {
        return this.fettabscheider;
    }

    /**
     * Set the value of the FETTABSCHEIDER column.
     * @param fettabscheider
     */
    public void setFettabscheider(java.lang.Boolean fettabscheider) {
        this.fettabscheider = fettabscheider;
    }

    /**
     * Return the value of the BAUJAHR column.
     * @return java.lang.String
     */
    public java.lang.String getBaujahr() {
        return this.baujahr;
    }

    /**
     * Set the value of the BAUJAHR column.
     * @param baujahr
     */
    public void setBaujahr(java.lang.String baujahr) {
        this.baujahr = baujahr;
    }

    /**
     * Return the value of the DIN1999 column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getDin1999() {
        return this.din1999;
    }

    /**
     * Set the value of the DIN1999 column.
     * @param din1999
     */
    public void setDin1999(java.lang.Boolean din1999) {
        this.din1999 = din1999;
    }

    /**
     * Return the value of the BAUARTZULASSUNGSNUMMER column.
     * @return java.lang.String
     */
    public java.lang.String getBauartzulassungsnummer() {
        return this.bauartzulassungsnummer;
    }

    /**
     * Set the value of the BAUARTZULASSUNGSNUMMER column.
     * @param bauartzulassungsnummer
     */
    public void setBauartzulassungsnummer(
        java.lang.String bauartzulassungsnummer) {
        this.bauartzulassungsnummer = bauartzulassungsnummer;
    }

    /**
     * Return the value of the NG_SF column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getNgSf() {
        return this.ngSf;
    }

    /**
     * Set the value of the NG_SF column.
     * @param ngSf
     */
    public void setNgSf(java.lang.Integer ngSf) {
        this.ngSf = ngSf;
    }

    /**
     * Return the value of the NG_BA column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getNgBa() {
        return this.ngBa;
    }

    /**
     * Set the value of the NG_BA column.
     * @param ngBa
     */
    public void setNgBa(java.lang.Integer ngBa) {
        this.ngBa = ngBa;
    }

    /**
     * Return the value of the NG_KA column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getNgKa() {
        return this.ngKa;
    }

    /**
     * Set the value of the NG_KA column.
     * @param ngKa
     */
    public void setNgKa(java.lang.Integer ngKa) {
        this.ngKa = ngKa;
    }

    /**
     * Return the value of the SCHWIMMER column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getSchwimmer() {
        return this.schwimmer;
    }

    /**
     * Set the value of the SCHWIMMER column.
     * @param schwimmer
     */
    public void setSchwimmer(java.lang.Boolean schwimmer) {
        this.schwimmer = schwimmer;
    }

    /**
     * Return the value of the WARNSIGNAL column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getWarnsignal() {
        return this.warnsignal;
    }

    /**
     * Set the value of the WARNSIGNAL column.
     * @param warnsignal
     */
    public void setWarnsignal(java.lang.Boolean warnsignal) {
        this.warnsignal = warnsignal;
    }

    /**
     * Return the value of the WARTUNGSVERTRAG column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getWartungsvertrag() {
        return this.wartungsvertrag;
    }

    /**
     * Set the value of the WARTUNGSVERTRAG column.
     * @param wartungsvertrag
     */
    public void setWartungsvertrag(java.lang.Boolean wartungsvertrag) {
        this.wartungsvertrag = wartungsvertrag;
    }

    /**
     * Return the value of the VERTRAGSPARTNER column.
     * @return java.lang.String
     */
    public java.lang.String getVertragspartner() {
        return this.vertragspartner;
    }

    /**
     * Set the value of the VERTRAGSPARTNER column.
     * @param vertragspartner
     */
    public void setVertragspartner(java.lang.String vertragspartner) {
        this.vertragspartner = vertragspartner;
    }

    /**
     * Return the value of the LETZTE_WARTUNG column.
     * @return java.lang.String
     */
    public java.lang.String getLetzteWartung() {
        return this.letzteWartung;
    }

    /**
     * Set the value of the LETZTE_WARTUNG column.
     * @param letzteWartung
     */
    public void setLetzteWartung(java.lang.String letzteWartung) {
        this.letzteWartung = letzteWartung;
    }

    /**
     * Return the value of the LETZTE_LEERUNG column.
     * @return java.lang.String
     */
    public java.lang.String getLetzteLeerung() {
        return this.letzteLeerung;
    }

    /**
     * Set the value of the LETZTE_LEERUNG column.
     * @param letzteLeerung
     */
    public void setLetzteLeerung(java.lang.String letzteLeerung) {
        this.letzteLeerung = letzteLeerung;
    }

    /**
     * Return the value of the HERSTELLER column.
     * @return java.lang.String
     */
    public java.lang.String getHersteller() {
        return this.hersteller;
    }

    /**
     * Set the value of the HERSTELLER column.
     * @param hersteller
     */
    public void setHersteller(java.lang.String hersteller) {
        this.hersteller = hersteller;
    }

    /**
     * Return the value of the SCHMUTZWASSERKANAL column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getSchmutzwasserkanal() {
        return this.schmutzwasserkanal;
    }

    /**
     * Set the value of the SCHMUTZWASSERKANAL column.
     * @param schmutzwasserkanal
     */
    public void setSchmutzwasserkanal(java.lang.Boolean schmutzwasserkanal) {
        this.schmutzwasserkanal = schmutzwasserkanal;
    }

    /**
     * Return the value of the REGENWASSERKANAL column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getRegenwasserkanal() {
        return this.regenwasserkanal;
    }

    /**
     * Set the value of the REGENWASSERKANAL column.
     * @param regenwasserkanal
     */
    public void setRegenwasserkanal(java.lang.Boolean regenwasserkanal) {
        this.regenwasserkanal = regenwasserkanal;
    }

    /**
     * Return the value of the MISCHWASSERKANAL column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getMischwasserkanal() {
        return this.mischwasserkanal;
    }

    /**
     * Set the value of the MISCHWASSERKANAL column.
     * @param mischwasserkanal
     */
    public void setMischwasserkanal(java.lang.Boolean mischwasserkanal) {
        this.mischwasserkanal = mischwasserkanal;
    }

    /**
     * Return the value of the DIREKTEINLEITER column.
     * @return java.lang.Boolean
     */
    public java.lang.Boolean getDirekteinleiter() {
        return this.direkteinleiter;
    }

    /**
     * Set the value of the DIREKTEINLEITER column.
     * @param direkteinleiter
     */
    public void setDirekteinleiter(java.lang.Boolean direkteinleiter) {
        this.direkteinleiter = direkteinleiter;
    }

    /**
     * Return the value of the ENTSORGUNGNACHWEIS column.
     * @return java.lang.String
     */
    public java.lang.String getEntsorgungnachweis() {
        return this.entsorgungnachweis;
    }

    /**
     * Set the value of the ENTSORGUNGNACHWEIS column.
     * @param entsorgungnachweis
     */
    public void setEntsorgungnachweis(java.lang.String entsorgungnachweis) {
        this.entsorgungnachweis = entsorgungnachweis;
    }

    /**
     * Return the value of the ENTSORGUNGSVERTRAG column.
     * @return java.lang.String
     */
    public java.lang.String getEntsorgungsvertrag() {
        return this.entsorgungsvertrag;
    }

    /**
     * Set the value of the ENTSORGUNGSVERTRAG column.
     * @param entsorgungsvertrag
     */
    public void setEntsorgungsvertrag(java.lang.String entsorgungsvertrag) {
        this.entsorgungsvertrag = entsorgungsvertrag;
    }

    /**
     * Return the value of the ENTSORGUNGSINTERVALLE column.
     * @return java.lang.String
     */
    public java.lang.String getEntsorgungsintervalle() {
        return this.entsorgungsintervalle;
    }

    /**
     * Set the value of the ENTSORGUNGSINTERVALLE column.
     * @param entsorgungsintervalle
     */
    public void setEntsorgungsintervalle(java.lang.String entsorgungsintervalle) {
        this.entsorgungsintervalle = entsorgungsintervalle;
    }

    /**
     * Return the value of the FLAECHE column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getFlaeche() {
        return this.flaeche;
    }

    /**
     * Set the value of the FLAECHE column.
     * @param flaeche
     */
    public void setFlaeche(java.lang.Integer flaeche) {
        this.flaeche = flaeche;
    }

    /**
     * Return the value of the BEMERKUNG column.
     * @return java.lang.String
     */
    public java.lang.String getBemerkung() {
        return this.bemerkung;
    }

    /**
     * Set the value of the BEMERKUNG column.
     * @param bemerkung
     */
    public void setBemerkung(java.lang.String bemerkung) {
        this.bemerkung = bemerkung;
    }

    /**
     * Return the value of the ENTSORGUNGSNACHWEIS column.
     * @return java.util.Date
     */
    public java.util.Date getEntsorgungsnachweis() {
        return this.entsorgungsnachweis;
    }

    /**
     * Set the value of the ENTSORGUNGSNACHWEIS column.
     * @param entsorgungsnachweis
     */
    public void setEntsorgungsnachweis(java.util.Date entsorgungsnachweis) {
        this.entsorgungsnachweis = entsorgungsnachweis;
    }

    /**
     * Return the value of the ENTSORGUNGSNACHWEIS_DURCH column.
     * @return java.lang.String
     */
    public java.lang.String getEntsorgungsnachweisDurch() {
        return this.entsorgungsnachweisDurch;
    }

    /**
     * Set the value of the ENTSORGUNGSNACHWEIS_DURCH column.
     * @param entsorgungsnachweisDurch
     */
    public void setEntsorgungsnachweisDurch(
        java.lang.String entsorgungsnachweisDurch) {
        this.entsorgungsnachweisDurch = entsorgungsnachweisDurch;
    }

    /**
     * Implementation of the equals comparison on the basis of equality of the
     * primary key values.
     * @param rhs
     * @return boolean
     */
    @Override
    public boolean equals(Object rhs) {
        if (rhs == null)
            return false;
        if (!(rhs instanceof Anh49Abscheiderdetails))
            return false;
        Anh49Abscheiderdetails that = (Anh49Abscheiderdetails) rhs;
        if (this.getAbscheiderid() != null && that.getAbscheiderid() != null) {
            if (!this.getAbscheiderid().equals(that.getAbscheiderid())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Implementation of the hashCode method conforming to the Bloch pattern
     * with the exception of array properties (these are very unlikely primary
     * key types).
     * @return int
     */
    @Override
    public int hashCode() {
        if (this.hashValue == 0) {
            int result = 17;
            int abscheideridValue = this.getAbscheiderid() == null ? 0 : this
                .getAbscheiderid().hashCode();
            result = result * 37 + abscheideridValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }
}
