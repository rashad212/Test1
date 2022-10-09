import java.util.Scanner;

public class Polindrom {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int r=0;
        int a = sc.nextInt();
        int x = a;
        int rev = 0;

        while (a>0) {
            int b = a % 10;
            r = (r * 10) + b;
            a = a / 10;
        }
        if (x==r){
            System.out.println(r + " Palindromdur");
        }
        else {
            System.out.println(x + " Palindrom deyil");
        }
        }
    }