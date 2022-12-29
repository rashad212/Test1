package Practice.LambdaPractice;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public LocalDate getExpdate() {
        return expdate;
    }

    public void setExpdate(LocalDate expdate) {
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
