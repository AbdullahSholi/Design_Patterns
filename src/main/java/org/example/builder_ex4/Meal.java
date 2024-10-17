package org.example.builder_ex4;

public class Meal {
    private String mainCourse;
    private String sideDish;
    private String drink;
    private String dessert;

    public String getMainCourse() {
        return mainCourse;
    }

    public String getSideDish() {
        return sideDish;
    }

    public String getDrink() {
        return drink;
    }

    public String getDessert() {
        return dessert;
    }

    public Meal(MealBuilder builder) {
        this.mainCourse = builder.mainCourse;
        this.sideDish = builder.sideDish;
        this.drink = builder.drink;
        this.dessert = builder.dessert;
    }

    public static class MealBuilder {
        private String mainCourse;
        private String sideDish;
        private String drink;
        private String dessert;

        public MealBuilder setMainCourse(String mainCourse) {
            this.mainCourse = mainCourse;
            return this;
        }

        public MealBuilder setSideDish(String sideDish) {
            this.sideDish = sideDish;
            return this;
        }

        public MealBuilder setDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public MealBuilder setDessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        public Meal build() {
            return new Meal(this);
        }
    }
}
