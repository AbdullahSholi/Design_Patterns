package org.example.factory_ex1;

public class VehicleFactory {
    public static final String CAR = "car";
    public static final String TRUCK = "truck";
    public static final String BIKE = "bike";
    public static Vehicle createVehicle( String type ){
        switch( type ){
            case CAR:
                return new Car();
            case TRUCK:
                return new Truck();
            case BIKE:
                return new Bike();
            default:
                return null;
        }
    }
}
