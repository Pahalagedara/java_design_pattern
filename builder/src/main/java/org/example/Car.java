package org.example;

public class Car {
    private String engineType;
    private String fuelType;
    private String transmission;
    private String drivetrain;
    private String bodyType;
    private int numberOfSeats;


    public Car(String engineType, String fuelType, String transmission, String drivetrain, String bodyType, int numberOfSeats) {
        this.engineType = engineType;
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.drivetrain = drivetrain;
        this.bodyType = bodyType;
        this.numberOfSeats = numberOfSeats;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getDrivetrain() {
        return drivetrain;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}
