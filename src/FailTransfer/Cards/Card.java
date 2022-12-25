package FailTransfer.Cards;

import java.time.LocalDate;

public class Card {
    String holderName;
    String cardNumber;
    LocalDate expireDate;
    Integer cvv;
    Double balance;
    Integer userId;

    public Card(String holderName, String cardNumber, LocalDate expireDate, Integer cvv, Double balance, Integer userId) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
        this.cvv = cvv;
        this.balance = balance;
        this.userId = userId;
    }
}
