package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Builder Pattern!");
        Car car = new CarBuilder()
                .setBodyType("Sedan")
                .setEngineType("V6")
                .setDrivetrain("RWD")
                .setFuelType("Petrol")
//                .setTransmission("Automatic")
                .setNumberOfSeats(6)
                .build();

        System.out.println(car.getBodyType());
    }
}
