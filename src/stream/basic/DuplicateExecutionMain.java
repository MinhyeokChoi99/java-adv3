package stream.basic;

import java.util.List;
import java.util.stream.Stream;

public class DuplicateExecutionMain {
    static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4);

        stream.forEach(System.out::println);
//        stream.forEach(System.out::println); 중복실행 불가

        List<Integer> list = List.of(1,2,3);
        Stream.of(list).forEach(System.out::println);
        Stream.of(list).forEach(System.out::println); // 새로 생성해서 실행


    }
}
