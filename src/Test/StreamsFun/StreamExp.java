package Test.StreamsFun;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExp {
    public static void main(String[] args) throws IOException {

        //  1.  Integer Stream
//        IntStream.range(1, 10).forEach(System.out::print);
//        System.out.println();


        //  2. Integer Stream with skip
//        IntStream.range(1, 10).skip(5).forEach(x -> System.out.print(x));
//        System.out.println();


        //  3. Integer Stream with sum
//        System.out.println(IntStream.range(1,5).sum());
//        System.out.println();


        //  4. Stream.of, sorted and findFirst
//        Stream.of("3", "5", "1").sorted().findFirst().ifPresent(System.out::println);


        //  5. Stream from Array, sort, filter and print
//        String[] names = {"Rashad", "Babek", "Aysel", "Gunel", "Rovsen", "Mahir", "Razi"};
//        Arrays.stream(names)           //Same as Stream.of(names)
//                .filter(x -> x.startsWith("R"))
//                .sorted()
//                .forEach(System.out::println);


        //  6.  average of squares of an int array
//        Arrays.stream(new int[] {2,4,6,8,10})
//                .map(x -> x * x )
//                .average()
//                .ifPresent(System.out::println);


        //  7. Stream from List, filter and print
//        List<String> people = Arrays.asList("Anita", "Idrak", "anar", "Amil", "Ilham");
//        people.stream().map(String::toLowerCase)
//                .filter(x -> x.startsWith("a"))
//                .forEach(System.out::println);

        //  8. Stream rows from text file, sort, filter and print
//        Stream<String> bands = Files.lines(Paths.get("bands.txt"));
//        bands
//                .sorted()
//                .filter(x -> x.length() > 8)
//                .forEach(System.out::println);
//        bands.close();

        //  9. reduce() method eyni prosesi tekrar tekrar eliyer
//        List<Integer> number = Arrays.asList(5, 3, 2, 8);
//        int newNumber = number.stream().reduce(0, (i, i1) -> {
//            System.out.println(i + i1);
//            return i + i1;
//        });


        //  10. map() methodu ile tipi deyisir
//        List<String> name = Arrays.asList("Rashad", "Abuzar");
//        name.stream().map(s -> "Map Eklentisi " + s + " Map Eklentisi").forEach(System.out::println);

        //  10.02 map ile tip deyishmek
//        DoubleStream doubleStream = DoubleStream.of(0.7, 8.2, 0.1, 6.2);
//        doubleStream.mapToInt(a -> (int) a).forEach(System.out::println);

        //  11 distinc() methodu eyni olanlari 1e endirir
//        List<String> names= new ArrayList<String>();
//        names.add("abuzar");
//        names.add("resad");
//        names.add("resad");
//        names.add("resad");
//        names.add("resad");
//        names.stream().distinct().forEach(System.out::println);

        //  12. count() methodu sayi gosterir
//        long x = IntStream.range(15, 25).count();
//        System.out.println(x);


    }
}
