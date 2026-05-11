package optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalCreationMain {
    static void main(String[] args) {
        String nonNullValue = "Helo Optional!";
        Optional<String> opt1 = Optional.of(nonNullValue);

        Optional<String> opt2 = Optional.ofNullable("Hello!");
        Optional<Object> opt3 = Optional.ofNullable(null);
        System.out.println("opt2 = " + opt2);
        System.out.println("opt3 = " + opt3);

        Optional<Object> opt4 = Optional.empty();
        System.out.println("opt4 = " + opt4);




    }
}
