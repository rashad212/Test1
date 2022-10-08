public class Ts1vs5 {
    public static void main(String[] args) {

        int a = 1;

        while (a <= 10000) {
            if ((a % 10 == 1) || (a % 10 == 5)) {
                System.out.println(a);
            }
            a++;
        }

    }
}
