package Test;

public class Errors extends Throwable {
    public static void main(String[] args) {

        int a = 0, b;

        try {
            a = 2 / 1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("sehv bolme emeliyyati");
            }
        finally {
            System.out.println("pox");
        }
    }
}
