package December_5_2022.Task1;

import java.util.Comparator;

public class Muqayise<T> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        Employer employer1 = (Employer) o1;
        Employer employer2 = (Employer) o2;

        return employer1.name.compareTo(employer2.name);
    }
}
