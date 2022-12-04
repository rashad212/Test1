package Gene;

public class Factory {
    public static void main(String[] args) {

        Car aa = new Car("bmw");
        Car bb = new Car("audi");
        Car cc = new Car("benz");
        Car dd = new Car("porche");

        Box<Car> box1 = new Box<>(aa);
        Box<Car> box2 = new Box<>(bb);
        Box<Car> box3 = new Box<>(cc);
        Box<Car> box4 = new Box<>(dd);

        Box[] x = {box1, box2, box3, box4};

        for (Box xx : x) {
            System.out.println(xx.toString());
        }
    }
}

