package org.example.vehicles;

import org.example.VehicleBase;
import org.example.type.VehicleType;

public class Car extends VehicleBase {
    public Car(){
        super.setVehicleType(VehicleType.CAR);
    }

}
