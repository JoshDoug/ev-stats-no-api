package com.joshuastringfellow.statsscraper.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Embeddable;

@Embeddable
public class EnginePerformance {

    // "oppgitt":"65"
    @JsonProperty("oppgitt")
    private String motorytelseOppgitt; // motorytelse

    // "oppgittBenevning":"KW"
    private String oppgittBenevning;

    // "hestekrefter":"88"
    private String hestekrefter;

    public EnginePerformance() {}

    public String getMotorytelseOppgitt() {
        return motorytelseOppgitt;
    }

    public void setMotorytelseOppgitt(String motorytelseOppgitt) {
        this.motorytelseOppgitt = motorytelseOppgitt;
    }

    public String getOppgittBenevning() {
        return oppgittBenevning;
    }

    public void setOppgittBenevning(String oppgittBenevning) {
        this.oppgittBenevning = oppgittBenevning;
    }

    public String getHestekrefter() {
        return hestekrefter;
    }

    public void setHestekrefter(String hestekrefter) {
        this.hestekrefter = hestekrefter;
    }

    @Override
    public String toString() {
        return "EnginePerformance{" +
                "oppgitt='" + motorytelseOppgitt + '\'' +
                ", oppgittBenevning='" + oppgittBenevning + '\'' +
                ", hestekrefter='" + hestekrefter + '\'' +
                '}';
    }
}
