package org.example.strategy_ex1;

public class Client {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new CreditCardPayment());
        paymentContext.pay(200);

        paymentContext = new PaymentContext(new PayPalPayment());
        paymentContext.pay(400);

        paymentContext = new PaymentContext(new BankTransferPayment());
        paymentContext.pay(500);
    }
}
