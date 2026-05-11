package lambda.lambda4;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateMain {
    static void main(String[] args) {
        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 ==0;
            }
        };

        System.out.println(predicate1.test(10));

        Predicate<Integer> predicate2 = value -> value % 2 ==0;
        System.out.println(predicate2.test(9));

    }
}
