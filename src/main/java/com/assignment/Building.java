package com.assignment;
import com.assignment.Apartment;
import com.assignment.CommonRoom;

import java.util.ArrayList;
import java.util.List;

class Building {
    private List<Apartment> apartments;
    private List<CommonRoom> commonRooms;
    private double requestedTemperature;

    public Building(double requestedTemperature) {
        this.apartments = new ArrayList<>();
        this.commonRooms = new ArrayList<>();
        this.requestedTemperature = requestedTemperature;
    }

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }

    public void addCommonRoom(CommonRoom commonRoom) {
        commonRooms.add(commonRoom);
    }

    public void setRequestedTemperature(double requestedTemperature) {
        this.requestedTemperature = requestedTemperature;
        recalculateHeatingCooling();
    }

    public void recalculateHeatingCooling() {
        for (Apartment apartment : apartments) {
            apartment.updateHeatingCooling(requestedTemperature);
        }
        for (CommonRoom commonRoom : commonRooms) {
            commonRoom.updateHeatingCooling(requestedTemperature);
        }
    }

    public void adjustAllTemperatures() {
        for (Apartment apartment : apartments) {
            apartment.adjustTemperature();
        }
        for (CommonRoom commonRoom : commonRooms) {
            commonRoom.adjustTemperature();
        }
    }

    public void displayBuildingDetails() {
        System.out.println("Building Details:");
        System.out.println("Requested Temperature: " + requestedTemperature);
        for (Apartment apartment : apartments) {
            System.out.println(apartment);
        }
        for (CommonRoom commonRoom : commonRooms) {
            System.out.println(commonRoom);
        }
    }
}