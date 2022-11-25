package Figure;

public  class BeraberYanli extends Triangle {

    public BeraberYanli(int a, int b, int c) {
        super(a, b, c);
        System.out.println("BeraberYanli");
    }

    @Override
    protected double area() {

        return a + b + c;

    }
}
