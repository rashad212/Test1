package FailTransfer.Cards;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CardInfo {
    public static void main(String[] args) {

        Card abb = new Card("Rashad", "2200326980769844", LocalDate.of(2022, 3, 15), 455, 1000.0, 1234);
        Card xalq = new Card("Alex", "5500326980769089", LocalDate.of(2022, 5, 13), 122, 2500.0, 4784);
        Card uni = new Card("John", "7700326980769865", LocalDate.of(2022, 12, 9), 878, 5000.0, 2118);
        Card yapikredi = new Card("Oleg", "9900326980769337", LocalDate.of(2022, 12, 27), 901, 1000.0, 9877);
        Card kapital = new Card("Donald", "8800326980769856", LocalDate.of(2022, 11, 22), 047, 1000.0, 5760);

        List<Card> cards = new ArrayList<>();

        cards.add(abb);
        cards.add(xalq);
        cards.add(uni);
        cards.add(yapikredi);
        cards.add(kapital);

    }


}
