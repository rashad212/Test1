package Jdm;

public class Engine  {
    String type;
    String size;
    Integer horsePower;
    Integer torque;

    public Engine(String type, String size, Integer hp, Integer torque) {
        this.type = type;
        this.size = size;
        this.horsePower = hp;
        this.torque = torque;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", horsePower=" + horsePower +
                ", torque=" + torque +
                '}';
    }
}
