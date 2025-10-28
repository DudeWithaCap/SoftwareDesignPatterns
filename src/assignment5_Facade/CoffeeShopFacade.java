package assignment5_Facade;

class CoffeeShopFacade {
    private CoffeeBeans beans;
    private EspressoMachine espressoMachine;
    private HotWater water;

    public CoffeeShopFacade() {
        beans = new CoffeeBeans();
        espressoMachine = new EspressoMachine();
        water = new HotWater();
    }

    public void orderCoffee(String type) {
        System.out.println("\nCustomer ordered: " + type + "\n");

        beans.PrepareCoffeeBeans();
        espressoMachine.brewEspresso();
        water.addHotWater();

        System.out.println("\nYour " + type + " is ready!");
    }
}
