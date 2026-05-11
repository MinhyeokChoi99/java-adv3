package stream.operation;

import java.util.IntSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreamMain {
    static void main(String[] args) {
        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        stream.forEach(i -> System.out.print(i + " "));
        System.out.println();


        IntStream range1 = IntStream.range(1, 6);
        IntStream range2 = IntStream.rangeClosed(1, 5);
        range1.forEach(i -> System.out.print(i + " "));
        System.out.println();
        range2.forEach(i -> System.out.print(i + " "));

        int sum = IntStream.range(1, 6).sum();
        System.out.println("sum = " + sum);
        double avg = IntStream.range(1, 6).average().getAsDouble();
        IntSummaryStatistics statistics = IntStream.range(1, 6).summaryStatistics();
        System.out.println(statistics.getSum());
        System.out.println(statistics.getAverage());
        System.out.println(statistics.getMax());
        System.out.println(statistics.getMin());
        System.out.println(statistics.getCount());

        LongStream longStream = IntStream.range(1, 5).asLongStream();

        DoubleStream doubleStream = IntStream.range(1, 5).asDoubleStream();

        Stream<Integer> boxtedStream = IntStream.range(1, 5).boxed();

        LongStream mappedLong = IntStream.range(1, 5).mapToLong(i -> i * 10L);

        DoubleStream mappedDouble = IntStream.range(1, 5).mapToDouble(i -> i * 0.1);

        Stream<String> stringStream = IntStream.range(1, 5).mapToObj(i -> "Number : " + i);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        IntStream intStream = integerStream.mapToInt(i -> i);


    }
}
