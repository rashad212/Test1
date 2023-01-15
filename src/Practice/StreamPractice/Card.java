package Practice.StreamPractice;

import java.time.LocalDate;
import java.util.function.Consumer;

public class Card implements Consumer<String> {
    String cardNumber;
    String holderName;
    LocalDate exp;
    Integer cvv;

    public Card(String cardNumber, String holderName, LocalDate exp, Integer cvv) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.exp = exp;
        this.cvv = cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public LocalDate getExp() {
        return exp;
    }

    public Integer getCvv() {
        return cvv;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber='" + cardNumber + '\'' +
                ", holderName='" + holderName + '\'' +
                ", exp=" + exp +
                ", cvv=" + cvv +
                '}';
    }

    @Override
    public void accept(String s) {

    }
}
