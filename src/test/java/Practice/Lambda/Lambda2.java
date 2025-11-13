package Practice.Lambda;

import java.util.function.BiFunction;

public class Lambda2 {
    int c = 40;

    public static void main(String[] args) {
        BiFunction <Integer,Integer,Integer> bf = (a, b) -> a + b;
        System.out.println(bf.apply(100, 3));
        System.out.println(((BiFunction<Integer,Integer,Integer>) (a, b) -> a + b).apply(3, 5));
    }

}
