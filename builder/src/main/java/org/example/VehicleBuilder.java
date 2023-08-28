package org.example;

public interface VehicleBuilder {
    public VehicleBuilder setEngineType(String engineType);
    public VehicleBuilder setFuelType(String fuelType);
    public VehicleBuilder setTransmission(String transmission);
    public VehicleBuilder setDrivetrain(String drivetrain);
    public VehicleBuilder setBodyType(String bodyType);
    public VehicleBuilder setNumberOfSeats(int numberOfSeats);
    public Car build();
}
