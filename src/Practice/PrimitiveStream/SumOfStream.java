package Practice.PrimitiveStream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfStream {
    public static void main(String[] args) {
        List<Integer> a = List.of(1, 2, 3, 4);
        List<Integer> b = List.of(4, 5, 6, 3, 7);

//        boolean vars = false;
//
//        for (Integer ae : b) {
//            if (ae == 3) {
//                vars = true;
//                break;
//            }
//        }

        List<Integer> collect1 = a.stream().filter(i -> b.stream().noneMatch(j -> j == i)).collect(Collectors.toList());
        List<Integer> collect2 = b.stream().filter(i -> a.stream().noneMatch(j -> Objects.equals(j, i))).collect(Collectors.toList());

        collect1.addAll(collect2);
        System.out.println(collect1);

    }
}
