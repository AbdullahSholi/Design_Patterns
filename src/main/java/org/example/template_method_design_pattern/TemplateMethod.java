package org.example.template_method_design_pattern;

public class TemplateMethod {
    public static void main(String[] args) {
        System.out.println("Making Tea: ");
        BeverageMaker teaMaker = new TeaMaker();
        teaMaker.makeBeverage();
        System.out.println("----------------------------");
        BeverageMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.makeBeverage();

    }
}
