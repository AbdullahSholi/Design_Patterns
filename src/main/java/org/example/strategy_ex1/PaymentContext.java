package org.example.strategy_ex1;

public class PaymentContext {
    private final PaymentProcessor paymentProcessor;
    public PaymentContext( PaymentProcessor paymentProcessor ) {
        this.paymentProcessor = paymentProcessor;
    }

    public void pay( double amount ) {
        paymentProcessor.pay(amount);
    }
}
