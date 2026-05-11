package lambda.lambda4;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiMain {
    static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a,b) -> a+b;
        System.out.println(add.apply(5, 10));

        BiConsumer<String, Integer> repeat = (str, n) -> System.out.println(str.repeat(n));
        repeat.accept("hello ", 5);

        BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
        System.out.println(isGreater.test(5, 10));
    }
}
