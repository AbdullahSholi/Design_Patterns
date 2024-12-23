package org.example.decorator;

public abstract class CoffeeDecorator implements Coffee{
    private final Coffee coffee;
    public CoffeeDecorator( Coffee coffee ){
        this.coffee = coffee;
    }

    @Override
    public double getPrice() {
        return coffee.getPrice();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
}