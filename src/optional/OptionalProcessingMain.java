package optional;

import java.util.Optional;

public class OptionalProcessingMain {
    static void main(String[] args) {
        Optional<String> optValue = Optional.of("Hello");
        Optional<Object> optEmpty = Optional.empty();

        optValue.ifPresent(v -> System.out.println("v = " + v));
        optEmpty.ifPresent(v -> System.out.println("v = " + v));

        optValue.ifPresentOrElse(v-> System.out.println("optValue = " + v),() -> System.out.println("값이 없음"));
        optEmpty.ifPresentOrElse(v-> System.out.println("optValue = " + v),() -> System.out.println("값이 없음"));

        Optional<Integer> lengthOpt1 = optValue.map(String::length);
        System.out.println("lengthOpt1 = " + lengthOpt1);
//        Optional<Integer> lengthOpt2 = optEmpty.map(String::length);
//        System.out.println("lengthOpt2 = " + lengthOpt2);


        Optional<Optional<Integer>> i = optValue.map(s -> Optional.of(s.length()));
        System.out.println("i = " + i);
        System.out.println(optValue.flatMap(s -> Optional.of(s)));

        System.out.println(optValue.filter(s -> s.startsWith("H")));
        System.out.println(optValue.filter(s -> s.startsWith("X")));

        optValue.stream().forEach(s -> System.out.println(s));
        optEmpty.stream().forEach(s -> System.out.println(s));

    }
}
