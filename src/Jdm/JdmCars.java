package Jdm;

public class JdmCars {
    String brand;
    String engine;
    String transmission;

    public JdmCars(String brand, String engine, String transmission) {
        this.brand = brand;
        this.engine = engine;
        this.transmission=transmission;
    }


    public JdmCars() {

    }

    @Override
    public String toString() {
        return "JdmCars{" +
                "brand='" + brand + '\'' +
                ", engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                '}';
    }
}
