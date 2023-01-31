package Test.ReflectionTest;

public class Main {
    public static void main(String[] args) {
        try {
            Class worker = Class.forName("Worker");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

//              Use it in src package
