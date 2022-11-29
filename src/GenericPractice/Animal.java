package GenericPractice;

public class Animal {

    String cat;
    public Animal(String cat) {
        this.cat=cat;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "cat='" + cat + '\'' +
                '}';
    }
}
