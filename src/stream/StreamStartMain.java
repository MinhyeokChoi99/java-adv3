package stream;

import java.util.List;

public class StreamStartMain {
    static void main(String[] args) {
        List<String> names = List.of("Apple","Banana", "Berry", "Tomato");

        // B로 시작하는 이름만 필터 후 대문자로 바꿔서 리스트 수집
        List<String> result = names.stream().filter(s -> s.startsWith("B")).map(String::toUpperCase).toList();
        System.out.println("result = " + result);

        System.out.println("====외부 반복=====");
        for (String s : result) {
            System.out.println(s + " ");
        }

        System.out.println("====내부 반복=====");
        result.stream().forEach(System.out::println);

    }
}
