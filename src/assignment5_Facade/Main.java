package assignment5_Facade;

public class Main {
    public static void main(String[] args) {
        CoffeeShopFacade coffeeShop = new CoffeeShopFacade();
        String coffeeType = "Latte";
        coffeeShop.orderCoffee(coffeeType);


    }
}

