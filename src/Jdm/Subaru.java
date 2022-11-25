package Jdm;

public class Subaru extends JdmCars {
    public Subaru(String model, String engine, String transmission, Engine turbocharged, Model wrx_sti) {
        super(model, engine, transmission);
    }

    @Override
    public String toString() {
        return "Subaru{" +
                "model='" + brand + '\'' +
                ", engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                '}';
    }
}
