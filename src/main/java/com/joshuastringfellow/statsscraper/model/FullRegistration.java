package com.joshuastringfellow.statsscraper.model;

/**
 * Class containing all registration details in case I've forgotten anything
 * All in Norwegian as it wasn't obvious how everything should actually be translated
 */
public class FullRegistration {

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
    private UseType brukstype;

    // "farge":"Blå"
    private String farge;

    // "kanBeregnes":
    private Calculable kanBeregnes;

    //  "seter":5
    private int seter;

    // "staaplasser":0
    private int staaplasser;

    // "drivstofftype":"Elektrisitet"
    private String drivstofftype;

    // "slagvolum":
    private Displacement slagvolum;

    // "motorytelse":
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

    // "regnr":"EV 50610"
    private String regnr;

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
    private History kmstandHistorikk;

    // "utslipp":
    private Emissions utslipp;

    // "feilmelding":null
    private String feilmelding;
}
