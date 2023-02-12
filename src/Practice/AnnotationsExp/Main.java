package Practice.AnnotationsExp;

public class Main {
    public static void main(String[] args) {

        AnnotationsExp str = new AnnotationsExp();

        if (str.getClass().isAnnotationPresent(CheckString.class)) {
            System.out.println("String");
        } else {
            System.out.println("Not String");
        }
    }
}
