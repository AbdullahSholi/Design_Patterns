package org.example.strategy_ex1;

public class PayPalPayment implements PaymentProcessor{

    @Override
    public void pay(double amount) {
        System.out.println(" Pay with PayPal ");
    }
}
