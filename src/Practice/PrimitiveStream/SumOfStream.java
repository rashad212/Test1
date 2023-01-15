package Practice.PrimitiveStream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class SumOfStream {
    public static void main(String[] args) {

        List<Integer> a = List.of(32,45,21,12,108,8);
        List<Integer> b = List.of(8,11,45,98, 32,77);
        List<List<Integer>> c = List.of(a,b);

        c.stream().flatMap(Collection::stream).forEach(System.out::println);







    }
}
