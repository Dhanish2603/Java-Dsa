package Oops.static_2.package_2;

public class Main {
    public static void main(String[] args) {
        // greeting();//this will not work because main is an static and function is
        // nonstatic
    }

    // this is static it belongs to an object
    public static void fun() {
        // greeting();//you cant use because it requries ana instance for it
        // but greeting does not depends on instances
        System.out.println("hello friends");
        
        // now we can run on it due to its instance available
        Main obj = new Main();
        obj.greeting();

    }

    // something that is not static belongs to object
    public void greeting() {
        fun(); // this is limitless it can access it
        System.out.println("hello friends");
    }
}
