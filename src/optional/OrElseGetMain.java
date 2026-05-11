package optional;

import java.util.Optional;
import java.util.Random;

import static java.lang.Thread.sleep;

public class OrElseGetMain {
    static void main(String[] args) {
        Optional<Integer> optValue = Optional.of(100);
        Optional<Integer> optEmpty = Optional.empty();

        Integer i1 = optValue.orElse(10 + 20); // 10 + 20 계산 후 버림
        Integer i2 = optEmpty.orElse(10 + 20);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

        System.out.println(optValue.orElse(createData())); // 값이 있는 경우 값이 있는데 굳이 데이터를 생성해버림

        System.out.println(optEmpty.orElse(createData())); // 값이 없는 경우

        System.out.println(optValue.orElseGet(() -> createData()));
        System.out.println(optEmpty.orElseGet(() -> createData()));


    }

    static int createData() {
        System.out.println("데이터를 생성합니다...");
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int createValue = new Random().nextInt(100);
        System.out.println("데이터 생성이 완료되었습니다. 생성 값 : " + createValue);
        return createValue;

    }
}
