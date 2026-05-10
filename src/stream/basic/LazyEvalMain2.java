package stream.basic;

import lambda.lambda5.mystream.MyStreamV3;

import java.util.List;

public class LazyEvalMain2 {
    static void main(String[] args) {
        List<Integer> data = List.of(1, 2, 3, 4, 5,6);

        ex1(data);
        ex2(data);
    }

    private static void ex1(List<Integer> data) {
        System.out.println("MyStreamV3");
         MyStreamV3.of(data).filter(i -> {
            boolean isEven = i % 2 == 0;
            System.out.println("filter 실행 : " + i + "  " + isEven);
            return isEven;
        }).map(i -> {
            int mapped = i * 10;
            System.out.println("map 실행 : " + mapped);
            return mapped;
        });
        System.out.println("MyStreamV3");
    }

    private static void ex2(List<Integer> data) {
        System.out.println("stream API");
       data.stream().filter(i -> {
            boolean isEven = i % 2 == 0;
            System.out.println("filter 실행 : " + i + "  " + isEven);
            return isEven;
        }).map(i -> {
            int mapped = i * 10;
            System.out.println("map 실행 : " + mapped);
            return mapped;
        });

        System.out.println("stream API");
    }
}
