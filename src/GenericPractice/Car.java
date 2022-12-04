package GenericPractice;

public class Car {
    String car;

    Car(String car){
        this.car = car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "bmw='" + car + '\'' +
                '}';
    }
}
