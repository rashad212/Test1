package GenericExample;

public class GenericMethod {

    public <E> void genericMethod (E[] arr){
        for (E elementler : arr) {
            System.out.println(elementler);
        }
    }
}