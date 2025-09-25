package assignment2_AbstractFactory;

public class Sheker implements CoffeeShopAbstractFactory {
    public Coffee createCoffee(){
        return new Latte();
    }
    public Addon createAddon(){
        return new Donut();
    }
}
