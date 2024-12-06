package org.example.others.streams_optional_real_exercises.exercise6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EcommercePlatform {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(
                Arrays.asList(
                        new Product("Mobile", 2000.0, 200, "Electronics", Status.COMPLETED ),
                        new Product("Laptop", 100.0, 2000, "Electronics", Status.COMPLETED),
                        new Product("TV", 3000.0, 0, "Electronics", Status.PENDING)
                )
        );

        ////
        // Part 1
        List<Product> productsInSpecificRange = products
                .stream()
                .filter(product -> product.getPrice()>1000 && product.getPrice()<2500)
                .toList();
        productsInSpecificRange.forEach(product -> System.out.println("Product: "+product.getName()));
        System.out.println();

        ////
        // Part 2
        double totalSalesForCompleted = products
                .stream()
                .filter(product -> product.getStatus().equals(Status.COMPLETED))
                .mapToDouble(Product::getQuantity)
                .sum();
        System.out.println(totalSalesForCompleted);

        ////
        // Part 3
        // Nothing





    }
}

enum Status{
    COMPLETED,
    PENDING
}

class Product{
    private String name;
    private double price;
    private int quantity;
    private String category;
    private Status status;


    public Product(String name, double price, int quantity, String category, Status status) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}



