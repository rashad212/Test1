package Practice.PrimitiveStream;

import Practice.InfiniteStreamPractice.Student;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveAtrm {
    public static void main(String[] args) {

        IntSummaryStatistics generate = Stream.generate(() -> new Random().nextInt(100)).limit(10).mapToInt(y -> y).summaryStatistics();
        System.out.println(generate);
    }
}
