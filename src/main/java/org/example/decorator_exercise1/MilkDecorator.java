package org.example.decorator_exercise1;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 30;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Milk";
    }

}
