package lambda.lambda4.ex2;

import lambda.ex2.StringFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class MapExample2 {

    static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트 : " + words);


        System.out.println(map(words, String::toUpperCase));
        System.out.println(map(words, s -> "****" + s + "****"));


    }

    public static List<String> map(List<String> list, UnaryOperator<String> func) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            result.add(func.apply(s));
        }
        return result;
    }
}
