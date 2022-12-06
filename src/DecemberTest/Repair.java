package DecemberTest;

import December3.Engine;
import December3.Gearbox;

public class Repair {

    int cash = 0;

//    Repair(T xarab) {
//        this.xarab = xarab;
//    }
    Repair() {
    }

    public <T> Integer servicePayment(T t) {
        if (t.getClass().equals(Mator.class)) {
            Mator engine = (Mator) t;
            if (engine.chain) cash += 500;
            if (engine.salnik) cash += 300;
        }
        if (t.getClass().equals(Karopka.class)) {
            Karopka Karopka = (Karopka) t;

            if (Karopka.yag) cash += 500;
            if (Karopka.maxavik) cash += 1000;

        }
        return cash;
    }
}
