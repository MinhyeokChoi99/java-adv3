package stream.operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperationMain {

    static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers1 = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("evenNumbers1 = " + evenNumbers1);

        List<Integer> evenNumbers2 = numbers.stream().filter(i -> i % 2 == 0).toList();
        System.out.println("evenNumbers1 = " + evenNumbers1);

        Integer[] arr = numbers.stream().filter(i -> i % 2 == 0).toArray(Integer[]::new);
        System.out.println("arr = " + Arrays.toString(arr));

        numbers.stream().limit(5).forEach(System.out::println);

        long count = numbers.stream().filter(n -> n > 5).count();
        System.out.println("count = " + count);

        System.out.println(numbers.stream().reduce((a, b) -> a + b).get());

        System.out.println(numbers.stream().reduce(100, (a, b) -> a + b));

        System.out.println(numbers.stream().min(Integer::compareTo).get()); //최소
        System.out.println(numbers.stream().max(Integer::compareTo).get()); //최대

        System.out.println(numbers.stream().filter(n -> n > 5).findFirst().get());
        System.out.println(numbers.stream().filter(n -> n > 5).findAny().get());

        boolean hasEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("hasEven = " + hasEven);

        System.out.println(numbers.stream().allMatch(n -> n > 0));

        System.out.println(numbers.stream().noneMatch(n -> n < 0));


    }
}
