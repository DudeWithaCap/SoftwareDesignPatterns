package assignment2_AbstractFactory;

public class AbstractFactory {
    public static void main(String[] args){
        CoffeeShopAbstractFactory factory = new Sheker();

        Coffee coffee = factory.createCoffee();
        Addon addon = factory.createAddon();

        coffee.brew();
        addon.serve();
    }
}
