package com.joshuastringfellow.statsscraper.model;

public class Displacement {

    //"oppgitt":0
    private  int oppgitt;

    // "liter":"0"
    private String liter;

    public Displacement() {}

    public int getOppgitt() {
        return oppgitt;
    }

    public void setOppgitt(int oppgitt) {
        this.oppgitt = oppgitt;
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
                + "oppgitt=" + oppgitt +
                ", liter='" + liter + '\'' +
                '}';
    }
}
