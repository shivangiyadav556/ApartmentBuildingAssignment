package com.assignment;

public class CommonRoom extends Room {
    private String type;

    public CommonRoom(int id, String type) {
        super(id);
        this.type = type;
    }

    @Override
    public String toString() {
        return type + " (Room " + getId() + ") - Current Temperature: " + getCurrentTemperature() +
                ", Heating: " + isHeatingEnabled() + ", Cooling: " + isCoolingEnabled();
    }
}
