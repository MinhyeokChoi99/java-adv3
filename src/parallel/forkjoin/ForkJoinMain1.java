package parallel.forkjoin;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

import static util.MyLogger.log;

public class ForkJoinMain1 {
    static void main(String[] args) {
        List<Integer> data = IntStream.rangeClosed(1, 8).boxed().toList();

        log("[생성] " + data);

        long start = System.currentTimeMillis();
        ForkJoinPool pool = new ForkJoinPool(10);
        SumTask task = new SumTask(data);

        Integer result = pool.invoke(task);
        pool.close();

        long end = System.currentTimeMillis();
        log("time : " + (end - start) + "ms, sum : " + result);
        log("pool " + pool);
    }
}
