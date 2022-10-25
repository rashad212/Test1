package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayT2 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//            System.out.println("Arrayin olcusunu daxil edin=");
//                int[] tamEdedler = new int[sc.nextInt()];
//
//                for (int i = 0; i < tamEdedler.length; i++) {
//                 System.out.println(i + " index = ");
//                 System.out.println(tamEdedler[i] = sc.nextInt());
//                }
//        Arrays.sort(tamEdedler);
//        for (int i1 : tamEdedler) {
//            System.out.println(i1);
//        }
        findIndex();
    }

    public static void findIndex() {
        int[] array = {3, 6, 8, 9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Reqem daxil edin:");
        int number = sc.nextInt();

        int index = 0;
        int b = 0;

        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                System.out.println(i);
            }
            if (number<array[i]) {
                System.out.println(i);
            }
        }
//        for (int x : array) {
//            if (number == x) {
//                System.out.println(index);
//            }
//            index++;
//            if (x != number) {
//                System.out.println(b + 1);
//               }
//
//        }
    }
}

