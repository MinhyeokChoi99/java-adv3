package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamV3Main {
    static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40)
                );

        System.out.println(MyStreamV3.of(students).filter(i -> i.getScore() >= 80).map(i -> i.getName()).toList());

        System.out.println(MyStreamV3.of(students).filter(i -> i.getScore() >= 80).filter(i -> i.getName().length() == 5).map(i -> i.getName().toUpperCase()).toList());

    }
}
