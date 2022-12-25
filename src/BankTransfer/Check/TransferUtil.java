package BankTransfer.Check;
import BankTransfer.Exceptions.CardNotFoundException;
import BankTransfer.Exceptions.ExpiredCardException;
import BankTransfer.Exceptions.InsufficientBalanceExceptions;
import BankTransfer.Model.Card;

import java.time.LocalDate;
import java.util.List;

public class TransferUtil {

    public static Card checkUserCard(Integer userId, List<Card> cardList){
        for (Card card: cardList){
            if(card.getUserId()==userId){
                return card;
            }
        }
        throw  new CardNotFoundException();

    }
    public static Card checkCardExist(String  cardNumber, List<Card> cardList){
        for (Card card: cardList){
            if(card.getCardNum().equals(cardNumber)){
                if(LocalDate.now().isAfter( card.getExpireDate()))
                    throw new ExpiredCardException();
                return card;
            }
        }
        throw  new CardNotFoundException();

    }

    public static void checkBalance(Card senderCard, Double amount) {
        if (!(senderCard.getBalance()>=amount)){
            throw new InsufficientBalanceExceptions();
        }
    }
}