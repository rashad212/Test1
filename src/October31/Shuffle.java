package October31;

public class Shuffle {
    public static void main(String[] args) {

        String a = "leetcode";
        int[] index = {0, 1, 2, 3, 4, 5, 6, 7};

        int b = a.length();
        char[] z = new char[b];

        for (int i = 0; i < b; i++) {
            z[index[i]] = a.charAt(i);
        }
        System.out.println(z);
    }
}
