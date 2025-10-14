package assignment4_Bridge;

public class BridgeCoffee {
    public static void main(String[] args) {
        Coffee smallAmericano = new Americano(new Small());
        Coffee largeLatte = new Latte(new Large());
        Coffee mediumFlatWhite = new FlatWhite(new Medium());

        smallAmericano.serve();
        largeLatte.serve();
        mediumFlatWhite.serve();
    }
}

