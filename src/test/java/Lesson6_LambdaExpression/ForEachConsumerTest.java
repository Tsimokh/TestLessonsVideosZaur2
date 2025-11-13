package Lesson6_LambdaExpression;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class ForEachConsumerTest {
    public static void main(String[] args) {
        List<String> list =  List.of("Hello", "How are you?", "I am fine, thank you", "Bye-bye");
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Hello");
        arrayList1.add("How are you?");
        arrayList1.add("I am fine, thank you");
        arrayList1.add("Bye-bye");
////        list.add("Hello");
////        list.add("How are you");
////        list.add("I am fine, thank you");
////        list.add("Bye-bye");
////        for (String s : list) {
////            System.out.println(s);
////        }
//        list.forEach(str -> System.out.println(str));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(arrayList1);
//        arrayList.forEach(x-> {System.out.println(x); x *=2; System.out.println(x);});
        Collections.sort(arrayList1);
        System.out.println(arrayList1);
    }
}
