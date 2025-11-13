package Lesson4_Collection.list_interface.BinarySearch;

import java.util.*;

public class BinarySearchExample1 {
    public static void main(String[] args) {
        Integer arr[] = {65, 43, -12, 2, 3, 7, 950, -5, 6, 20, 43, -69, 100, 350, 9};
//        String arr2[] = {"65", "43", "-12"};
//        System.out.println(Arrays.toString(arr));
        List<Integer> l1 = new ArrayList<>();
        l1 = Arrays.asList(arr);
        System.out.println("Origin list : " + l1);
        Collections.sort(l1);
        System.out.println("Sorted List : " + l1);
        Collections.reverse(l1);
        System.out.println("Reversed list : " + l1);
        Collections.shuffle(l1);
        System.out.println("Shuffled list : " + l1);

//        .sort(arr);
//        System.out.println("Sorted array: " + Arrays.toString(arr));
//        System.out.println(Arrays.binarySearch(arr,7));

//        System.out.println("-----------");
//        List<Integer> list1 = new ArrayList<>();
//        for (int ch : arr) {
//            list1.add(ch);
//        }
//        System.out.println(list1);
//        System.out.println(Collections.binarySearch(list1,-12));
//        Collections.sort(list1);
//        System.out.println(list1);
//        System.out.println(Collections.binarySearch(list1,-12));


    }
}
