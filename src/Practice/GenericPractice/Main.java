package Practice.GenericPractice;

public class Main {
    public static void main(String[] args) {


        Animal a = new Animal("Mia");
        Car b = new Car("bmw");
        Obyekt c = new Obyekt("stol");

        GenericBox<Animal> box1=new GenericBox<>(a);
        GenericBox<Car> box2=new GenericBox<>(b);
        GenericBox<Obyekt> box3=new GenericBox<>(c);


        GenericBox [] boxArr={box1, box2, box3};

        for (GenericBox box:boxArr) {
            box.print();
        }
    }
}

