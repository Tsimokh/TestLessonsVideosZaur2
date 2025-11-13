package Lesson6_LambdaExpression;

public class LambdaExpressionExample2 {
    static void def(J j) {
        System.out.println(j.abc());
    }

    public static void main(String[] args) {
//        def(() -> {return 10;});
        def(() -> 10);
    }
}

interface J {
    int abc();
}
