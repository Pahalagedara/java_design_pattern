package org.example;

public class CarBuilder implements VehicleBuilder {
    private String engineType;
    private String fuelType;
    private String transmission;
    private String drivetrain;
    private String bodyType;
    private int numberOfSeats;

    @Override
    public VehicleBuilder setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    @Override
    public VehicleBuilder setFuelType(String fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    @Override
    public VehicleBuilder setTransmission(String transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public VehicleBuilder setDrivetrain(String drivetrain) {
        this.drivetrain = drivetrain;
        return this;
    }

    @Override
    public VehicleBuilder setBodyType(String bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    @Override
    public VehicleBuilder setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
        return this;
    }

    @Override
    public Car build() {
        Car car = new Car(this.engineType,this.fuelType,this.transmission,this.drivetrain,this.bodyType,this.numberOfSeats);
        return car;
    }

}
