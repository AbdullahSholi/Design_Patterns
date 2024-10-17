package org.example.factory;

public class ChickenBurger implements Sandwich {


    @Override
    public String sandwichName() {
        return "Chicken Burger";
    }

    @Override
    public int sandwichCalories() {
        return 190;
    }

    @Override
    public void prepare(){
        System.out.println("Preparing: " + this.sandwichName()+ " calories: " + this.sandwichCalories());
    }
}
