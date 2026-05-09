package lambda.lambda5.map;

import java.util.List;

public class MapMainV4 {

    static void main(String[] args) {
        List<String> fruits = List.of("apple","banana","orage");

        List<String> upper = GenericMapper.map(fruits, s -> s.toUpperCase());
        System.out.println("upper = " + upper);


        // 문자열의 길이
        List<Integer> lengths = GenericMapper.map(fruits, s -> s.length());
        System.out.println("lengths = " + lengths);

        List<Integer> list = List.of(1, 2, 3);
        List<String> stringMapped = GenericMapper.map(list, i -> "*".repeat(i));
        System.out.println("stringMapped = " + stringMapped);

    }


}
