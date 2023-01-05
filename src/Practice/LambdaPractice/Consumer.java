package Practice.LambdaPractice;

import BankTransfer.Model.Card;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Consumer {
    public static void main(String[] args) {


        User u1 = new User("Namiq", "Qaracuxurlu", LocalDate.of(1980, 9, 22), LocalDate.of(2022, 10, 31));
        User u2 = new User("Rufet", "Nasosnu", LocalDate.of(1974, 3, 8), LocalDate.of(2022, 9, 10));
        User u3 = new User("Orxan", "Lokbatanli", LocalDate.of(1983, 12, 29), LocalDate.of(2022, 6, 18));
        User u4 = new User("Reshad", "Dagli", LocalDate.of(1978, 10, 17), LocalDate.of(2022, 3, 23));
        User u5 = new User("Vuqar", "Bileceri", LocalDate.of(1986, 1, 27), LocalDate.of(2022, 4, 8));

        ArrayList<User> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u5);


        java.util.function.Consumer<User> consumer = (User x) -> {

        };

        list.forEach(consumer);
    }}

//        public static User checkCardExpireDate(LocalDate) {
//        for (User user : list) {
//            if (LocalDate.now().isAfter(u1.getExpdate()))
//                throw new ExpiredDateException();
//
//            if (LocalDate.now().isAfter(u2.getExpdate()))
//                throw new ExpiredDateException();
//
//            if (LocalDate.now().isAfter(u3.getExpdate()))
//                throw new ExpiredDateException();
//
//            if (LocalDate.now().isAfter(u4.getExpdate()))
//                throw new ExpiredDateException();
//
//            if (LocalDate.now().isAfter(u5.getExpdate()))
//                throw new ExpiredDateException();
//        }
//    }