package assignment2_AbstractFactory;

class Starbucks implements CoffeeShopAbstractFactory {
    public Coffee createCoffee() {
        return new Americano();
    }
    public Addon createAddon() {
        return new Cookie();
    }
}
