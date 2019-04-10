package com.joshuastringfellow.statsscraper.model;

public class UseType {

    // "gruppe":"PERSONBIL"
    private String gruppe;

    // "gruppekode":"M1"
    private String gruppekode;

    public UseType() {}

    public String getGruppe() {
        return gruppe;
    }

    public void setGruppe(String gruppe) {
        this.gruppe = gruppe;
    }

    public String getGruppekode() {
        return gruppekode;
    }

    public void setGruppekode(String gruppekode) {
        this.gruppekode = gruppekode;
    }

    @Override
    public String toString() {
        return "UseType{" +
                "gruppe='" + gruppe + '\'' +
                ", gruppekode='" + gruppekode + '\'' +
                '}';
    }
}
