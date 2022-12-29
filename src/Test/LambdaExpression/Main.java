package Test.LambdaExpression;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.print();

        Printable lambdaPrintable = () -> System.out.println("Meow2");
        printThing(lambdaPrintable);

        printThing(                 //   ( () -> System.out.println("Meow") );
                () -> {
                    System.out.println("Meow3");
                }
        );
    }

        static void printThing (Printable thing){
            thing.print();
        }
    }