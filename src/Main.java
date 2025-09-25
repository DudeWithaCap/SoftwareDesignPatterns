//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car.CarBuilder()
                .setEngine("V8")
                .setSeats(2)
                .setGPS(true)
                .setColor("Red")
                .setManufacturer("Mercedes")
                .build();

        Car car2 = new Car.CarBuilder()
                .setEngine("V6")
                .setSeats(7)
                .setGPS(false)
                .setColor("White")
                .setManufacturer("Kia")
                .build();

        System.out.println(car1);
        System.out.println(car2);
    }
}