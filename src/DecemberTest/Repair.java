package DecemberTest;

import December3.Engine;
import December3.Gearbox;

public class Repair<T> {
    T xarab;
    int cash = 0;

    Repair(T xarab) {
        this.xarab = xarab;
    }

    public Integer servicePayment() {
        if (xarab.getClass().equals(Mator.class)) {
            Mator engine = (Mator) xarab;
            if (engine.chain) cash += 500;
            if (engine.salnik) cash += 300;
        }
        if (xarab.getClass().equals(Karopka.class)) {
            Karopka Karopka = (Karopka) xarab;

            if (Karopka.yag) cash += 500;
            if (Karopka.maxavik) cash += 1000;

        }
        return cash;
    }
}
