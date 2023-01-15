package Practice.StreamPractice;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static Practice.StreamPractice.CurrencyEnum.AZN;

public class Main {
    public static void main(String[] args) {


        List<User> userler = Arrays.asList(new User("Rashad", "Abuzarli", LocalDate.of(1999, 10, 31), 20.42, AZN),
                new User("Alex", "Lee", LocalDate.of(1991, 3, 21), 18.4, AZN),
                new User("David", "Chloei", LocalDate.of(1995, 5, 4), 14.08, AZN),
                new User("Madison", "Ruff", LocalDate.of(2001, 12, 11), 9.12, AZN),
                new User("Kate", "Holmes", LocalDate.of(1989, 7, 9), 23.10, AZN));

        userler.stream();


    }
}