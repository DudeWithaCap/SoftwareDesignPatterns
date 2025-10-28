package assignment5_Decorator;

import assignment5_Decorator.decorators.MilkDecorator;
import assignment5_Decorator.decorators.SugarDecorator;
import assignment5_Decorator.decorators.WhipDecorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new RegularCoffee();
        System.out.println(coffee.description() + coffee.cost() + " Tenge");

        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        coffee = new WhipDecorator(coffee);

        System.out.println(coffee.description() + coffee.cost() + " Tenge");

        coffee = new MilkDecorator(new SugarDecorator(new RegularCoffee()));

        System.out.println(coffee.description() + coffee.cost());
    }
}

