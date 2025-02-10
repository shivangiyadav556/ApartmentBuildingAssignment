package com.assignment;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Building building = new Building(25.0); // Requested temperature: 25.0 degrees

        // Adding initial apartments and common rooms
        building.addApartment(new Apartment(101, "John"));
        building.addApartment(new Apartment(102, "Alice"));
        building.addCommonRoom(new CommonRoom(201, "Gym"));
        building.addCommonRoom(new CommonRoom(202, "Library"));

        // Timer for periodic temperature adjustment
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                building.adjustAllTemperatures();
                building.recalculateHeatingCooling();
            }
        }, 0, 5000); // Adjust temperatures every 5 seconds

        while (true) {
            System.out.println("\nBuilding Control System:");
            System.out.println("1. Display Building Details");
            System.out.println("2. Change Requested Temperature");
            System.out.println("3. Add Apartment");
            System.out.println("4. Add Common Room");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    building.displayBuildingDetails();
                    break;
                case 2:
                    System.out.print("Enter new requested temperature: ");
                    double newTemp = scanner.nextDouble();
                    building.setRequestedTemperature(newTemp);
                    break;
                case 3:
                    System.out.print("Enter Apartment ID: ");
                    int apartmentId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Owner Name: ");
                    String ownerName = scanner.nextLine();
                    building.addApartment(new Apartment(apartmentId, ownerName));
                    break;
                case 4:
                    System.out.print("Enter Common Room ID: ");
                    int commonRoomId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Common Room Type (Gym/Library/Laundry): ");
                    String type = scanner.nextLine();
                    building.addCommonRoom(new CommonRoom(commonRoomId, type));
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    timer.cancel();
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}