package com.joshuastringfellow.statsscraper.model;

public class Calculable {

    // "klasseB":true
    private boolean klasseB;

    private Calculable() {}

    public boolean isKlasseB() {
        return klasseB;
    }

    public void setKlasseB(boolean klasseB) {
        this.klasseB = klasseB;
    }

    @Override
    public String toString() {
        return "Calculable{" +
                "klasseB=" + klasseB +
                '}';
    }
}
