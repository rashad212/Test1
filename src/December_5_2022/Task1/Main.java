package December_5_2022.Task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employer mng = new Manager("John", "Wick", 5);
        Employer dev = new Developer("Alex", "Lee", 3);
        Employer ts = new Tester("Robin", "Martinez", 6);
//      ArrayList <Office> emp = new ArrayList<Office>((Collection<? extends Office>) dev);
        List<Employer> emp = new ArrayList<>();
        emp.add(mng);
        emp.add(dev);
        emp.add(ts);

        Collections.sort(emp, new Muqayise<>());

        List<String> stringList = List.of("1", "2", "23", "4");
        Collections.sort(stringList);

        emp.forEach(System.out::println);


//        System.out.println(asd.compareTo(bcd));

    }
}