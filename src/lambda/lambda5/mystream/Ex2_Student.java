package lambda.lambda5.mystream;

import lambda.lambda5.filter.GenericFilter;
import lambda.lambda5.map.GenericMapper;

import java.util.ArrayList;
import java.util.List;


public class Ex2_Student {

    static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40));
        List<String> directResult = direct(students);
        System.out.println("directResult = " + directResult);

        List<String> lambdaResult = lambda(students);
        System.out.println("lambdaResult = " + lambdaResult);
    }

    private static List<String> lambda(List<Student> students) {

        List<String> map = GenericMapper.map(GenericFilter.filter(students, i -> i.getScore() >= 80), i -> i.getName());
        return map;
    }

    private static List<String> direct(List<Student> students) {
        ArrayList<String> result = new ArrayList<>();

        for (Student st : students) {
            if(st.getScore() >= 80) {
                result.add(st.getName());
            }
        }

        return result;
    }
}
