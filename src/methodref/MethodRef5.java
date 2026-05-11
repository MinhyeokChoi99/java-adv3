package methodref;

import lambda.lambda5.mystream.MyStreamV3;

import java.util.List;

public class MethodRef5 {

    static void main(String[] args) {
        List<Person> person = List.of(
                new Person("Kim"),
                new Person("Park"),
                new Person("Lee"));

        System.out.println(MyStreamV3.of(person).map(Person::introduce).map(String::toUpperCase).toList());
    }
}
