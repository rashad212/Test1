//import java.util.Scanner;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class homeWork{
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//int a, b ;
//
//        System.out.println("Decminal :");
//        a = input.nextInt();
//        System.out.println("binary :");
//        b = input.nextInt();
//        System.out.println("Decminal :" +a);
//        System.out.println("binary :" +b);
//
//        int a = 10;
//        int b = 2;
//        int c = 25;
//
//        if(a==b) {
//            System.out.println("A ve B saylari beraberdir :");
//        }
//    else {
//            System.out.println("A ve B saylari beraber deyildir :");
//        }
//        if (b==c) {
//            System.out.println("B ve C beraberdir.");
//        }
//        else if (a > c) {
//            System.out.println("A boyukdur C'den'");
//        }
//        else {
//            System.out.println("B ve C beraber degil");
//        }
//        if ((a<c) && (a<b)) {
//            System.out.println("A en balaca saydir.");
//        }
//        else if ((c<a) && (c<b)){
//            System.out.println("C en balaca saydir.");
//        }
//        else {
////            System.out.println("B en balaca saydir.");
////        }
//         boolean keepGoing = true;
//         int result = 15, meters = 10;
//         do {
//             meters--;
//             if(meters==8) keepGoing = false;
//             result -= 2;
//             } while (keepGoing);
//         System.out.println(result);
  public static void main (String[] args){
    Scanner scan = new Scanner( System.in);
    int toplama = 0;
    int input;
    while(true) {
      System.out.println("Bir eded daxil edin : ");
      input = scan.nextInt();

      if (input < 0) {
        System.out.println("Emeliyyat Bitdi, Menfi Eded girdiniz!!");
        System.out.println("Daxil edilen tek ededler toplami : " + toplama);
        break;
      }
      if (input %2 == 1 ) {
      toplama += input;
      }
      }
    }
  }


