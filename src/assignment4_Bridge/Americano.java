package assignment4_Bridge;

class Americano extends Coffee {
    public Americano(Size size) {
        super(size);
    }

    public void serve() {
        System.out.print("Serving Americano ");
        size.applySize();
    }
}
