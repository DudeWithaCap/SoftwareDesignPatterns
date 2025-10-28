package assignment5_Decorator.decorators;

import assignment5_Decorator.Coffee;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int cost() {
        return coffee.cost();
    }

    @Override
    public String description() {
        return coffee.description();
    }
}
