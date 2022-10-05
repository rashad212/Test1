import java.util.Scanner;

public class TekEded {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a= 1;
        a = input.nextInt();
        while (a <=100){

            if(a%2==1) {
                System.out.println(a);
            };
            a++;
        };
    }
}




