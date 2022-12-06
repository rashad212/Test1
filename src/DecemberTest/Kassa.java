package DecemberTest;

import December3.Temir;

public class Kassa {

    public static void main(String[] args) {


        Mator jf011e = new Mator(true, false);
        Mator n54b30 = new Mator(true, true);

        Karopka aa = new Karopka(false, false);
        Karopka bb = new Karopka(false, true);
//
        Repair bsd = new Repair();


        System.out.println(bsd.servicePayment(jf011e));
        System.out.println(bsd.servicePayment(n54b30));
        System.out.println(bsd.servicePayment(aa));
        System.out.println(bsd.servicePayment(bb));



//        Repair<Mator> asd = new Repair<>(n54b30);
//        System.out.println(asd.servicePayment());
//
//        Repair<Karopka> audi = new Repair<>(aa);
//        Repair<Karopka> bmw = new Repair<>(bb);
////
//        System.out.println(audi.servicePayment());
//        System.out.println(bmw.servicePayment());
    }
}
