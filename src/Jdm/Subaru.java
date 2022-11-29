package Jdm;

public class Subaru extends JdmCars {
    public Subaru(String brand, Transmission transmission, Engine engine, Model model) {
        super(brand, engine, transmission,model );
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
