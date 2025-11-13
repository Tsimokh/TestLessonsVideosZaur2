package Lesson5_NestedClasses.anonymous_class;

public class AnonymousClass {
    int c = 40;

    public static void main(String[] args) {
//        Math math = new Math() {
//            @Override
//            public int doOperation(int a, int b) {
//                AnonymousClass anonymousClass = new AnonymousClass();
//                return a + b;
//            }
//        };
//        Math math = new Math() {
//            //            int c = 20;
////            void abc(){};
//            @Override
//            public int doOperation(int a, int b) {
//                AnonymousClass anonymousClass = new AnonymousClass();
//                return a + b + anonymousClass.c;
//            }
//        };

        AnonymousClass anonymousClass = new AnonymousClass();
//        Math math = (a,b)->a+b+anonymousClass.c;
//        System.out.println(math.doOperation(5, 3));

        System.out.println(((Math)(a,b)->a+b+anonymousClass.c).doOperation(5,3));

//        System.out.println(math.doOperation(4, 7));

//        Math math2 = new Math() {
//            //            int c = 20;
////            void abc(){};
//            @Override
//            public int doOperation(int a, int b) {
//                return a * b;
//            }
//        };
//        System.out.println(math2.doOperation(5, 3));

    }

}

interface Math {
    int doOperation(int a, int b);
}
//interface Math {
//    default int doOperation(int a, int b){
//        return a / b;
//    }
//}

//class Math {
//    int doOperation(int a, int b) {
//        return a / b;
//    }
//}