package Practice.GenericExample;

public class Test56 {

    public static <T> boolean isEqual (Test55<T> g1, Test55<T> g2) {
        return g1.getG1().equals(g2.getG2());
    }
}
