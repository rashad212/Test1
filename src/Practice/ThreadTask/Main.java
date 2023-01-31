package Practice.ThreadTask;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Card> cardList = new ArrayList<>();

        cardList.add(new Card("Alex Lee", "12341234", 200, LocalDate.of(2022, 10, 18)));
        cardList.add(new Card("John Kroc", "98769876", 170, LocalDate.of(2023, 2, 14)));
        cardList.add(new Card("David Hans", "23455432", 1098, LocalDate.of(2022, 11, 7)));
        cardList.add(new Card("Madison Rule", "56788765", 74, LocalDate.of(2022, 11, 7)));

        HashMap<String, Integer> salary = new HashMap<>();

        salary.put("12341234", 200);
        salary.put("98769876", 500);
        salary.put("23455432", 700);
        salary.put("56788765", 150);

        Thread t1 = new Thread(
                () -> {
                    for (Card z : cardList)
                        z.balance += salary.get(z.cardNum);
                    System.out.println(cardList);
                }
        );

        Thread t2 = new Thread(
                () -> {
                    for (Card c : cardList)
                        System.out.println(c.getBalance() + " " + c.holderName);
                }
        );

        t1.start();
        t2.start();


    }
}
