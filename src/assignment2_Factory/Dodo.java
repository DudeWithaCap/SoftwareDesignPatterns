package assignment2_Factory;

class Dodo extends Pizzeria {
    Pizza createPizza() {
        return new DodoPizza();
    }
}
