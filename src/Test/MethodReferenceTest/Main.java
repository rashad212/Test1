package Test.MethodReferenceTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");
        String s = sc.nextLine();

        //    A a= (x)-> x.length();             //Labmda    (1)
        //   System.out.println(a.word(s));

        //   A a= String::length;              //Referens metod  (2)
        //   System.out.println(a.word(s));


        //   B bb = new B();                    //Non-static metod (3)
        //   A a= bb::b1;
        //   System.out.println(a.word(s));

        //   A a = B ::b2;                     //Static metod (4)
        //   System.out.println(a.word(s));


    }
}
