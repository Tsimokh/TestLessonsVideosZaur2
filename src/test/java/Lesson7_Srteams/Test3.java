package Lesson7_Srteams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Test3 {
    public static void main(String[] args) {
//        int[] arr1 = {5, 9, 3, 8, 1};
//        System.out.println("array before method \"forEach()\": " + Arrays.toString(arr1));
//        Arrays.stream(arr1).forEach(el -> {
//            el *= 2;
//            System.out.println(el);
//        });
////        IntStream.range(0,arr1.length).forEach(el->{arr1[el]=999; System.out.println(arr1[el]);});
//        System.out.println("array after method \"forEach()\": " + Arrays.toString(arr1));
//        System.out.println("----------------------");
//
//        String[] arr2 = {"Hello", "How are you?", "I am fine, and you?", "I am fine too", "Bye-bye"};
//        System.out.println("array before method \"forEach()\": " + Arrays.toString(arr2));
//
////        Arrays.stream(arr2).forEach(x-> {x=null;
////            System.out.println(x);});
////        System.out.println(Arrays.toString(arr2));
////        System.out.println("----------------------");
//
//        Arrays.stream(arr2).forEach(x -> {
//            x = "333";
//            System.out.println(x);
//        });
//        System.out.println("array after method \"forEach()\": " + Arrays.toString(arr2));
//        System.out.println("----------------------");
//
////        String[] arr3 = Arrays.stream(arr2).map(x->x="222").toArray(String[]::new);
////        System.out.println(Arrays.toString(arr3));
////        System.out.println("----------------------");
//
//
////        for (int i = 0; i < arr2.length; i++) {
////            arr3[i]="!!!";
////        }
////        System.out.println(Arrays.toString(arr3));

        List<Double> listD = new ArrayList<>();
        listD.add(2.1);
        listD.add(4.4);
        listD.add(7.5);
        listD.add(2.9);
        listD.add(9.3);
//        System.out.println("list before method \"forEach()\": " + listD);
//        listD.forEach(x -> {x = 2.22; System.out.println(x);});
//        listD.forEach(x->System.out.println(x));
//        listD.forEach(System.out::println);
//        System.out.println("list after method \"forEach()\": " + listD);
//        listD.forEach(Utils::myMethod);
        listD.forEach(x->Utils.myMethod(x));
    }
}
class Utils{
    public static void myMethod (double a){
        a = a+5;
        System.out.println("Element = " + a);
    }
}
