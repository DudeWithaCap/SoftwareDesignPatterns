package assignment4_Bridge;

class FlatWhite extends Coffee {
    public FlatWhite(Size size) {
        super(size);
    }

    public void serve() {
        System.out.print("Serving Flat White ");
        size.applySize();
    }
}
