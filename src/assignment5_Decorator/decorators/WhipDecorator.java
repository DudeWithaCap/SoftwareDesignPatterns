package assignment5_Decorator.decorators;

import assignment5_Decorator.Coffee;

public class WhipDecorator extends CoffeeDecorator {
    public WhipDecorator(Coffee coffee) {

        super(coffee);
    }

    @Override
    public int cost() {
        return coffee.cost() + 150;
    }

    @Override
    public String description() {
        return coffee.description() + ", Whipped Cream ";
    }
}
