package DecemberTest;

import December3.Temir;

public class Kassa {

    public static void main(String[] args) {


        Mator jf011e = new Mator(true, true);
        Mator n54b30 = new Mator(true, true);

        Karopka aa = new Karopka(true, true);
        Karopka bb = new Karopka(false, true);

        Repair<Mator> bsd = new Repair<>(jf011e);
        Repair<Mator> asd = new Repair<>(n54b30);

        Repair<Karopka> audi = new Repair<>(aa);
        Repair<Karopka> bmw = new Repair<>(bb);

        System.out.println(audi.servicePayment());
        System.out.println(bmw.servicePayment());
    }
}
