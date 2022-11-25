package Test;

public class Book01 {
    public static void main(String[] args) {

        Book b1 = new Book("Harry Potter","Rowling", 400);


        b1.setNumberOfPage(-300);
        System.out.println(b1.getPageSize());

    }
}
