package Figure;

public  class BeraberTerefli extends Triangle {

    public BeraberTerefli(int a, int b, int c) {
        super(a, b, c);
        System.out.println("BeraberTerefli");
    }

        @Override
        protected double area () {
            return 0;
        }
    }
