package org.example.singleton;

public class Singleton {
    private static Singleton instance ;

    private Singleton() {}

    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    // Example method to demonstrate Singleton usage
    public void showMessage() {
        System.out.println("Singleton Instance: " + instance);
    }
}
