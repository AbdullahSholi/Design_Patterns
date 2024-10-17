package org.example;


import org.example.decorator_exercise1.*;


public class Main {
    public static void main(String[] args) {
        // Create a simple coffee
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Simple Coffee costs: " + simpleCoffee.getPrice());

        // Add milk to the coffee
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("Milk Coffee costs: " + milkCoffee.getPrice());

        // Add sugar to the coffee with milk
        Coffee milkSugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Milk and Sugar Coffee costs: " + milkSugarCoffee.getPrice());

        // Add whipped cream to the coffee with milk and sugar
        Coffee deluxeCoffee = new WhippedCreamDecorator(milkSugarCoffee);
        System.out.println("Milk, Sugar, and Whipped Cream Coffee costs: " + deluxeCoffee.getPrice());
    }
}
