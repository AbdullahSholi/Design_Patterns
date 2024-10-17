package org.example.decorator_exercise1;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Sugar";
    }

}
