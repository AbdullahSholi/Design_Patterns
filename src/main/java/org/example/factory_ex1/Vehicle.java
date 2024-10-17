package org.example.factory_ex1;

public class Vehicle {
    private String model;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void make(){
        System.out.println("Making a vehicle with model: " + model+ " and color: " + color);
    }
}
