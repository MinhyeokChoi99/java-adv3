package stream.basic;

import java.util.List;

public class ImmutableMain {
    static void main(String[] args) {
        List<Integer> originList = List.of(1,2,3,4);
        System.out.println("originList = " + originList);

        List<Integer> filteredList = originList.stream().filter(i -> i % 2 == 0).toList();
        System.out.println("filteredList = " + filteredList);
        System.out.println(originList); // 원본은 그대로


    }
}
