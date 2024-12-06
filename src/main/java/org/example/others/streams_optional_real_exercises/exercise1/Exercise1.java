package org.example.others.streams_optional_real_exercises.exercise1;

import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        List<Employee> list1 = new ArrayList<>(
                Arrays.asList(
                        new Employee(1, "Abdullah", "Electronics", 2000.0),
                        new Employee(2, "Ahmed", "Food", 1000.0),
                        new Employee(3, "Ali", "Support", 1500.0),
                        new Employee(4, "Omar", "Electronics", 3000.0)
                )
        );

        // Part 1
        List<Employee> list2 = list1.stream().filter(employee -> employee.getSalary()>1000).toList();
        System.out.println(list2);

        ////
        // Part 2
        System.out.println();
        List<Employee> list3 = list1.stream().filter(employee -> employee.getDepartment().equals("Electronics")).toList();
        System.out.println(list3);

        ////
        // Part 3
        System.out.println();
        Optional<Employee> optional = Employee.getMaxSalary(list1);
        optional.ifPresent(employee -> System.out.println("Employee with max salary: " + employee.getName() +
                " (Salary: " + employee.getSalary() + ")"));

        ////
        // Part 4
        System.out.println();
        List<String> list4 = list1.stream().filter(department -> department.getDepartment().equals("Electronics")).map(Employee::getName).toList();
        list4.forEach(System.out::print);
    }
}

class Employee{
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static Optional<Employee> getMaxSalary(List<Employee> list){
        return list.stream().max(Comparator.comparingDouble(Employee::getSalary));
    }
}
