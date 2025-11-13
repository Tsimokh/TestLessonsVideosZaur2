package Lesson6_LambdaExpression;

public class LambdaExpressionExample1 {
    public static void def(I i) {
        System.out.println(i.abc("Hello"));
    }

    public static void main(String[] args) {
       final int i = 10;
//        i =100;
//        def((str)->str.length()+i);
        def(str->{System.out.println(i);return str.length();});
//        i =100;
//        System.out.println(s);
    }
}
interface I{
    int abc(String s);
}