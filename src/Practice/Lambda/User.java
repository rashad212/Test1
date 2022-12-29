package Practice.Lambda;

import java.time.LocalDate;

public class User {
    String name;
    String surname;
    LocalDate birthdate;
    LocalDate expdate;

    public User(String name, String surname, LocalDate birthdate, LocalDate expdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.expdate = expdate;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate=" + birthdate +
                ", expdate=" + expdate +
                '}';
    }
}
