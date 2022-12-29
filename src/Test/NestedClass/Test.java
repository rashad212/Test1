package Test.NestedClass;

public class Test {

    private int a = 10;

    public class Inner {
        int a = 1;

        public void run() {
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Test.this.a);
        }
    }
    public void run(){
        System.out.println(a);
        System.out.println(this.a);
        Inner i = new Inner();
        System.out.println(i.a);
    }

}
//    public static void main(String[] args) {
//        int[] a = {12, 2, 3};
//        int[] b = a;
//
//        System.out.println(b);
//    }