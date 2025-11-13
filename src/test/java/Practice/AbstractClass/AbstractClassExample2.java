package Practice.AbstractClass;

public class AbstractClassExample2 {
    public static void main(String[] args) {
        Operation2 operation = new Operation2() {
            @Override
            void doOperation(int a, int b) {
                System.out.println(a + b);
            }
        };
        operation.doOperation(2,3);
    }
}


abstract class Operation2 {
    abstract void doOperation(int a, int b);
}