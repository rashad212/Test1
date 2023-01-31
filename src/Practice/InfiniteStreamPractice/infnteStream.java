package Practice.InfiniteStreamPractice;


import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class infnteStream {
    public static void main(String[] args) {
//      // v1
//        Boolean ints = new Random().ints(0, 100).peek(System.out::println).anyMatch(x -> x == 45);

        // v2
//        boolean b = Stream.generate(() -> new Random().nextInt(100)).peek(System.out::println).anyMatch(a -> a == 45);

//     // test
//       Stream.generate(() -> new Random().nextInt(1000)).takeWhile(x -> x<=500).forEach(System.out::println);

        // test flatMap
//        List<Integer> list1 = List.of(2, 5, 34, 10);
//        List<Integer> list2 = List.of(1,4);
//        List<Integer> list3 = List.of(90,23,8);
//
//        List<List<Integer>> list = List.of(list1,list2,list3);
//
//    list.stream().flatMap(Collection::stream).peek(System.out::println).anyMatch(a -> a==4);
//

        // Intstream
//        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
//        OptionalDouble average = intStream.average();
//        double asDouble = average.getAsDouble();
//        System.out.println(asDouble);
        // Double stream
//        DoubleStream doubleStream = DoubleStream.of(2.3, 5.8, 12.55, 77, 62);
//        OptionalDouble average2 = doubleStream.average();
//        double asDouble2 = average2.getAsDouble();
//        System.out.println(asDouble2);

        //random doublestream
//        DoubleStream generate = DoubleStream.generate(Math::random);
//        generate.limit(10).forEach(System.out::println);

        //count average
//        DoubleStream generate = DoubleStream.of(125, 4.9, 11.11, 18.45, 25.4);
//        DoubleSummaryStatistics summaryStatistics = generate.summaryStatistics();
//
//
//        double average = summaryStatistics.getAverage();
//        System.out.println("average is: " + average);
//        long count = summaryStatistics.getCount();
//        System.out.println("count is: " + count);
//        double min = summaryStatistics.getMin();
//        System.out.println("Minimum value is: " + min);
//        double max = summaryStatistics.getMax();
//        System.out.println("Maximum value is: " + max);



    }

}
