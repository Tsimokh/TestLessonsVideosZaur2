package Lesson4_Collection.list_interface.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> arrayListist1 = new ArrayList<>();
        arrayListist1.add("Hello");
        arrayListist1.add("How are you?");
        arrayListist1.add("Good bye");
        arrayListist1.add("Hello");
        arrayListist1.add("!!!");

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Iterator<Integer> iterator1 = Arrays.stream(arr).iterator();

//        while(iterator1.hasNext()){
////            System.out.println(iterator1.next());
//            iterator1.next();
////            iterator1.remove();
//        }
//        System.out.println(arr);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        for (int i : arr){
//            System.out.println(i);
//        }
//        iterator1.forEachRemaining(System.out::println);
//        iterator1.remove();


        Iterator<String> iterator2 = arrayListist1.iterator();

//        iterator2.forEachRemaining(System.out::println);

//        System.out.println(arrayListist1);

//        for (int i = 0; i < arrayListist1.size(); i++) {
//            System.out.println(arrayListist1.get(i));
//        }
//        for (String s:arrayListist1){
//            System.out.println(s);
//        }
        while (iterator2.hasNext()){
//            System.out.println(iterator2.next());
            iterator2.next();
//            iterator2.remove();
        }
        System.out.println(arrayListist1);
    }
}
