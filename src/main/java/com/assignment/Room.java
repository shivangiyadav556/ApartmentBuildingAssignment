package com.assignment;

import java.util.Random;

public class Room {
    private int id;
    private double currentTemperature;
    private boolean heatingEnabled;
    private boolean coolingEnabled;
    private double temperatureChangeRate = 0.5; // Rate of temperature adjustment per update
    private double tolerance = 0.5; // Tolerance for "close enough"

    public Room(int id) {
        this.id = id;
        this.currentTemperature = generateRandomTemperature();
        this.heatingEnabled = false;
        this.coolingEnabled = false;
    }

    private double generateRandomTemperature() {
        return 10.0 + new Random().nextDouble() * 30.0; // Random temperature between 10 and 40
    }

    public int getId() {
        return id;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public boolean isHeatingEnabled() {
        return heatingEnabled;
    }

    public boolean isCoolingEnabled() {
        return coolingEnabled;
    }

    public void updateHeatingCooling(double requestedTemperature) {
        if (Math.abs(currentTemperature - requestedTemperature) <= tolerance) {
            heatingEnabled = false;
            coolingEnabled = false;
        } else if (currentTemperature < requestedTemperature) {
            heatingEnabled = true;
            coolingEnabled = false;
        } else if (currentTemperature > requestedTemperature) {
            heatingEnabled = false;
            coolingEnabled = true;
        }
    }

    public void adjustTemperature() {
        if (heatingEnabled) {
            currentTemperature += temperatureChangeRate;
        } else if (coolingEnabled) {
            currentTemperature -= temperatureChangeRate;
        }
    }

    @Override
    public String toString() {
        return "Room " + id + " - Current Temperature: " + currentTemperature +
                ", Heating: " + heatingEnabled + ", Cooling: " + coolingEnabled;
    }
}
