package assignment2_Factory;

public class factory {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Dodo();
        Pizza pizza = pizzeria.createPizza();
        pizza.prepare();
    }
}

