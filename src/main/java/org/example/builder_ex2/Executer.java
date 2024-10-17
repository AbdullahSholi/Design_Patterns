package org.example.builder_ex2;

public class Executer {
    public static void main(String[] args) {
        Order order = new Order
                .OrderBuilder()
                .setOrderId(1)
                .setCustomerName("Ali")
                .setQuantity("300")
                .build();
        System.out.println("Order Id: " + order.getOrderId());
        System.out.println("Customer Name: " + order.getCustomerName());
        System.out.println("Quantity: " + order.getQuantity());
    }
}
