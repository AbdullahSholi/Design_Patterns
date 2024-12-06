package org.example.others.composition;

public class Car {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar(){
        engine.start();
        System.out.println("Car start moving!");
    }
}
