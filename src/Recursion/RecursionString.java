package Recursion;

import java.util.Scanner;

public class RecursionString {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter the word: ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            int n = s.length() - 1;
            System.out.println(reverse(n, s));
        }
    }

    static String reverse(int n, String s) {

        if (n == 0) return s.charAt(0) + "";

        return s.charAt(n) + reverse(n - 1, s);
    }
}
