package stream.operation;

import java.util.Optional;

public class OptionalSimpleMain {
    static void main(String[] args) {
        Optional<Integer> optional1 = Optional.of(10);

        if(optional1.isPresent()) {
            System.out.println(optional1.get());
        }

        Optional<Object> optional2 = Optional.ofNullable(null);
//        if(optional2.isEmpty()) {
//            System.out.println(optional2.get());
//        }



    }
}
