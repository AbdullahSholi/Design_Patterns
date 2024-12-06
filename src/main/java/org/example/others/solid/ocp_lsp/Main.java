package org.example.others.solid.ocp_lsp;

abstract class Employee {
    private String name;
    private String id;
    private double salary;
    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    abstract void printEmployee() ;
}

class RegularEmployee extends Employee{
    public RegularEmployee(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void printEmployee() {
        System.out.println("Name: " + getName() + ", ID: " + getId() + ", Salary: " + getSalary());
    }
}

class Manager extends Employee {
    private String department;
    public Manager(String name, String id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }


    @Override
    public void printEmployee() {
        System.out.println("Name: " + getName() + ", ID: " + getId() + ", Salary: " + getSalary());
    }
}
class EmployeeManager {
    private Employee[] employees;
    private int currentIndex;
    public EmployeeManager(int size) {
        employees = new Employee[size];
        currentIndex = 0;
    }
    public void addEmployee(Employee e) {
        employees[currentIndex++] = e;
    }
    public void printEmployee() {
        for (Employee e : employees) {
            if (e != null) {
                e.printEmployee();
            }
        }
    }

}
public class Main {
    public static void main(String[] args) {
        EmployeeManager em = new EmployeeManager(10);
        Employee e1 = new RegularEmployee("John", "123", 50000);
        Employee e2 = new RegularEmployee("Jane", "124", 55000);
        Employee m1 = new Manager("Mike", "125", 70000, "Sales");
        Employee m2 = new Manager("Mary", "126", 80000, "Marketing");
        em.addEmployee(e1);
        em.addEmployee(e2);
        em.addEmployee(m1);
        em.addEmployee(m2);
//        em.printEmployees();
//        em.printManagers();
        em.printEmployee();
    }
}