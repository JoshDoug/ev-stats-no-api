package com.joshuastringfellow.statsscraper.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Embeddable;

@Embeddable
public class History {

    // "feilmelding":null - type String?
    @JsonProperty("feilmelding")
    private String historikkFeilmelding;

    // "kilometerstandInfo":null - type String?
    private String kilometerstandInfo;

    // "enkeltgodkjenning":null - type String?
    private String enkeltgodkjenning;

    public History() {}

    public String getHistorikkFeilmelding() {
        return historikkFeilmelding;
    }

    public void setHistorikkFeilmelding(String historikkFeilmelding) {
        this.historikkFeilmelding = historikkFeilmelding;
    }

    public String getKilometerstandInfo() {
        return kilometerstandInfo;
    }

    public void setKilometerstandInfo(String kilometerstandInfo) {
        this.kilometerstandInfo = kilometerstandInfo;
    }

    public String getEnkeltgodkjenning() {
        return enkeltgodkjenning;
    }

    public void setEnkeltgodkjenning(String enkeltgodkjenning) {
        this.enkeltgodkjenning = enkeltgodkjenning;
    }

    @Override
    public String toString() {
        return "History{" +
                "feilmelding='" + historikkFeilmelding + '\'' +
                ", kilometerstandInfo='" + kilometerstandInfo + '\'' +
                ", enkeltgodkjenning='" + enkeltgodkjenning + '\'' +
                '}';
    }
}
