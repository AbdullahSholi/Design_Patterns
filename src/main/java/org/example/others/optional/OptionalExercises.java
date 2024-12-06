package org.example.others.optional;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;

public class OptionalExercises {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("Test");
        System.out.println(opt.get());

        ////

        System.out.println();
        Optional<String> opt1 = Optional.empty();
        System.out.println(opt1.orElse("Empty"));

        ////

        System.out.println();
        List<Employee> list = new ArrayList<>(
                Arrays.asList(
                        new Employee(1, "Abdullah", 1, 2000.0),
                        new Employee(2, "Ali", 1, 1000.0),
                        new Employee(3, "Omar", 2, 3000.0)
                        )
        );

        List<Employee> list1 = list.stream().filter(employee -> employee.getDepartmentId() != 2).toList();
        Optional<Employee> opt3 = list1.stream().max(Comparator.comparingDouble(Employee::getSalary));
        opt3.ifPresent(employee -> System.out.println(employee.getSalary()));

        ////

        System.out.println();
        List<Product> list2 = new ArrayList<>(
                Arrays.asList(
                        new Product("Laptop", 1000.0, "Electronics"),
                        new Product("Mobile", 2500.0, "Electronics"),
                        new Product("Tomato", 3000.0, "Food")
                )
        );

        List<Product> list3 = list2.stream().filter(product -> product.getCategory().equals("Electronics")).collect(Collectors.toList());
        Optional<Double> opt4 = list2.stream().map(Product::getPrice).reduce(Double::sum);
        Long count = list2.stream().count();
        double averagePrice = opt3.get().getSalary()/count;
        System.out.println(averagePrice);

        Optional<Product> expensiveProduct = Optional.of(list2.stream().max(Comparator.comparingDouble(Product::getPrice)).orElse(new Product("", 0.0, "")));
        System.out.println(expensiveProduct.get().getName());

        ////




    }





}

class Employee{
    private int id;
    private String name;
    private int departmentId;
    private double salary;

    public Employee(int id, String name, int departmentId, double salary) {
        this.id = id;
        this.name = name;
        this.departmentId = departmentId;
        this.salary = salary;
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

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class Product{
    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
