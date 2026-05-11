package lambda.lambda1;

import lambda.MyFunction;

public class LambdaSimple1 {
    static void main(String[] args) {
        MyFunction function = (int a, int b) -> {
            return a + b;
        };
        System.out.println("function.apply(1,2) = " + function.apply(1, 2));

        MyFunction myFunction2 = (int a, int b) -> a + b;
        System.out.println(myFunction2.apply(1, 2));

        MyFunction function3 = (int a, int b) -> {
            System.out.println("람다 실행");
            return a + b;
        };


    }
}
