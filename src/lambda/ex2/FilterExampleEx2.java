package lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class FilterExampleEx2 {
    static void main(String[] args) {
        List<Integer> numbers = List.of(-3, -2, -1, 1, 2, 3, 5);
        System.out.println("원본 리스트 : " + numbers);
        System.out.println(filter(numbers, i -> i < 0));
        System.out.println(filter(numbers, i -> i % 2 == 0 ));
    }

    public static List<Integer> filter(List<Integer> list, MyPredicate predicate ) {
        List<Integer> result = new ArrayList<>();
        for (int val : list) {
            if (predicate.test(val)) {
                result.add(val);
            }
        }
        return result;
    }
}
