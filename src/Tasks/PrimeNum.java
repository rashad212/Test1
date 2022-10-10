package Tasks;

public class PrimeNum {

    public static void main(String[] args) {
        primeNumber();
    }
    public static void primeNumber() {
        int a = 1;

        while (a <= 100) {
            int b = 2;
            while (b < a) {
                if (a % b == 0) {
                    break;
                } else
                    b++;
            }
            if (a == b) {
                System.out.println(a);
            }
            if (a == 1) {
                System.out.println(a);
            }
            a++;
        }
    }
}




