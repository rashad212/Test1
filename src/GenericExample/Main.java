package GenericExample;

public class Main {
    public static void main(String[] args) {

        /* Test 1 */

        Test<Integer> a = new Test<>(13);
        System.out.println(a.getObj());

        Test<String> i = new Test<>("No hesitation");
        System.out.println(i.getObj());

        /* Test 2 */

        Test2<Integer, String> b = new Test2<>(99, "Baku");
        b.print();

        /* Test 3 */

        Integer[] intArr = {1, 2, 3};
        Double[] doubleArr = {1.1, 2.1, 3.1};
        Character[] chArr = {'A', 'B', 'C'};

        GenericMethod genericMethod= new GenericMethod();
        genericMethod.genericMethod(intArr);
        genericMethod.genericMethod(doubleArr);
        genericMethod.genericMethod(chArr);
    }

//    public static  <E> void genericMethod(E[] arr) {
//        for (E item : arr) {
//            System.out.println(item);
//        }
//    }
}
