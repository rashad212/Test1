package Tasks;

import java.util.Scanner;

public class PositiveNum {


    public static void main(String[] args) {
        int say;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number:");
        say = input.nextInt();
        input.close();

        if (say > 0)
            System.out.printf("%d Musbet eded", say);
        else if (say < 0)
            System.out.printf("%d Menfi eded", say);
        else
            System.out.printf("%d Sifirdir", say);

        if(say%2==0){
            System.out.println("a cut ededdi");
        }else System.out.println("A tekdi");

    }
}
