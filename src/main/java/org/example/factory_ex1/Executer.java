package org.example.factory_ex1;

public class Executer {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.createVehicle("truck");
        vehicle.make();
    }
}
