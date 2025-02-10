package com.assignment;

public class Apartment extends Room {
    private String ownerName;

    public Apartment(int id, String ownerName) {
        super(id);
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Apartment " + getId() + " (Owner: " + ownerName + ") - Current Temperature: " + getCurrentTemperature() +
                ", Heating: " + isHeatingEnabled() + ", Cooling: " + isCoolingEnabled();
    }
}
