package org.example.adapter;

public class Executer {
    public static void main(String[] args){
        Vehicle car = new Car();
        useVehicle(car);

//        Vehicle bike = new Bicycle(); // here is bike not compatible with car instance from Vehicle, The Solution ?
//                                      // We will create a Bicycle adapter
//        useVehicle(bike);

        // After create BicycleAdapter
        Vehicle bike = new BicycleAdapter(new Bicycle());
        useVehicle(bike);



    }

    private static void useVehicle( Vehicle car ){
        car.accelarate();
        car.pushBreak();
        car.soundHorn();
        System.out.println();
    }

}
