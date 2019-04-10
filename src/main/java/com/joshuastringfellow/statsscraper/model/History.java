package com.joshuastringfellow.statsscraper.model;

public class History {

    // "feilmelding":null - type String?
    private String feilmelding;

    // "kilometerstandInfo":null - type String?
    private String kilometerstandInfo;

    // "enkeltgodkjenning":null - type String?
    private String enkeltgodkjenning;

    public History() {
    }

    public String getFeilmelding() {
        return feilmelding;
    }

    public void setFeilmelding(String feilmelding) {
        this.feilmelding = feilmelding;
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
                "feilmelding='" + feilmelding + '\'' +
                ", kilometerstandInfo='" + kilometerstandInfo + '\'' +
                ", enkeltgodkjenning='" + enkeltgodkjenning + '\'' +
                '}';
    }
}
