package GenericPractice;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        GenericBox <String> a = new GenericBox<>("car");
        GenericBox <String> b = new GenericBox<>("cat");
        GenericBox <String> c = new GenericBox<>("dog");

        String [] asd = {a.toString(), b.toString(), c.toString()};

        System.out.println(asd);


    }
}

