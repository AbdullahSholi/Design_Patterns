package org.example.template_method_design_pattern;

public class CoffeeMaker extends BeverageMaker{

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
