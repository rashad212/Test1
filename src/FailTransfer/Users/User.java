package FailTransfer.Users;

import java.time.LocalDate;

public class User {
    Integer id;
    String name;
    String surname;
    LocalDate birthdate;

    public User(Integer id, String name, String surname, LocalDate birthdate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }
}
