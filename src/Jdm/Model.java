package Jdm;

public class Model {
    String model;

    public Model(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Model{" +
                "model='" + model + '\'' +
                '}';
    }
}
