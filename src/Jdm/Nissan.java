package Jdm;

public class Nissan extends JdmCars{
    public Nissan(String model, String engine, String transmission, Engine twinturbo, Model model1) {
        super(model, engine, transmission);
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
