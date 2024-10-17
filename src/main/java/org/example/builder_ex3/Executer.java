package org.example.builder_ex3;

public class Executer {
    public static void main(String[] args) {
        House house = new House.HouseBuilder().setNumberOfRooms(5).setHasGarage(true).build();
        System.out.println("number of rooms: " + house.getNumberOfRooms());
        System.out.println("Has Garage: " + house.isHasGarage());
        System.out.println("Has Garden: " + house.isHasGarden());
        System.out.println("Has Swimming Pool: " + house.isHasSwimmingPool());
    }
}
