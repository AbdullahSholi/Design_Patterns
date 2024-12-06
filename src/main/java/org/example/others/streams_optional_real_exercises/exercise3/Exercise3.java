package org.example.others.streams_optional_real_exercises.exercise3;

import javax.xml.crypto.Data;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Exercise3 {
    public static void main(String[] args) {
            List<Order> list = new ArrayList<>(
                    Arrays.asList(
                            new Order(1, 1, Arrays.asList(
                                    new Product("Mobile", 2000.0, 200, "Electronics" ),
                                    new Product("Laptop", 100.0, 2000, "Electronics"),
                                    new Product("TV", 3000.0, 0, "Electronics")
                            ), "2024-10-10"),
                            new Order(2, 1, Arrays.asList(
                                    new Product("Mobile1", 2000.0, 200, "Electronics" ),
                                    new Product("Laptop1", 100.0, 2000, "Electronics"),
                                    new Product("TV1", 3000.0, 0, "Electronics")
                            ), "2024-10-20"),
                            new Order(3, 1, Arrays.asList(
                                    new Product("Mobile2", 2000.0, 200, "Electronics" ),
                                    new Product("Laptop2", 100.0, 2000, "Electronics"),
                                    new Product("TV2", 3000.0, 0, "Electronics")
                            ), "2024-10-30")

                    )
            );
            ////
            // Part 1
            Long totalAmount = list.stream().count();
            System.out.println(totalAmount);
    //        list1.forEach(System.out::print);

            ////
            // Part 2
            Optional<Order> lastOrder = list
                    .stream().max(Comparator.comparing(Order::getDate));
            lastOrder.ifPresent(order -> System.out.println(order.getCustomerId()+" : "+order.getOrderId()));


            ////
            // Part 3
    //        List<Order> list1 = list.stream().filter(order -> order.sta)
    //        Map<Status, List<Integer>> orderByStatus = list
    //                .stream()
    //                .collect(Collectors.groupingBy(
    //                        Order::getStatus, // Map First Parameter
    //                                          // another func.    // another collector
    //                        Collectors.mapping(Order::getOrderId, Collectors.toList())
    //                // mapping for apply another function to each element before collecting them using another collector
    //                ));
    //        System.out.println(orderByStatus);

            System.out.println();

            // Additional Part
            Map<Integer, List<Integer>> orderByCustomerId = list
                    .stream()
                    .collect(Collectors.groupingBy(
                            Order::getCustomerId,
                            Collectors.mapping(Order::getOrderId, Collectors.toList())
                    ));

            System.out.println(orderByCustomerId);

        System.out.println();
        System.out.println();

            ////
            // Part 4 - Calculating average order value
        OptionalDouble sum = list
                .stream()
                .filter(order -> order.getStatus() == Status.COMPLETED).mapToDouble(Order::calculateTotalAmount).average();

        System.out.println(sum);
    }
}

enum Status {
    COMPLETED,
    PENDING
}

class Order{
    private int orderId;
    private int customerId;
    private List<Product> products;
    private Status status;
    private String date;

    public Order(int orderId, int customerId, List<Product> products, String date) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.products = products;
        this.date = date;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double calculateTotalAmount() {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
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

