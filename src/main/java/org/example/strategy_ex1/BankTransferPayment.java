package org.example.strategy_ex1;

public class BankTransferPayment implements PaymentProcessor{

    @Override
    public void pay(double amount) {
        System.out.println(" Pay with Bank ");
    }
}
