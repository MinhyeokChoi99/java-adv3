package lambda.lambda1;

import lambda.MyFunction;

public class LambdaSimple3 {
    static void main(String[] args) {
        MyFunction myFunction = (int a, int b) -> a+b;
        myFunction.apply(3,4);

        MyFunction myFunction1 = (a, b) -> a + b;
        myFunction1.apply(3,4);


    }
}
