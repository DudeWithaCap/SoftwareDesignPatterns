package assignment5_Decorator;

class RegularCoffee implements Coffee {
    @Override
    public int cost() {
        return 700;
    }

    @Override
    public String description() {

        return "Regular Coffee ";
    }
}
