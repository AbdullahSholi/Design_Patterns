package org.example.template_method_design_pattern;

public abstract class BeverageMaker {
    public final void makeBeverage(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling Water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }
}
