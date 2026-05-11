package methodref;

import lambda.lambda5.mystream.MyStreamV3;

import java.util.List;
import java.util.function.BiFunction;

public class MethodRef6 {

    static void main(String[] args) {
        List<Person> person = List.of(
                new Person("Kim"),
                new Person("Park"),
                new Person("Lee"));

        BiFunction<Person,Integer, String> fun1 = (p ,number) -> p.introduceWithNumber(number);
        BiFunction<Person,Integer, String> fun2 = Person::introduceWithNumber;
        System.out.println(fun2.apply(person.getFirst(),30));

    }
}
