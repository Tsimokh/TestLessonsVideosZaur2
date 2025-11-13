package Lesson5_NestedClasses.local_inner_class;

public class LocalInnerExample3 {
    public static void main(String[] args) {
        class AddingNumbers implements Math3 {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }
        AddingNumbers addingNumbers = new AddingNumbers();
        System.out.println(addingNumbers.doOperation(5, 3));

    }
}

interface Math3 {
    int doOperation(int a, int b);
}
