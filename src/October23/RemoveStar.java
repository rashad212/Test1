package October23;


class RemoveStar {

    public static void main(String[] args) {

        String s1 = "leet**cod*e";
        System.out.println(removeStar(s1));

    }

    public static String removeStar(String s) {

        StringBuilder sb = new StringBuilder();
        int lenght = s.length(), counter = 0;

        for (int i = lenght - 1; i >= 0; i--) {
            if (s.charAt(i) == '*') {
                counter++;
            } else {
                if (counter == 0) {
                    sb.append(s.charAt(i));
                } else {
                    counter--;
                }
            }
        }
        return sb.reverse().toString();
    }
}