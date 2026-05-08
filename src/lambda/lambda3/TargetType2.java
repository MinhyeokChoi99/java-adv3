package lambda.lambda3;

import java.util.function.Function;

public class TargetType2 {

    static void main(String[] args) {
        Function<String, String> upperCase = s -> s.toUpperCase();
        System.out.println(upperCase.apply("hello"));

        Function<Integer, Integer> square = n -> n * n;
        System.out.println(square.apply(5));
    }
}
