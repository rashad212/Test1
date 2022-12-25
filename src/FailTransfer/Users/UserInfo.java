package FailTransfer.Users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserInfo {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User(1234, "Rashad", "Abuzarli", LocalDate.of(1999, 10, 31)));
        users.add(new User(4784, "Alex", "Lee", LocalDate.of(1995, 9, 30)));
        users.add(new User(2118, "John", "Kennedy", LocalDate.of(1942, 3, 12)));
        users.add(new User(9877, "Oleg", "Koporeyko", LocalDate.of(1973, 7, 25)));
        users.add(new User(5760, "Donald", "Trump", LocalDate.of(1980, 12, 19)));

    }

}
