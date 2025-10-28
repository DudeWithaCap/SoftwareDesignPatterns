package assignment5_Decorator.decorators;

import assignment5_Decorator.Coffee;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int cost() {
        return coffee.cost() + 200;
    }

    @Override
    public String description() {
        return coffee.description() + ", Milk ";
    }
}
