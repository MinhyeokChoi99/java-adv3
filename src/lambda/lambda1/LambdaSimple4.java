package lambda.lambda1;

public class LambdaSimple4 {
    static void main(String[] args) {
        MyCall call1 = (int value) -> value * 2;
        MyCall call2 = ( value) -> value * 2;
        MyCall call3 = value -> value * 2; //매겨변수가 1개 일때만 괄호 생략 가능 없거나 두개 이상일때는 () 넣어야함
    }
    interface MyCall {
        int call(int value);
    }
}
