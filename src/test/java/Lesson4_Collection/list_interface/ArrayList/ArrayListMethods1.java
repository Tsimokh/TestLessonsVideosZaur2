package Lesson4_Collection.list_interface.ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("John");
        list1.add("Jack");
        list1.add("Sonia");
        for (String list : list1) {
            System.out.print(list + " ");
        }
        System.out.println("\n------------------");
        list1.add(2, "Georg");
        for (String list : list1) {
            System.out.print(list + " ");
        }
//        list1.add(5,"Mariya"); //викинеться IndexOutOfBoundsException, бо елемент додається на індекс який
//        // виходить за межі розміру ArrayList
        System.out.println("\n------------------");
        System.out.print(list1.get(2));
        System.out.println("\n------------------");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        list1.set(1,"Licie");
        System.out.println("\n------------------");
        System.out.print(list1);
//        list1.remove(3); //викинеться IndexOutOfBoundsException, бо індекса елумента який видаляється не існує
        list1.remove(1);

        System.out.println("\n------------------");
        System.out.print(list1);

    }
}
