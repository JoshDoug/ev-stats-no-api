package com.joshuastringfellow.statsscraper.model;

public class EnginePerformance {

    // "oppgitt":"65"
    private String oppgitt;

    // "oppgittBenevning":"KW"
    private String oppgittBenevning;

    // "hestekrefter":"88"
    private String hestekrefter;

    public EnginePerformance() {}

    public String getOppgitt() {
        return oppgitt;
    }

    public void setOppgitt(String oppgitt) {
        this.oppgitt = oppgitt;
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
                "oppgitt='" + oppgitt + '\'' +
                ", oppgittBenevning='" + oppgittBenevning + '\'' +
                ", hestekrefter='" + hestekrefter + '\'' +
                '}';
    }
}
