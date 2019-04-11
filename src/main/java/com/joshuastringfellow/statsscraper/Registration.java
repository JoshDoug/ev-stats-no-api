package com.joshuastringfellow.statsscraper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.joshuastringfellow.statsscraper.model.FullRegistration;

import java.util.StringJoiner;

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

    public Registration() {}

    public Registration(FullRegistration fullRegistration) {
        this.colour = fullRegistration.getFarge();
        this.deRegistrationDate = fullRegistration.getAvregistrertDato();
        this.licensePlate = fullRegistration.getRegnr();
        this.make = fullRegistration.getMerke();
        this.model = fullRegistration.getModell();
        this.maxSpeed = fullRegistration.getMaxhastighet();
        this.totalWeight = fullRegistration.getTotalvekt();
        this.registrationDate = fullRegistration.getRegistrertEierDato();
        this.registrationDistrict = fullRegistration.getRegistrertDistrikt();
        this.usedImport = fullRegistration.getBruktimportert();
    }

    // Get Prefix
    public String getLicensePlatePrefix() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    // Get Number from License Plate
    public int getLicensePlateNumber() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationDistrict() {
        return registrationDistrict;
    }

    public void setRegistrationDistrict(String registrationDistrict) {
        this.registrationDistrict = registrationDistrict;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getDeRegistrationDate() {
        return deRegistrationDate;
    }

    public void setDeRegistrationDate(String deRegistrationDate) {
        this.deRegistrationDate = deRegistrationDate;
    }

    public String getUsedImport() {
        return usedImport;
    }

    public void setUsedImport(String usedImport) {
        this.usedImport = usedImport;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Registration.class.getSimpleName() + "[", "]")
                .add("licensePlate='" + licensePlate + "'")
                .add("make='" + make + "'")
                .add("model='" + model + "'")
                .add("registrationDistrict='" + registrationDistrict + "'")
                .add("colour='" + colour + "'")
                .add("maxSpeed='" + maxSpeed + "'")
                .add("totalWeight=" + totalWeight)
                .add("registrationDate='" + registrationDate + "'")
                .add("deRegistrationDate='" + deRegistrationDate + "'")
                .add("usedImport='" + usedImport + "'")
                .toString();
    }
}
