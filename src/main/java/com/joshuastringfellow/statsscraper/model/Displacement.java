package com.joshuastringfellow.statsscraper.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Embeddable;

@Embeddable
public class Displacement {

    //"oppgitt":0
    @JsonProperty("oppgitt")
    private  int slagvolumOppgitt;

    // "liter":"0"
    private String liter;

    public Displacement() {}

    public int getSlagvolumOppgitt() {
        return slagvolumOppgitt;
    }

    public void setSlagvolumOppgitt(int slagvolumOppgitt) {
        this.slagvolumOppgitt = slagvolumOppgitt;
    }

    public String getLiter() {
        return liter;
    }

    public void setLiter(String liter) {
        this.liter = liter;
    }

    @Override
    public String toString() {
        return "Displacement{"
                + "oppgitt=" + slagvolumOppgitt +
                ", liter='" + liter + '\'' +
                '}';
    }
}
