package org.example.factory;

public class SandwichFactory {
    // وظيفته بس أطلب نوع من أنواع الساندويتش يرجعلي اياها

    public static final int CHEESE_BURGER = 1;
    public static final int CHICKEN_BURGER = 2;
    public static Sandwich createSandwich( int sandwichId ) { // هون بنحدّد الداتاتاييب اللي بدنا نرجع أو نصنّع السندويشة بناء عليه
        switch ( sandwichId ) {
            case CHEESE_BURGER:
                return new CheeseBurger();
            case CHICKEN_BURGER:
                return new ChickenBurger();
            default:
                return null;
        }
    }
}
