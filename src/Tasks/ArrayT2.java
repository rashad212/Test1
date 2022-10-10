package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayT2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            System.out.println("Arrayin olcusunu daxil edin=");
                int[] tamEdedler = new int[sc.nextInt()];

                for (int i = 0; i < tamEdedler.length; i++) {
                 System.out.println(i + "index = ");
                 System.out.println(tamEdedler[i] = sc.nextInt());
                }
        Arrays.sort(tamEdedler);
        for (int i : tamEdedler) {
            System.out.println(i);
        }
    }
}

