package assignment2_Factory;

class PapaJohns extends Pizzeria {
    Pizza createPizza() {
        return new PapaJohnsPizza();
    }
}
