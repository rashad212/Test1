package Practice.StreamPractice;

import java.time.LocalDate;

public class User {
    String name;
    String surname;
    LocalDate birthdate;
    Double paidAmount;
    CurrencyEnum currency;

    public User(String name, String surname, LocalDate birthdate, Double paidAmount, CurrencyEnum azn) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.paidAmount = paidAmount;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public Double getPaidAmount() {
        return paidAmount;
    }

    public CurrencyEnum getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate=" + birthdate +
                ", paidAmount=" + paidAmount +
                ", currency=" + currency +
                '}';
    }
}
