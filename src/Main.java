public class Main {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int c = 5;
//        int d = 50;
//
//boolean sert1 = a<b;
//boolean sert2 = d<c;
//boolean cavab = (sert1 && sert2);
//boolean cavab2 = (a<b) && (d>c);
////System.out.println(cavab);
////System.out.println(cavab2);
//
//   boolean cavab3 = (sert1 || sert2);
//        System.out.println(cavab3);

        //  IKINCI HISSE

   int a = 10;
   int b = 5;
   int toplama = a + b;
   int cixma = a - b;
   int vurma = a * b;
   int bolme = a / b;
   int mod = a % b;
//        System.out.println("Toplama:" + toplama);
//        System.out.println("Cixma:" + cixma);
//        System.out.println("Vurma:" + vurma);
//        System.out.println("Bolme:" + bolme);
//        System.out.println("Mod:" + mod);
toplama--;
//        System.out.println(toplama);

        int num1 = 10;
        int num2 = 5;
        boolean sert = (num1 / num2)  == 2;
       // System.out.println(sert);

        boolean sert1 = (num1 > num2);
        boolean sert2 = (num2 > num1);

        boolean cavab2 = sert1 && sert2;
        System.out.println(cavab2);
        boolean cavab3 = sert1 || sert2;
        System.out.println(cavab3);

        String cavab4 = (a==b) ? "Dogru" : "Yanlis";
        System.out.println(cavab4);


    }
}