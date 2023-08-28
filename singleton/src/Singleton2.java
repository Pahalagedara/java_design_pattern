public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){}

    static {
        System.out.println("static function");
        if(instance==null){
            try {
                instance = new Singleton2();
            }catch (Exception e){
                System.out.println(e);
                throw new RuntimeException(e);
            }
        }
    }

    public static Singleton2 getInstance(){
        return instance;
    }
}
