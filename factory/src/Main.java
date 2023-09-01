public class Main {
    public static void main(String[] args) {

        System.out.println("Factory methods!");
        Vehicles vehicles = Factory.create("Nissan");
        try {
            vehicles.brand();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
