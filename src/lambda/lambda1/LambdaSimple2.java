package lambda.lambda1;

import lambda.Procedure;

public class LambdaSimple2 {

    static void main(String[] args) {
        Procedure procedure = () -> {
            System.out.println("Hello lambda");
        };
        procedure.run();

        Procedure procedure1 = () -> System.out.println("Hello.lambda");

        procedure1.run();
    }
}
