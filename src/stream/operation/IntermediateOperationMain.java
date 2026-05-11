package stream.operation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperationMain {

    static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10);

        numbers.stream().filter(n -> n%2 ==0).forEach(n-> System.out.print(n + " "));

        System.out.println();

        numbers.stream().map(n->n * n).forEach(n -> System.out.print(n + " "));

        System.out.println();

        numbers.stream().distinct().forEach(n-> System.out.print(n + " "));

        System.out.println();

        Stream.of(3,1,4,1,5,7,4,2,5).sorted().forEach(n -> System.out.print(n +  " "));

        System.out.println();

        Stream.of(3,1,4,1,5,7,4,2,5).sorted(Comparator.reverseOrder()).forEach(n -> System.out.print(n +  " "));

        System.out.println();

        numbers.stream().peek(n -> System.out.print("before : " + n)).map(n -> n * n).peek(n  -> System.out.print(" after : " + n)).forEach(n -> System.out.print(" 최종 값 : " + n + " "));

        System.out.println();
        numbers.stream().limit(5).forEach(s -> System.out.print(s + " "));

        System.out.println();
        numbers.stream().skip(5).forEach(s -> System.out.print(s + " "));

        System.out.println();
        List<Integer> numbers2 = List.of(1, 2, 3, 4, 5, 1, 2, 3);
        numbers2.stream().takeWhile(n -> n < 5).forEach(s -> System.out.print(s + " "));
        System.out.println();
        numbers2.stream().dropWhile(i -> i < 5).forEach(s -> System.out.print(s + " "));


    }
}
