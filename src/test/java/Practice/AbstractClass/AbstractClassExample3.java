package Practice.AbstractClass;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class AbstractClassExample3 {
    public static void main(String[] args) {
//        Operation3 operation3 = (a, b)->{System.out.println(a+b);};
//        operation3.doOperation(3,5);

//        Consumer<Integer> consumer = (a)->{System.out.println(a);};
//        consumer.accept(3);

        BiConsumer<Integer, Integer> biConsumer = (a,b)->{System.out.println(a+b);};
        biConsumer.accept(3,5);
    }
}


 interface Operation3 {
     void doOperation(int a, int b);
}
