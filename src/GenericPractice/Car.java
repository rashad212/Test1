package GenericPractice;

public class Car {
    String bmw;

    Car(String bmw){
        this.bmw=bmw;
    }

    @Override
    public String toString() {
        return "Car{" +
                "bmw='" + bmw + '\'' +
                '}';
    }
}
