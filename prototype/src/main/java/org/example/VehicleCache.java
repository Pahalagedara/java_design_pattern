package org.example;

import org.example.type.VehicleType;
import org.example.vehicles.Car;
import org.example.vehicles.Van;

import java.util.Hashtable;

public class VehicleCache {
    private static Hashtable<VehicleType, VehicleBase> vehicleMap  = new Hashtable<VehicleType, VehicleBase>();

    public static void load(){
        Car car = new Car();
        Van van = new Van();
        vehicleMap.put(VehicleType.CAR,car);
        vehicleMap.put(VehicleType.VAN,van);
    }

    public static VehicleBase getVehicle(VehicleType vehicleType) {
        return (VehicleBase) vehicleMap.get(vehicleType).clone();
    }

}
