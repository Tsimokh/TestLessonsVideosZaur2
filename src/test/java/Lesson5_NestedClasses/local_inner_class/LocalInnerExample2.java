package Lesson5_NestedClasses.local_inner_class;

public class LocalInnerExample2 {
    public static void main(String[] args) {
        Math2 math = new Math2();
        math.getResult(10, 2);
        math.getResult(30, 3);
    }
}

class Math2 {

    public void getResult(final int dividend, final int divisor) {

        class Dividing extends B implements I {
            public int getQuotient() {
                return dividend / divisor;
            }

            public int getRemainder() {
                return dividend % divisor;
            }
        }
        Dividing dividing = new Dividing();
        System.out.println("Dividend: " + dividend);
        System.out.println("Divisor: " + divisor);
        System.out.println("Quotient: " + dividing.getQuotient());
        System.out.println("Remainder: " + dividing.getRemainder());

    }
}
class B{}
interface I{}
