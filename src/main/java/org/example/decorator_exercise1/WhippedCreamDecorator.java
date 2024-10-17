package org.example.decorator_exercise1;

public class WhippedCreamDecorator extends CoffeeDecorator{
    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public int getPrice() {
        return super.getPrice() + 50;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " With Whipped Cream";
    }

}
