public class Singleton {

    // 1. Create static object
    private static Singleton instance;

    // 2. Private constructor
    private Singleton() {
    }

    // 3. Public method to get the object
    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public void display() {
        System.out.println("Singleton object");
    }

    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.display();

        // Both references point to the same object
        System.out.println(obj1 == obj2);
    }
}