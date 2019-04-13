package com.joshuastringfellow.statsscraper.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.StringJoiner;

/**
 * Class containing all registration details in case I've forgotten anything
 * All in Norwegian as it wasn't obvious how everything should actually be translated
 */
@Entity
public class FullRegistration {

    // "regnr":"EV 50610"
    @Id
    private String regnr;

    // "tidspunkt":"07.04.2019"
    private String tidspunkt;

    // "nesteOppdatering":"08.04.2019"
    private String nesteOppdatering;

    // "kjoretoy":true
    private boolean kjoretoy;

    // "merke":"Tesla"
    private String merke;

    // "modell":"Model 3"
    private String modell;

    // "type":"003"
    private String type;

    // "brukstype":
    @Embedded
    private UseType brukstype;

    // "farge":"Blå"
    private String farge;

    // "kanBeregnes":
    @Embedded
    private Calculable kanBeregnes;

    //  "seter":5
    private int seter;

    // "staaplasser":0
    private int staaplasser;

    // "drivstofftype":"Elektrisitet"
    private String drivstofftype;

    // "slagvolum":
    @Embedded
    private Displacement slagvolum;

    // "motorytelse":
    @Embedded
    private EnginePerformance motorytelse;

    //"maxhastighet":"250 km/t"
    private String maxhastighet;

    // "akslerMedDrift":2
    private int akslerMedDrift;

    // "egenvektMedForer":1931
    private int egenvektMedForer;

    // "tilhengervektMBrems":0
    private int tilhengervektMBrems;

    // "tilhengervektUBrems":0
    private int tilhengervektUBrems;

    // "vogntogvekt":0
    private int vogntogvekt;

    // "taklast":0
    private int taklast;

    // "understellsnr":"5YJ3E7EB6KF223021"
    private String understellsnr;

    // "registreringsaar":2019
    private int registreringsaar;

    // "forstegangsreg":"04.03.2019"
    private String forstegangsreg;

    // "registrertEierDato":"04.03.2019"
    private String registrertEierDato;

    // "registrertDistrikt":"Oslo"
    private String registrertDistrikt;

    // "avregistrertDato":""
    private String avregistrertDato;

    // "egenvekt":1856
    private int egenvekt;

    // "totalvekt":2305
    private int totalvekt;

    // "tilhengervektKopl":0
    private int tilhengervektKopl;

    // "lengde":469
    private int lengde;

    // "bredde":185
    private int bredde;

    // "nyttelast":374
    private int nyttelast;

    // "akseltrykkForan":1110
    private int akseltrykkForan;

    // "akseltrykkBak":1257
    private int akseltrykkBak;

    // "dekkdimensjonForan":"235/35R20"
    private String dekkdimensjonForan;

    // "dekkdimensjonBak":"235/35R20"
    private String dekkdimensjonBak;

    // "hastighetsindeksForan":"Y (300 km/t)"
    private String hastighetsindeksForan;

    // "hastighetsindeksBak":"Y (300 km/t)"
    private String hastighetsindeksBak;

    // "lastindeksForan":"92"
    private String lastindeksForan;

    // "lastindeksBak":"92"
    private String lastindeksBak;

    // "innpressForan":"35 mm"
    private String innpressForan;

    // "innpressBak":"35 mm"
    private String innpressBak;

    // "solgtDato":""
    private String solgtDato;

    // "bruktimportert":"Nei"
    private String bruktimportert;

    // "oppbygd":"Nei"
    private String oppbygd;

    // "antallAksler":"2"
    private String antallAksler;

    // "eukontrollfrist":"04.03.2023"
    private String eukontrollfrist;

    // "eukontrollSist":""
    private String eukontrollSist;

    // "kmstandHistorikk":
    @Embedded
    private History kmstandHistorikk;

    // "utslipp":
    @Embedded
    private Emissions utslipp;

    // "feilmelding":null
    private String feilmelding;

    public FullRegistration() {
    }

    public String getTidspunkt() {
        return tidspunkt;
    }

    public void setTidspunkt(String tidspunkt) {
        this.tidspunkt = tidspunkt;
    }

    public String getNesteOppdatering() {
        return nesteOppdatering;
    }

    public void setNesteOppdatering(String nesteOppdatering) {
        this.nesteOppdatering = nesteOppdatering;
    }

    public boolean isKjoretoy() {
        return kjoretoy;
    }

    public void setKjoretoy(boolean kjoretoy) {
        this.kjoretoy = kjoretoy;
    }

    public String getMerke() {
        return merke;
    }

    public void setMerke(String merke) {
        this.merke = merke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UseType getBrukstype() {
        return brukstype;
    }

    public void setBrukstype(UseType brukstype) {
        this.brukstype = brukstype;
    }

    public String getFarge() {
        return farge;
    }

    public void setFarge(String farge) {
        this.farge = farge;
    }

    public Calculable getKanBeregnes() {
        return kanBeregnes;
    }

    public void setKanBeregnes(Calculable kanBeregnes) {
        this.kanBeregnes = kanBeregnes;
    }

    public int getSeter() {
        return seter;
    }

    public void setSeter(int seter) {
        this.seter = seter;
    }

    public int getStaaplasser() {
        return staaplasser;
    }

    public void setStaaplasser(int staaplasser) {
        this.staaplasser = staaplasser;
    }

    public String getDrivstofftype() {
        return drivstofftype;
    }

    public void setDrivstofftype(String drivstofftype) {
        this.drivstofftype = drivstofftype;
    }

    public Displacement getSlagvolum() {
        return slagvolum;
    }

    public void setSlagvolum(Displacement slagvolum) {
        this.slagvolum = slagvolum;
    }

    public EnginePerformance getMotorytelse() {
        return motorytelse;
    }

    public void setMotorytelse(EnginePerformance motorytelse) {
        this.motorytelse = motorytelse;
    }

    public String getMaxhastighet() {
        return maxhastighet;
    }

    public void setMaxhastighet(String maxhastighet) {
        this.maxhastighet = maxhastighet;
    }

    public int getAkslerMedDrift() {
        return akslerMedDrift;
    }

    public void setAkslerMedDrift(int akslerMedDrift) {
        this.akslerMedDrift = akslerMedDrift;
    }

    public int getEgenvektMedForer() {
        return egenvektMedForer;
    }

    public void setEgenvektMedForer(int egenvektMedForer) {
        this.egenvektMedForer = egenvektMedForer;
    }

    public int getTilhengervektMBrems() {
        return tilhengervektMBrems;
    }

    public void setTilhengervektMBrems(int tilhengervektMBrems) {
        this.tilhengervektMBrems = tilhengervektMBrems;
    }

    public int getTilhengervektUBrems() {
        return tilhengervektUBrems;
    }

    public void setTilhengervektUBrems(int tilhengervektUBrems) {
        this.tilhengervektUBrems = tilhengervektUBrems;
    }

    public int getVogntogvekt() {
        return vogntogvekt;
    }

    public void setVogntogvekt(int vogntogvekt) {
        this.vogntogvekt = vogntogvekt;
    }

    public int getTaklast() {
        return taklast;
    }

    public void setTaklast(int taklast) {
        this.taklast = taklast;
    }

    public String getRegnr() {
        return regnr;
    }

    public void setRegnr(String regnr) {
        this.regnr = regnr;
    }

    public String getUnderstellsnr() {
        return understellsnr;
    }

    public void setUnderstellsnr(String understellsnr) {
        this.understellsnr = understellsnr;
    }

    public int getRegistreringsaar() {
        return registreringsaar;
    }

    public void setRegistreringsaar(int registreringsaar) {
        this.registreringsaar = registreringsaar;
    }

    public String getForstegangsreg() {
        return forstegangsreg;
    }

    public void setForstegangsreg(String forstegangsreg) {
        this.forstegangsreg = forstegangsreg;
    }

    public String getRegistrertEierDato() {
        return registrertEierDato;
    }

    public void setRegistrertEierDato(String registrertEierDato) {
        this.registrertEierDato = registrertEierDato;
    }

    public String getRegistrertDistrikt() {
        return registrertDistrikt;
    }

    public void setRegistrertDistrikt(String registrertDistrikt) {
        this.registrertDistrikt = registrertDistrikt;
    }

    public String getAvregistrertDato() {
        return avregistrertDato;
    }

    public void setAvregistrertDato(String avregistrertDato) {
        this.avregistrertDato = avregistrertDato;
    }

    public int getEgenvekt() {
        return egenvekt;
    }

    public void setEgenvekt(int egenvekt) {
        this.egenvekt = egenvekt;
    }

    public int getTotalvekt() {
        return totalvekt;
    }

    public void setTotalvekt(int totalvekt) {
        this.totalvekt = totalvekt;
    }

    public int getTilhengervektKopl() {
        return tilhengervektKopl;
    }

    public void setTilhengervektKopl(int tilhengervektKopl) {
        this.tilhengervektKopl = tilhengervektKopl;
    }

    public int getLengde() {
        return lengde;
    }

    public void setLengde(int lengde) {
        this.lengde = lengde;
    }

    public int getBredde() {
        return bredde;
    }

    public void setBredde(int bredde) {
        this.bredde = bredde;
    }

    public int getNyttelast() {
        return nyttelast;
    }

    public void setNyttelast(int nyttelast) {
        this.nyttelast = nyttelast;
    }

    public int getAkseltrykkForan() {
        return akseltrykkForan;
    }

    public void setAkseltrykkForan(int akseltrykkForan) {
        this.akseltrykkForan = akseltrykkForan;
    }

    public int getAkseltrykkBak() {
        return akseltrykkBak;
    }

    public void setAkseltrykkBak(int akseltrykkBak) {
        this.akseltrykkBak = akseltrykkBak;
    }

    public String getDekkdimensjonForan() {
        return dekkdimensjonForan;
    }

    public void setDekkdimensjonForan(String dekkdimensjonForan) {
        this.dekkdimensjonForan = dekkdimensjonForan;
    }

    public String getDekkdimensjonBak() {
        return dekkdimensjonBak;
    }

    public void setDekkdimensjonBak(String dekkdimensjonBak) {
        this.dekkdimensjonBak = dekkdimensjonBak;
    }

    public String getHastighetsindeksForan() {
        return hastighetsindeksForan;
    }

    public void setHastighetsindeksForan(String hastighetsindeksForan) {
        this.hastighetsindeksForan = hastighetsindeksForan;
    }

    public String getHastighetsindeksBak() {
        return hastighetsindeksBak;
    }

    public void setHastighetsindeksBak(String hastighetsindeksBak) {
        this.hastighetsindeksBak = hastighetsindeksBak;
    }

    public String getLastindeksForan() {
        return lastindeksForan;
    }

    public void setLastindeksForan(String lastindeksForan) {
        this.lastindeksForan = lastindeksForan;
    }

    public String getLastindeksBak() {
        return lastindeksBak;
    }

    public void setLastindeksBak(String lastindeksBak) {
        this.lastindeksBak = lastindeksBak;
    }

    public String getInnpressForan() {
        return innpressForan;
    }

    public void setInnpressForan(String innpressForan) {
        this.innpressForan = innpressForan;
    }

    public String getInnpressBak() {
        return innpressBak;
    }

    public void setInnpressBak(String innpressBak) {
        this.innpressBak = innpressBak;
    }

    public String getSolgtDato() {
        return solgtDato;
    }

    public void setSolgtDato(String solgtDato) {
        this.solgtDato = solgtDato;
    }

    public String getBruktimportert() {
        return bruktimportert;
    }

    public void setBruktimportert(String bruktimportert) {
        this.bruktimportert = bruktimportert;
    }

    public String getOppbygd() {
        return oppbygd;
    }

    public void setOppbygd(String oppbygd) {
        this.oppbygd = oppbygd;
    }

    public String getAntallAksler() {
        return antallAksler;
    }

    public void setAntallAksler(String antallAksler) {
        this.antallAksler = antallAksler;
    }

    public String getEukontrollfrist() {
        return eukontrollfrist;
    }

    public void setEukontrollfrist(String eukontrollfrist) {
        this.eukontrollfrist = eukontrollfrist;
    }

    public String getEukontrollSist() {
        return eukontrollSist;
    }

    public void setEukontrollSist(String eukontrollSist) {
        this.eukontrollSist = eukontrollSist;
    }

    public History getKmstandHistorikk() {
        return kmstandHistorikk;
    }

    public void setKmstandHistorikk(History kmstandHistorikk) {
        this.kmstandHistorikk = kmstandHistorikk;
    }

    public Emissions getUtslipp() {
        return utslipp;
    }

    public void setUtslipp(Emissions utslipp) {
        this.utslipp = utslipp;
    }

    public String getFeilmelding() {
        return feilmelding;
    }

    public void setFeilmelding(String feilmelding) {
        this.feilmelding = feilmelding;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", FullRegistration.class.getSimpleName() + "[", "]")
                .add("tidspunkt='" + tidspunkt + "'")
                .add("nesteOppdatering='" + nesteOppdatering + "'")
                .add("kjoretoy=" + kjoretoy)
                .add("merke='" + merke + "'")
                .add("modell='" + modell + "'")
                .add("type='" + type + "'")
                .add("brukstype=" + brukstype)
                .add("farge='" + farge + "'")
                .add("kanBeregnes=" + kanBeregnes)
                .add("seter=" + seter)
                .add("staaplasser=" + staaplasser)
                .add("drivstofftype='" + drivstofftype + "'")
                .add("slagvolum=" + slagvolum)
                .add("motorytelse=" + motorytelse)
                .add("maxhastighet='" + maxhastighet + "'")
                .add("akslerMedDrift=" + akslerMedDrift)
                .add("egenvektMedForer=" + egenvektMedForer)
                .add("tilhengervektMBrems=" + tilhengervektMBrems)
                .add("tilhengervektUBrems=" + tilhengervektUBrems)
                .add("vogntogvekt=" + vogntogvekt)
                .add("taklast=" + taklast)
                .add("regnr='" + regnr + "'")
                .add("understellsnr='" + understellsnr + "'")
                .add("registreringsaar=" + registreringsaar)
                .add("forstegangsreg='" + forstegangsreg + "'")
                .add("registrertEierDato='" + registrertEierDato + "'")
                .add("registrertDistrikt='" + registrertDistrikt + "'")
                .add("avregistrertDato='" + avregistrertDato + "'")
                .add("egenvekt=" + egenvekt)
                .add("totalvekt=" + totalvekt)
                .add("tilhengervektKopl=" + tilhengervektKopl)
                .add("lengde=" + lengde)
                .add("bredde=" + bredde)
                .add("nyttelast=" + nyttelast)
                .add("akseltrykkForan=" + akseltrykkForan)
                .add("akseltrykkBak=" + akseltrykkBak)
                .add("dekkdimensjonForan='" + dekkdimensjonForan + "'")
                .add("dekkdimensjonBak='" + dekkdimensjonBak + "'")
                .add("hastighetsindeksForan='" + hastighetsindeksForan + "'")
                .add("hastighetsindeksBak='" + hastighetsindeksBak + "'")
                .add("lastindeksForan='" + lastindeksForan + "'")
                .add("lastindeksBak='" + lastindeksBak + "'")
                .add("innpressForan='" + innpressForan + "'")
                .add("innpressBak='" + innpressBak + "'")
                .add("solgtDato='" + solgtDato + "'")
                .add("bruktimportert='" + bruktimportert + "'")
                .add("oppbygd='" + oppbygd + "'")
                .add("antallAksler='" + antallAksler + "'")
                .add("eukontrollfrist='" + eukontrollfrist + "'")
                .add("eukontrollSist='" + eukontrollSist + "'")
                .add("kmstandHistorikk=" + kmstandHistorikk)
                .add("utslipp=" + utslipp)
                .add("feilmelding='" + feilmelding + "'")
                .toString();
    }
}
