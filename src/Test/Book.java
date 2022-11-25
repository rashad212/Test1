package Test;

public class Book {
    public String name, author;
    private Integer numberOfPage;

    Book(String name, String author, Integer numberOfPage) {
        this.name = name;
        this.author = author;
        if (numberOfPage < 1) {
            this.numberOfPage = 450;
        } else {
            this.numberOfPage = numberOfPage;
        }
    }

    public int getPageSize() {
        return this.numberOfPage;
    }

    public void setNumberOfPage(int size) {

        if (size < 1) {
            System.out.println("Size of pages can't be negative !");
            this.numberOfPage = 100;
        }
        else {
            this.numberOfPage= size;
        }
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name= name;
    }
}

