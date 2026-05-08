package lambda.lambda3;

public class GenericMain2 {

    static void main(String[] args) {
        ObjectFunction upperCase = s -> ((String)s).toUpperCase();
        System.out.println((String) upperCase.apply("hello"));

        ObjectFunction square = n -> (Integer)n * (Integer)n;
        System.out.println((Integer)square.apply(3));
    }

    @FunctionalInterface
    interface ObjectFunction {
        Object apply(Object s);
    }

}
