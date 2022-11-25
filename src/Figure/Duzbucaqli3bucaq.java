package Figure;

public  class Duzbucaqli3bucaq extends Triangle {

    public Duzbucaqli3bucaq(int a, int b, int c) {
        super(a, b, c);
        System.out.println("Duzbucaqlidi");

    }

    @Override
    protected double area() {

        return (a*b)/2.0;
    }
}
