package org.example.others.streams_optional_real_exercises.exercise2;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>(
                Arrays.asList(
                        new Product("Mobile", 2000.0, 200, "Electronics" ),
                        new Product("Laptop", 100.0, 2000, "Electronics"),
                        new Product("TV", 3000.0, 0, "Electronics")
                )
        );

        // Part 1
        List<Product> list1 = list.stream().filter(product -> product.getQuantity()>0).toList();
        list1.forEach(product -> System.out.println(product.getName()+", "+product.getPrice()+", "+product.getQuantity()));

        ////
        // Part 2
        System.out.println();
        long totalAvailableProducts = list.stream().filter(product -> product.getQuantity()>0).count();
        System.out.println(totalAvailableProducts);

        ////
        // Part 3
        System.out.println();
        Optional<Product> optional = Optional.of(list.stream().max(Comparator.comparingDouble(Product::getPrice)).orElse(new Product("", 0, 0, "Electronics")));
        optional.ifPresent(product-> System.out.println(product.getName()));

        ////
        // Part 4
        System.out.println();
        Map<String, List<Product>> productsByCategory = list1.stream()
                .filter( product -> product.getQuantity() > 0 )
                .collect(Collectors.groupingBy(Product::getCategory));
        productsByCategory.forEach((category, productList)->{
            System.out.println("Category: "+ category);
            productList.forEach(product -> System.out.println("Product Name: "+ product.getName()+
                                                                ", Product Price: "+ product.getPrice()+
                                                                ", Product Quantity: "+ product.getQuantity()));
        });
    }
}

class Product{
    private String name;
    private double price;
    private int quantity;
    private String category;


    public Product(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
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
}
