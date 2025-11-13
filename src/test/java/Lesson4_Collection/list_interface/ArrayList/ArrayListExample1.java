package Lesson4_Collection.list_interface.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("John");
        list1.add("Jack");
        list1.add("Sonia");
        System.out.println(list1);
        System.out.println("--------------------------------");
        ArrayList<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>(20);
        list4.add("Mike");
        list4.add("Lucie");
        System.out.println(list4.size());
        System.out.println(list4);
        System.out.println("--------------------------------");
        ArrayList<String> list5 = new ArrayList<>(list4);
        System.out.println(list5);
    }
}
