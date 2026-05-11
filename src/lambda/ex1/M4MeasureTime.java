package lambda.ex1;

import lambda.Procedure;

import java.util.Arrays;

public class M4MeasureTime {
    static void main(String[] args) {
        int[] arr = {4,3,2,1};


        measure(() ->{
                int sum = 0;
                for(int i = 1; i <= 100; i ++) {
                    sum += i;
                }
                System.out.println("sum = " + sum);
            });
        measure(() -> {
                Arrays.sort(arr);
                System.out.println(Arrays.toString(arr));
            });

    }

    static void measure(Procedure procedure) {
        long start = System.nanoTime();
        procedure.run();
        long end = System.nanoTime();
        System.out.println("실행시간 : " + (end - start) + "ns");
    }
}
