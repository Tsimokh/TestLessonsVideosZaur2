package Lesson5_NestedClasses.local_inner_class;

public class LocalInnerExample1 {
    public static void main(String[] args) {
        Math1 math = new Math1();
        math.getResult();
//        Dividing dividing2 = new Dividing();
    }
}


class Math1 {
//    Dividing dividing1 = new Dividing();
//    private int a = 10;

    public void getResult() {
        int dividend = 10;
//        dividend = 20;
//        final int dividend = 10;

        class Dividing {
//            public void abc(){
//                dividend = 20;
//            }
            //            private int dividend;
            private int divisor;

//            public int getDividend() {
//                return dividend;
//            }

//            public void setDividend(int dividend) {
//                this.dividend = dividend;
//            }

            public int getDivisor() {
                return divisor;
            }

            public void setDivisor(int divisor) {
                this.divisor = divisor;
            }

            public int getQuotient() {
                return dividend / divisor;
            }

            public int getRemainder() {
//                System.out.println(a);
                return dividend % divisor;
            }
        }
        Dividing dividing = new Dividing();
//        dividing.setDividend(10);
        dividing.setDivisor(2);
        System.out.println("Dividend: " + dividend);
        System.out.println("Divisor: " + dividing.getDivisor());
        System.out.println("Quotient: " + dividing.getQuotient());
        System.out.println("Remainder: " + dividing.getRemainder());

    }
}
