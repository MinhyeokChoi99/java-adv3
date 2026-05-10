package stream.collectors;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors4Summing {
    static void main(String[] args) {
        System.out.println(Stream.of(1, 2, 3).collect(Collectors.counting())); //다운스트림 컬렉터

        IntSummaryStatistics collect = Stream.of("Apple", "Banana", "Tomato").collect(Collectors.summarizingInt(s -> s.length()));
        System.out.println(collect.getCount());
        System.out.println(collect.getSum());
        System.out.println(collect.getMax());
        System.out.println(collect.getMin());
        System.out.println(collect.getAverage());
    }
}
