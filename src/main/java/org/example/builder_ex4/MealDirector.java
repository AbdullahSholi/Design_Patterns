package org.example.builder_ex4;

public class MealDirector {
    public Meal createVeganMeal(){
        return new Meal.MealBuilder().setMainCourse("Vegan Meal").setDessert("Yes").setDrink("Yes").setSideDish("No").build();
    }

    public Meal createKidsMeal(){
        return new Meal.MealBuilder().setMainCourse("Kids Meal").build();
    }
}
