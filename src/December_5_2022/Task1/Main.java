package December_5_2022.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Manager mng = new Manager("John","Wick", 5 );
        Developer dev = new Developer("Alex", "Lee",3);
        Tester ts = new Tester("Robin","Martinez",6);
//      ArrayList <Office> emp = new ArrayList<Office>((Collection<? extends Office>) dev);

        List<String> emp = new ArrayList<>();
        emp.add(0, String.valueOf(mng));
        emp.add(1, String.valueOf(dev));
        emp.add(2, String.valueOf(ts));
        System.out.println(emp);
    }
}