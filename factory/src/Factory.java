public class Factory {
    public static IVehicles create(String brand){
        if (brand=="BMW")
            return new BMW();
        else if (brand == "Nissan")
            return new Nissan();
        else
            return null;
    }
}
