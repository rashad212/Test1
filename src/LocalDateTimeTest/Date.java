package LocalDateTimeTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Date {
    public static void main(String[] args) {

        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("23.12.2012");

        System.out.println(dateTimeFormatter);
    }
}
