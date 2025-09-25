class Car { //Description for cars
    private String engine;
    private final int seats;
    private final boolean hasGPS;
    private final String color;
    private final String manufacturer;

    private Car(CarBuilder builder) { //Constructor
        this.engine = builder.engine;
        this.seats = builder.seats;
        this.hasGPS = builder.hasGPS;
        this.color = builder.color;
        this.manufacturer = builder.manufacturer;
    }

    @Override
    public String toString() {
        return "Car [Engine: " + engine + ", Seats: " + seats + ", GPS: " + hasGPS + ", Color: " + color + " , Manufacturer: " + manufacturer + "]";
    }


    public static class CarBuilder { //Car Builder
        private String engine;
        private int seats;
        private boolean hasGPS;
        private String color;
        private String manufacturer;

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this; // to return given stats
        }

        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder setGPS(boolean hasGPS) {
            this.hasGPS = hasGPS;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }
        public CarBuilder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
