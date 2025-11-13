package Lesson4_Collection.set_interface;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(2);
        lhs.add(26);
        lhs.add(1);
        lhs.add(8);
        lhs.add(10);
        System.out.println(lhs);
        lhs.remove(26);
        System.out.println(lhs);
        System.out.println(lhs.contains(26));

    }
}
