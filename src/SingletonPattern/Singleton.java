package SingletonPattern;

public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1);
        System.out.println("Instance ID: " + System.identityHashCode(s1));
        System.out.println(s2);
        System.out.println("Instance ID: " + System.identityHashCode(s2));
    }
}
