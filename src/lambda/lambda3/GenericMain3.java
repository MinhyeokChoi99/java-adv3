package lambda.lambda3;

public class GenericMain3 {

    static void main(String[] args) {
        GenericFunction<String> upperCase =  s-> s.toUpperCase();
        System.out.println(upperCase.apply("hello"));

        GenericFunction<Integer> square = n -> n * n;
        System.out.println(square.apply(3));
    }

    @FunctionalInterface
    interface GenericFunction <T> {
        T apply(T s);
    }

}
