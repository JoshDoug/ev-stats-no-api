package com.joshuastringfellow.statsscraper.model;

import javax.persistence.Embeddable;

@Embeddable
public class Emissions {

    // "miljoklasse":"Ikke oppgitt"
    private String miljoklasse;

    // "partikkelfilter":"Ikke oppgitt"
    private String partikkelfilter;

    // "co2":"0"
    private String co2;

    // "nox":"0"
    private String nox;

    public Emissions() {}

    public String getMiljoklasse() {
        return miljoklasse;
    }

    public void setMiljoklasse(String miljoklasse) {
        this.miljoklasse = miljoklasse;
    }

    public String getPartikkelfilter() {
        return partikkelfilter;
    }

    public void setPartikkelfilter(String partikkelfilter) {
        this.partikkelfilter = partikkelfilter;
    }

    public String getCo2() {
        return co2;
    }

    public void setCo2(String co2) {
        this.co2 = co2;
    }

    public String getNox() {
        return nox;
    }

    public void setNox(String nox) {
        this.nox = nox;
    }

    @Override
    public String toString() {
        return "Emissions{" +
                "miljoklasse='" + miljoklasse + '\'' +
                ", partikkelfilter='" + partikkelfilter + '\'' +
                ", co2='" + co2 + '\'' +
                ", nox='" + nox + '\'' +
                '}';
    }
}
