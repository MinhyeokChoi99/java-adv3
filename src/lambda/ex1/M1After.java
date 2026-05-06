package lambda.ex1;

public class M1After {
    static void main(String[] args) {
        greeting("Good Morning!");
        greeting("Good Afternoon!");
        greeting("Good Evening!");
    }
    public static void greeting(String str) {
        System.out.println("===== 시작 =====");
        System.out.println(str);
        System.out.println("===== 끝 =====");
    }
}
