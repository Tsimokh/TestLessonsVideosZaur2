package Lesson4_Collection.list_interface.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("How are you?");
        list1.add("Good bye");
        list1.add("Hello");
        list1.add("!!!");
//        System.out.println("Before deleting: " + list1);

//        List<String> list2 = new ArrayList<>();
//        list2.add("222");
//        list2.add("How are you?");
//        list2.add("111");
//        list2.add("Hello");
//        list1.removeAll(list2);
//        list1.retainAll(list2);
//        System.out.println("After deleting: " + list1);
//        System.out.println(list1.containsAll(list2));
//       List<String> myList = list1.subList(1,3);
//       myList.add("???");
//        list1.add("123456");
//        System.out.println(list1);
//        System.out.println(myList);
//        Object[] array1 = list1.toArray();
//        System.out.println(Arrays.toString(array1));
//        String[] array2 = list1.toArray(new String[5]);
//        String[] array3 = list1.toArray(new String[8]);
//        String[] array4 = list1.toArray(new String[0]);
//        System.out.println(Arrays.toString(array4));
        List<Integer> list2 = List.of(1,2,3,4,5,null);
//        list2.add(7);
        System.out.println(list2);
//        List<String> list3 = List.copyOf(list1);
//        System.out.println(list3);
    }
}
