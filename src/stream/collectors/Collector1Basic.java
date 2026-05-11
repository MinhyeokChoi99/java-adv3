package stream.collectors;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collector1Basic {
    static void main(String[] args) {
        System.out.println(Stream.of("Java", "Spring", "JPA").collect(Collectors.toList()));
        System.out.println(Stream.of("Java", "Spring", "JPA").collect(Collectors.toUnmodifiableList()));

        System.out.println(Stream.of(1, 2, 2, 3, 3).collect(Collectors.toSet()));

        TreeSet<Integer> collect = Stream.of(3, 4, 5, 2, 1).collect(Collectors.toCollection(TreeSet::new));
        System.out.println("collect = " + collect);

    }
}
