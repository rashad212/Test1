package Practice.ThreadTask;

import java.time.LocalDate;

public class Card {

    String holderName;
    String cardNum;
    int balance;
    LocalDate expDate;

    public Card(String holderName, String cardNum, int balance, LocalDate expDate) {
        this.holderName = holderName;
        this.cardNum = cardNum;
        this.balance = balance;
        this.expDate = expDate;
    }

    public String getHolderName() {
        return holderName;
    }

    public String getCardNum() {
        return cardNum;
    }

    public int getBalance() {
        return balance;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    @Override
    public String toString() {
        return "Card{" +
                "holderName='" + holderName + '\'' +
                ", cardNum='" + cardNum + '\'' +
                ", balance=" + balance +
                ", expDate=" + expDate +
                '}';
    }
}
