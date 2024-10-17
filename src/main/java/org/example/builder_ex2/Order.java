package org.example.builder_ex2;

public class Order {
    private final int orderId;
    private final String customerName;
    private final String quantity;

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getQuantity() {
        return quantity;
    }


    public Order( OrderBuilder builder) {
        this.orderId = builder.orderId;
        this.customerName = builder.customerName;
        this.quantity = builder.quantity;
    }

    public static class OrderBuilder {
        private int orderId;
        private String customerName;
        private String quantity;

        public OrderBuilder setOrderId(int orderId) {
            this.orderId = orderId;
            return this;
        }

        public OrderBuilder setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public OrderBuilder setQuantity(String quantity) {
            this.quantity = quantity;
            return this;
        }


        public Order build() {
            return new Order(this);
        }


    }
}
