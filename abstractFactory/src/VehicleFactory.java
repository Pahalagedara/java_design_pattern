import vehicle.Vehicle;
import vehicle.nissan.NissanCar;
import vehicle.toyota.ToyotaVan;

public class VehicleFactory {

    public static Vehicle createToyota(String type){
        switch (type){
            case "car":
                return new NissanCar();
            case "van":
                return new ToyotaVan();
            default:
                return null;
        }
    }

    public static Vehicle createNissan(String type){
        switch (type){
            case "car":
                return new NissanCar();
            case "van":
                return new ToyotaVan();
            default:
                return null;
        }
    }
}
