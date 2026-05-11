package lambda.ex3;

import java.util.ArrayList;
import java.util.List;

public class ReduceExample {

    static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        System.out.println("리스트 : " + numbers);

        // 1. 합 구하기 (초기값 0 , 덧셈 로직)
        System.out.println(reduce(numbers, 0, (a, b) -> a + b));
        // 2. 곱 구하기 (초기값 1, 곱셉 로직)
        System.out.println(reduce(numbers, 1, (a, b) -> a * b));
    }

    public static int reduce(List<Integer> list, int initial, MyReducer reducer) {
        int cal = initial;
        for (Integer i : list) {
            cal = reducer.reduce(cal,i);
        }
        return cal;
    }
}
