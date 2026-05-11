package methodref;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodRef4 {

    static void main(String[] args) {
        List<Person> person = List.of(
                new Person("Kim"),
                new Person("Park"),
                new Person("Lee"));
        System.out.println(mapPersonToString(person, Person::introduce));

        List<String> strings = List.of("Java", "Spring", "JPA");
        System.out.println(mapStringToString(strings, String::toUpperCase));


    }

    static List<String> mapPersonToString(List<Person> personList, Function<Person,String> fun) {
        List<String> result = new ArrayList<>();
        for (Person p : personList) {
            String applied = fun.apply(p);
            result.add(applied);
        }
        return result;
    }

    static List<String> mapStringToString(List<String> Strings, Function<String,String> fun) {
        List<String> result = new ArrayList<>();
        for (String s : Strings) {
            String applied = fun.apply(s);
            result.add(applied);
        }
        return result;
    }
}
