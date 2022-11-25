package Jdm;

public class Transmission {
    String type;

    public Transmission(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "type='" + type + '\'' +
                '}';
    }
}
