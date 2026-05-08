package lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class MapExample {

    static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트 : " + words);


        System.out.println(map(words, String::toUpperCase));
        System.out.println(map(words, s -> "****" + s + "****"));


    }

    public static List<String> map(List<String> list, StringFunction func) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            result.add(func.apply(s));
        }
        return result;
    }
}
