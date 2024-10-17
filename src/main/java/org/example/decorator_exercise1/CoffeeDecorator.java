package org.example.decorator_exercise1;

public abstract class CoffeeDecorator implements Coffee{
    private final Coffee coffee;
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getPrice() {
        return coffee.getPrice();
    }

    public String getDescription() {
        return coffee.getDescription();
    }

}
