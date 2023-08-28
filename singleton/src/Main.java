public class Main {
    public static void main(String[] args) {

        System.out.println("Main!");
        Singleton1 si = Singleton1.getInstance();
        System.out.println(si);

        Singleton2 s2 = Singleton2.getInstance();
        System.out.println(s2);

        Singleton3 s3 = Singleton3.getInstance();
        System.out.println(s3);

    }
}
