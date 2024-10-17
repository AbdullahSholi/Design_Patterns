package org.example.strategy_ex1;

public class CreditCardPayment implements PaymentProcessor{

    @Override
    public void pay(double amount) {
        System.out.println(" Pay via CreditCard ");
    }
}
