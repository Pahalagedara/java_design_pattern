package org.example.vehicles;

import org.example.VehicleBase;
import org.example.type.VehicleType;

public class Van extends VehicleBase {
    public Van(){
        super.setVehicleType(VehicleType.VAN);
    }
}
