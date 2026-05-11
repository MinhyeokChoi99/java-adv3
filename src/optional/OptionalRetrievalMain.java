package optional;

import java.util.Optional;

public class OptionalRetrievalMain {
    static void main(String[] args) {
        Optional<String> optValue = Optional.of("Hello");
        Optional<Object> optEmpty = Optional.empty();

        System.out.println(optValue.isPresent());
        System.out.println(optEmpty.isPresent());
        System.out.println(optEmpty.isEmpty());

        System.out.println(optValue.get());
//        System.out.println(optEmpty.get()); 값이 없으면 예외

        System.out.println(optValue.orElse("기본값"));
        System.out.println(optEmpty.orElse("기본값"));

        System.out.println(optValue.orElseGet(() -> {
            System.out.println("람다 호출");
            return "new Value";
        }));

        System.out.println(optEmpty.orElseGet(() -> {
            System.out.println("람다 호출");
            return "new Value";
        }));

        System.out.println(optValue.orElseThrow(() -> new RuntimeException("값이 없습니다")));
        try {
            System.out.println(optEmpty.orElseThrow(() -> new RuntimeException("값이 없습니다")));
        } catch (Exception e) {
            System.out.println("예외 발생");
        }

        System.out.println(optValue.or(() -> Optional.of("Fallback")));
        System.out.println(optEmpty.or(() -> Optional.of("Fallback")));
    }
}
