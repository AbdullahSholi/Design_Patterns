package org.example.others.streams_optional_real_exercises.exercise4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class CRMSystem {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>(
                Arrays.asList(
                        new Customer(1, "Abdullah1", LocalDate.of(2024, 10, 1), "abdullah.sholi@gmail.com", 10, "Nablus"),
                        new Customer(2, "Abdullah2", LocalDate.of(2022, 10, 3), "ali.hamadneh@gmail.com", 30, "Nablus"),
                        new Customer(3, "Abdullah3", LocalDate.of(2022, 10, 4), "groupgroup060@gmail.com", 40, "Ramallah"),
                        new Customer(4, "Abdullah4", LocalDate.of(2023, 10, 1), "groupgroup060@gmail.com", 50, "Ramallah")
                )
        );
        System.out.println();
        System.out.println();
        ////
        // Part 1
        List<Customer> listOfCustomersWhichPurchaseLastYear = customers
                .stream()
                .filter(customer -> customer.getLastPurchaseDate().isAfter(LocalDate.now().minusYears(1))).toList();
        listOfCustomersWhichPurchaseLastYear.forEach(customer -> System.out.println("Customer name: "+customer.getName()));

        System.out.println();
        ////
        // Part 2 - customer emails
        List<Customer> customerEmails = customers
                .stream().filter(customer -> customer.getAmount() > 20).toList();
        customerEmails.forEach(customer -> System.out.println("Customer name: "+customer.getName()+", Amount: "+customer.getAmount()));

        System.out.println();
        ////
        // Part 3 - customer's latest purchase
        Optional<LocalDate> customerLatestPurchase = customers.stream().map(Customer::getLastPurchaseDate).max(Comparator.naturalOrder());
        // Comparator.naturalOrder() --> used to compare 2 fields according to their natural ordering.
        customerLatestPurchase.ifPresent(date -> System.out.println("Date: "+ date));
        if( customerLatestPurchase.isEmpty() ){
            System.out.println("No purchases found! ");
        }

        System.out.println();
        ////
        // Part 4
        Map<String, List<Customer>> groupCustomerByRegion = customers
                .stream()
                .collect(Collectors.groupingBy(
                         Customer::getRegion,
                        Collectors.toList()
                        ));
        for( Map.Entry<String, List<Customer>> e : groupCustomerByRegion.entrySet() ){

            for(Customer c : e.getValue()){
                System.out.print("Region: "+e.getKey()+" <--> ");
                System.out.println("Customer name: "+c.getName());
            }
        }

    }
}

class Customer{
    private int id;
    private String name;
    private LocalDate lastPurchaseDate;
    private String email;
    private int amount;
    private String region;

    public Customer(int id, String name, LocalDate lastPurchaseDate, String email, int amount, String region) {
        this.id = id;
        this.name = name;
        this.lastPurchaseDate = lastPurchaseDate;
        this.email = email;
        this.amount = amount;
        this.region = region;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getLastPurchaseDate() {
        return lastPurchaseDate;
    }

    public void setLastPurchaseDate(LocalDate lastPurchaseDate) {
        this.lastPurchaseDate = lastPurchaseDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
