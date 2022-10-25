package October25;

import java.util.Scanner;

public class LetterCounter {
    public static void main(String[] args) {

//        String text = "Bu cumlede en cox tekrarlanan herf hansidir?";
//
//        String herf = "";
//        String tekrar = "";
//
//        for (int i=0; i<text.length();i++){
//             //      System.out.println(text.charAt(i));
//            herf += text.charAt(i);
//            System.out.println(herf);
//               }
// ------------------------------------------------------------
       String text = "Bu cumlede en cox tekrarlanan herf hansidir?";

        int textUzunlugu = text.length();
        int tekrarHerfSayi = text.replace("","").length();
        int count= textUzunlugu-tekrarHerfSayi;
        System.out.println("Tekrar sayi:"+ count);
// ------------------------------------------------------------
//        Scanner sc = new Scanner(System.in);
//        System.out.println("String daxil edin:");
//        String s1 = sc.nextLine();
//        String[] herf = s1.split(" ");
//        int count;
//        for (int i = 0; i < herf.length; i++) {
//            count = 1;
//            for (int j = i+1; j < herf.length; j++) {
//                if (herf[i].equals(herf[j])) {
//                    count = count + 1;
//                    herf[j] = "0";
//                }
//            }
//            if (herf[i] != "0") {
//                System.out.println(herf[i] + "  " + count);
//            }
//        }
// --------------------------------------------------------------------
//        String str = "bu cumledeki duplicate herfleri tapin";
//
//        int length = str.length();
//        char[] ch = str.toCharArray();
//        for (int i = 0; i < length; i++) {
//            for (int j = i + 1; j < length; j++) {
//
//                if (ch[i] == ch[j]) {
//                    System.out.println("Tekrar: " + ch[j]+"");
//                    break;
//                }
//            }
//        }

    }
}
