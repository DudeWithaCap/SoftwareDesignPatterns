package assignment5_Decorator.decorators;

import assignment5_Decorator.Coffee;

public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {

        super(coffee);
    }

    @Override
    public int cost() {
        return coffee.cost() + 50;
    }

    @Override
    public String description() {
        return coffee.description() + ", Sugar ";
    }
}
