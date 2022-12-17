package PracticeHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class IntegerToRoman {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer value you want to change:");
        int input = sc.nextInt();

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, Integer> x : map.entrySet()) {

            while (input >= x.getValue()) {
                input = input - x.getValue();
                sb.append(x.getKey());
                System.out.println(sb);}

        }
    }
}
