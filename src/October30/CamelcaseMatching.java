package October30;

public class CamelcaseMatching {
    public static void main(String[] args) {
        String[] words = {"Hjkll","dewjjwdj","Hjnwnsw"};
        String pattern = "Ab";
        for (String x : words)
            System.out.println(isMatch(String.valueOf(words), pattern));

    }

    private static boolean isMatch(String words, String pattern) {
        int i = 0;
        for (char c: words.toCharArray()) {
            if (i < pattern.length() && c == pattern.charAt(i))
                i++;
            else
                return false;
        }
        return i == pattern.length();
    }
}
