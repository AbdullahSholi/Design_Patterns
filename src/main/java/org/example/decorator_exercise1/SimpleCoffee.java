package org.example.decorator_exercise1;

public final class SimpleCoffee implements Coffee {
    @Override
    public int getPrice() {
        return 30;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }


}
