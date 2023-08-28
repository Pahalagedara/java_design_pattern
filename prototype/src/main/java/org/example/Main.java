package org.example;

import org.example.type.FuelType;
import org.example.type.VehicleType;
import org.example.vehicles.Car;
import org.example.vehicles.Van;

public class Main {
    public static void main(String[] args){
        System.out.println("------------Prototype!---------");
        VehicleCache.load();

        Car car1 = (Car) VehicleCache.getVehicle(VehicleType.CAR);
        car1.setFuelType(FuelType.DIESEL);
        car1.setNumberOfSeats(5);

        Car car2 = (Car) VehicleCache.getVehicle(VehicleType.CAR);
        car2.setDrivetrain("4X4");

        Van van1 = (Van) VehicleCache.getVehicle(VehicleType.VAN);

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(van1.toString());
    }
}
