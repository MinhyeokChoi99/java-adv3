package lambda.ex4;

public class BuildGreeterExample {

    static void main(String[] args) {

        StringFunction helloGreeter = buildGreeter("Hello");
        System.out.println(helloGreeter.apply("Java")); // Hello, Java
    }

    public static StringFunction buildGreeter(String greeting) {
        return  s ->  greeting + ", "+ s;
    }


}
