public class Factory {
    public static Vehicles create(String brand){
        if (brand=="BMW")
            return new BMW();
        else if (brand == "Nissan")
            return new Nissan();
        else
            return null;
    }
}
