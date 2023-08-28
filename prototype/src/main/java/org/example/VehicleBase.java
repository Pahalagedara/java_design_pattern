package org.example;

import org.example.type.FuelType;
import org.example.type.BodyType;
import org.example.type.VehicleType;

public abstract class VehicleBase implements Cloneable {
    private String engineType;
    private FuelType fuelType;
    private String transmission;
    private String drivetrain;
    private BodyType bodyType;
    private int numberOfSeats;
    private VehicleType vehicleType;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getDrivetrain() {
        return drivetrain;
    }

    public void setDrivetrain(String drivetrain) {
        this.drivetrain = drivetrain;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    protected Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    return clone;
    }

    @Override
    public String toString() {
        return "VehicleBase- {" +
                "engineType='" + engineType + '\'' +
                ", fuelType=" + fuelType +
                ", transmission='" + transmission + '\'' +
                ", drivetrain='" + drivetrain + '\'' +
                ", bodyType=" + bodyType +
                ", numberOfSeats=" + numberOfSeats +
                ", vehicleType=" + vehicleType +
                '}';
    }
}
