package lambda.ex1;

import lambda.MyFunction;

public class M5Return {
    static void main(String[] args) {
        System.out.println(getOperation("add").apply(1, 2));
        System.out.println(getOperation("sub").apply(1, 2));
    }

    static MyFunction getOperation(String operator) {
        if(operator.equals("add")) {
            return (a, b) -> a + b;
        } else if (operator.equals("sub")) {
            return (a, b) -> a - b;
        }
        return (a, b) -> 0;

    }
}
