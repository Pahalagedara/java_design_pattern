import vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract Factory!");
        Vehicle car = VehicleFactory.createNissan("car");
        Vehicle van = VehicleFactory.createToyota("van");

        System.out.println(van.toString());
        System.out.println(car.toString());
    }
}
