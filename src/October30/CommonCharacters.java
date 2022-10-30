package October30;

import java.util.ArrayList;
import java.util.List;

public class CommonCharacters {

    public static void main(String[] args) {

        String[] words = new String[]{"cool", "lock", "cook"};
        for (String a : commonChars(words)) {
            System.out.println(a);

        }
        ;

    }

    public static List<String> commonChars(String[] words) {
        List<String> nese = new ArrayList<>();

        for (int i = 0; i < words[0].length(); i++) {
            int count = 0;
            String ch = String.valueOf(words[0].charAt(i));
            for (int j = 1; j < words.length; j++) {
                if (words[j].contains(ch)) {
                    count++;
                    words[j] = words[j].replaceFirst(ch, "");
                } else {
                    break;
                }
                if (count == words.length - 1) {
                    nese.add(ch);
                }

            }
        }
        return nese;
    }
}



