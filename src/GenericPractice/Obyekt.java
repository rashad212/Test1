package GenericPractice;

public class Obyekt {
    String book;

    public Obyekt(String book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Obyekt{" +
                "book='" + book + '\'' +
                '}';
    }
}
