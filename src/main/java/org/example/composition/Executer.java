package org.example.composition;

public class Executer {
    public static void main(String[] args) {
        Car car = new Car(new Engine());
        car.startCar();
    }
}
