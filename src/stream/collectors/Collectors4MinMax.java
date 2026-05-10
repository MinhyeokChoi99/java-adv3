package stream.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors4MinMax {
    static void main(String[] args) {
        Integer max = Stream.of(1, 2, 3).collect(Collectors.maxBy((i1, i2) -> i1.compareTo(i2))).get();
        System.out.println("max = " + max);


    }
}
