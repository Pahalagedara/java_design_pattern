public class Singleton3 {
    private static Singleton3 instance;
    private Singleton3(){}

    public static synchronized Singleton3 getInstance(){
        try {
            instance = new Singleton3();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        System.out.println("sss");

        return instance;
    }

}
