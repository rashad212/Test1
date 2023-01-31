package Practice.PrimitiveStream;

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.Stream;

public class RandomStream {
    public static void main(String[] args) {

        IntSummaryStatistics generate = Stream.generate(() -> new Random().nextInt(100))
                .limit(10).mapToInt(y -> y).summaryStatistics();
        System.out.println(generate);

    }
}
