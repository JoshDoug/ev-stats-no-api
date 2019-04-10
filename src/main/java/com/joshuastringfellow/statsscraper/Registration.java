package com.joshuastringfellow.statsscraper;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class containing the registration details that we're interested about
 *
 * TODO
 *  Any additional info to store? Can come from full reg table if needed at a later date
 *  De-registered is nullable
 *  How about potentially storing non-EVs in the future? How would that impact this class and surrounding logic?
 *  Dealing with the license plate? Split by prefix and number, CPK?
 */
public class Registration {

    @JsonProperty("regnr")
    private String licensePlate;

    @JsonProperty("merke")
    private String make;

    @JsonProperty("modell")
    private String model;

    @JsonProperty("registrertDistrikt")
    private String registrationDistrict;

    @JsonProperty("farge")
   private String colour;

    @JsonProperty("maxhastighet")
    private String maxSpeed;

    @JsonProperty("totalvekt")
    private int totalWeight;

    @JsonProperty("registrertEierDato")
    private String registrationDate;

    @JsonProperty("avregistrertDato")
    private String deRegistrationDate;

    @JsonProperty("bruktimportert")
    private String usedImport;

    // Get Prefix
    public String getLicensePlatePrefix() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    // Get Number from License Plate
    public int getLicensePlateNumber() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
}
