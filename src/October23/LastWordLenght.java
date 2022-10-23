package October23;

public class LastWordLenght {
    public static void main(String[] args) {

        String text = "hello qwer";
        int i = text.length() - 1, length = 0;

        while (i >= 0 && text.charAt(i) == ' ')

        while (i >= 0 && text.charAt(i) != ' ') {
            length++;
            i--;
        }
        System.out.println(length);
    }
}
