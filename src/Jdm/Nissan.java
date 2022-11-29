package Jdm;

public class Nissan extends JdmCars{

    public Nissan(String brand, Transmission transmission, Engine engine, Model model) {
        super(brand, engine, transmission,model);
    }

    @Override
    public String toString() {
        return "Nissan{" +
                "model='" + brand + '\'' +
                ", engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                '}';
    }
}
