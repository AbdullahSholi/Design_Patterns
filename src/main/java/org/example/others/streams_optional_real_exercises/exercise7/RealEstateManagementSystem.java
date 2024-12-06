package org.example.others.streams_optional_real_exercises.exercise7;

import java.util.*;
import java.util.stream.Collectors;

public class RealEstateManagementSystem {
    public static void main(String[] args) {
        List<Property> properties = new ArrayList<>(
                Arrays.asList(
                        new Property(1, 250000, "Available", "House", "Downtown"),
                        new Property(2, 320000, "Sold", "Apartment", "Green Valley"),
                        new Property(3, 150000, "Available", "Condo", "Downtown"),
                        new Property(4, 450000, "Pending", "House", "West Side"),
                        new Property(5, 180000, "Available", "Apartment", "Green Valley"),
                        new Property(6, 600000, "Available", "House", "Downtown"),
                        new Property(7, 275000, "Under Contract", "Condo", "West Side"),
                        new Property(8, 330000, "Available", "Apartment", "East End"),
                        new Property(9, 500000, "Sold", "House", "Green Valley"),
                        new Property(10, 290000, "Off Market", "Condo", "Downtown")
                )
        );

        ////
        // Part 1
        List<Property> availableHouse = properties
                .stream()
                .filter(property -> property.getStatus().equals("Available"))
                .toList();
        availableHouse.forEach(property -> System.out.println(property.getId()));
        System.out.println();

        ////
        // Part 2
        double average = properties
                .stream()
                .filter(property -> property.getNeighborhood().equals("Downtown"))
                .mapToDouble(Property::getPrice)
                .sum();
        double counts = properties
                .stream()
                .filter(property -> property.getNeighborhood().equals("Downtown"))
                .count();

        System.out.println("Average: "+average/counts);
        System.out.println();

        ////
        // Part 3
        Optional<Property> propertyWithHighestPrice = properties
                .stream()
                .max(Comparator.comparingDouble(Property::getPrice));
        propertyWithHighestPrice.ifPresent(property -> System.out.println(property.getId()));

        System.out.println();

        ////
        // Part 4
        Map<String, List<Property>> groupPropertiesByType = properties
                .stream()
                .collect(Collectors.groupingBy(
                        Property::getType,
                        Collectors.toList()
                ));
        for(Map.Entry<String, List<Property>> e : groupPropertiesByType.entrySet() ){
            System.out.println("Type: "+e.getKey());
            for(Property p : e.getValue()){
                System.out.println("      Status: "+p.getStatus());
            }
        }

    }



}

class Property{
    private int id;
    private double price;
    private String status;
    private String type;
    private String neighborhood;

    public Property(int id, double price, String status, String type, String neighborhood) {
        this.id = id;
        this.price = price;
        this.status = status;
        this.type = type;
        this.neighborhood = neighborhood;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }
}
