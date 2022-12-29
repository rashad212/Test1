package Test.NestedClass;

import Test.NestedClass.LocalClass;

public class Main {
     public static void main(String[] args) {

        Test outer = new Test();
        Test.Inner inner = outer.new Inner();

//        inner.run();

        LocalClass l = new LocalClass();
//        l.run();

//        Anonim a = new Anonim();
//        a.run();

         Anonim a = new Anonim() {
             public void run(){
                 System.out.println("Anonim sinfine aid run metodu");
             }
         };

         a.run();
    }
}
