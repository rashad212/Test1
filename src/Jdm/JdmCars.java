package Jdm;

public abstract class JdmCars {
    String brand;
    Engine engine;
    Transmission transmission;
    Model model;

    public JdmCars(String brand, Engine engine, Transmission transmission,Model model) {
        this.brand = brand;
        this.engine = engine;
        this.transmission=transmission;
        this.model=model;
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
