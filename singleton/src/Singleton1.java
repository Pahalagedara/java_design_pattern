
public class Singleton1 {

    private static final Singleton1 instance = new Singleton1();

    // private constructor to avoid client applications using the constructor
    private Singleton1(){}

    public static Singleton1 getInstance() {
        return instance;
    }
}
