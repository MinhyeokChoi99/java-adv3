package lambda.lambda3;

public class TargetType1 {
    static void main(String[] args) {
        FunctionA functionA = i -> "value = " + i;
        System.out.println(functionA.apply(10));

        FunctionA functionB = i -> "value = " + i;
        System.out.println(functionB.apply(10));

//        FunctionB targetB = functionA;  컴파일 에러
    }

    @FunctionalInterface
    interface FunctionA {
        String apply(Integer i);
    }

    @FunctionalInterface
    interface FunctionB {
        String apply(Integer i);
    }
}
