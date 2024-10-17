package org.example.factory;

public class Executer {
    public static void main(String[] args) {
        Sandwich sandwich = SandwichFactory.createSandwich(1);
        sandwich.prepare();

    }
}
