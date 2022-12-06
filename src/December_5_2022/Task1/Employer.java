package December_5_2022.Task1;

public abstract class Employer {

    protected String name;
    protected String surname;
    protected Integer experience;

    public Employer(String name, String surname, Integer experience) {
        this.name = name;
        this.surname = surname;
        this.experience = experience;
    }

    public Employer() {
    }

    @Override
    public String toString() {
        return "Employers{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", experience=" + experience +
                '}';
    }
}
