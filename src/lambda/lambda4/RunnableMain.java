package lambda.lambda4;

public class RunnableMain {
    static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };

        runnable.run();

        ((Runnable) () -> System.out.println("hello")).run();

    }
}
