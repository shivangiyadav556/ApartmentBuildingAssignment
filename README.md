# Apartment Building Control System

## Overview
This Java application is a building control system that manages apartments and common rooms within a building. Each room's temperature is monitored, and heating or cooling systems are enabled or disabled based on the requested building temperature. The application also allows for periodic temperature adjustment and user input for adding rooms or changing settings.

## Features
- **Room Types**: Supports apartments (with owner details) and common rooms (Gym, Library, Laundry).
- **Temperature Management**: Automatically enables heating or cooling based on the room's current temperature and the building's requested temperature.
- **Configurable Tolerance**: Each room has a configurable tolerance for temperature difference before enabling heating or cooling.
- **User Interaction**:
  - Display current room details and statuses.
  - Change the building's requested temperature.
  - Add new apartments or common rooms with specific settings.
- **Automatic Updates**: Room temperatures adjust periodically, simulating real-world temperature changes.
- **Scalable Design**: Easily extendable to add more functionality.

## Technologies Used
- **Java**: Core Java for implementation.

- **Initial Setup**:
  - The building starts with 2 apartments (IDs: 101, 102) and 2 common rooms (Gym, Library).
  - The default requested temperature is set to 25.0°C.
- **Temperature Adjustment**:
  - Temperatures change by 0.5°C per update cycle.
  - The default tolerance for "close enough" is 0.5°C but can be configured per room.
- **Input Validation**: Minimal input validation is included; assumes valid user input.

## Usage
1. **Display Building Details**:
   - View the current status of all rooms, including temperature, heating, and cooling.

2. **Change Requested Temperature**:
   - Input a new temperature to adjust the entire building's settings.

3. **Add a New Room**:
   - Add apartments with owner details or common rooms with a specific type and tolerance.

4. **Exit**:
   - Gracefully shuts down the application.

## Development Process
### Commit History
- **Initial Setup**: Basic structure with Room, Apartment, and CommonRoom classes.
- **Feature Addition**: Implemented heating and cooling logic.
- **Enhancements**:
  - Configurable tolerance.
  - Timer for automatic temperature adjustments.


### Branching and Merging
- **Feature Branches**: Each feature was developed in separate branches.
- **Merging**: Regular merges into the main branch with descriptive commit messages.


