package Jdm;

public class CarFactory extends JdmCars{
    private static Object Engine;
    private static Object Model;

    public CarFactory(String brand, String engine, String transmission) {
        super(brand, engine, transmission);
    }

    public static void main(String[] args) {
//        String [] cars = new String[2];
        JdmCars cars2 = new JdmCars();

//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i]);

            JdmCars car1 = new Nissan("R34 GT-R", "RB26DETT", "6 gear manual", new Engine("Twinturbo", "2.6 L", 276, 353), new Model("Skyline"));
            JdmCars car2 = new Subaru("WRX STI","EJ25", "6 gear manual", new Engine("turbocharged","2.5 L",310,407), new Model("WRX STI"));

        System.out.println(car2);
        }
    }

