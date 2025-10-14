package assignment4_Bridge;

class Latte extends Coffee {
    public Latte(Size size) {
        super(size);
    }
    public void serve() {
        System.out.print("Serving Latte ");
        size.applySize();
    }
}
