package org.example.builder_ex4;

public class Executer {
    public static void main(String[] args) {
        MealDirector director = new MealDirector();

        Meal veganMeal = director.createVeganMeal();
        Meal kidsMeal = director.createKidsMeal();
        System.out.println(kidsMeal.getMainCourse());
        System.out.println(veganMeal.getMainCourse());
    }
}
