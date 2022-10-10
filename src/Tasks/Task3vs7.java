package Tasks;

import java.util.Scanner;

public class Task3vs7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir eded daxil edin:");
        int a = sc.nextInt();
        System.out.println("Ikinci ededi daxil edin:");
        int b = sc.nextInt();
        int c, d;
        if (a < b) {
            c = a;
            d = b;
        } else {
            c = b;
            d = a;
        }

//        for(int i=c;i <= d;i++)
//            if (i % 3 == 0 && i % 7 == 0)
//                System.out.println(i);


        for (;c<=d;c++)
            if (c % 3 == 0 && c % 7 == 0) {
                System.out.println(c);
            }
//        while (c <= d) {
//            if (c % 3 == 0 && c % 7 == 0) {
//                System.out.println(c);
//            }
//            c++;
//        }
    }
}
