package org.example.factory;

public class CheeseBurger implements Sandwich{

    @Override
    public String sandwichName() {
        return "Cheese Burger";
    }

    @Override
    public int sandwichCalories() {
        return 150;
    }

    @Override
    public void prepare(){
        System.out.println("Preparing: " + this.sandwichName()+ " calories: " + this.sandwichCalories());
    }
}
