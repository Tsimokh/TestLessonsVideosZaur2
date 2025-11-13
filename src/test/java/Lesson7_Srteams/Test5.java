package Lesson7_Srteams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 9, 12, 4, 21, 81, 7, 18};
//        System.out.println("array before sorting: " + Arrays.toString(arr));
//        arr = Arrays.stream(arr).sorted().toArray();
//        System.out.println("array after sorting: " + Arrays.toString(arr));
//        System.out.println("---------------------------------------------");
        int result = Arrays.stream(arr).filter(x -> {
            return x % 2 != 0;
        }).map(x -> {
            if (x % 3 == 0) {
                return x / 3;
            } else {
                return x;
            }
        }).reduce((a,e)->a+e).getAsInt();
        System.out.println(result);

//        String[] arr2 = {"Hello", "How are you?", "I am fine, and you?", "I am fine too", "Nice to meet you",
//                "Have a nice day", "Bye-bye"};
//        System.out.println("array before sorting: " + Arrays.toString(arr2));
//        arr2 = Arrays.stream(arr2).sorted().toArray(String[]::new);
//        System.out.println("array after sorting: " + Arrays.toString(arr2));
//        System.out.println("---------------------------------------------");
//
//        double[] arr3 = {3.8, 1.5, 9.12, 4.21, 81.7, 18.234};
//        System.out.println("array before sorting: " + Arrays.toString(arr3));
//        arr3 = Arrays.stream(arr3).sorted().toArray();
//        System.out.println("array after sorting: " + Arrays.toString(arr3));
//        System.out.println("---------------------------------------------");
//
////        float[] arr4 = {3.8F, 1.5F, 9.12F, 4.21F, 81.7F, 18.234F};
////        System.out.println("array before sorting: " + Arrays.toString(arr3));
////        arr4 = Arrays.stream(arr4).sorted().toArray();
////        System.out.println("array after sorting: " + Arrays.toString(arr3));
////        System.out.println("---------------------------------------------");
//
//        long[] arr5 = {3L, 8L, 1L, 5L, 9L, 12L, 4L, 21L, 81L, 7L, 18L};
//        System.out.println("array before sorting: " + Arrays.toString(arr));
//        arr5 = Arrays.stream(arr5).sorted().toArray();
//        System.out.println("array after sorting: " + Arrays.toString(arr));
//        System.out.println("---------------------------------------------");
//
////        byte[] arr6 = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
////        System.out.println("array before sorting: " + Arrays.toString(arr));
////        arr6 = Arrays.stream(arr6).sorted().toArray();
////        System.out.println("array after sorting: " + Arrays.toString(arr));
////        System.out.println("---------------------------------------------");
    }
}
