package PracticeHashMap;

import java.util.*;

public class HashMapTranslate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text:");
        String text = sc.nextLine();


        HashMap<String, List<String>> translate = new HashMap<>();

        List<String> w = new ArrayList<>();
        w.add("gezmek");
        w.add("yerimek");

        List<String> t = new ArrayList<>();
        t.add("danishmaq");
        t.add("sohbet etmek");


        translate.put("walk", w);
        translate.put("swiming", Collections.singletonList("uzmek"));
        translate.put("talk", t);

        Set<String> set = translate.keySet();

        if (translate.containsKey(text)) {
            System.out.println("translation: " + translate.get(text));

        }
    }
}
