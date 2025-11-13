package Lesson4_Collection.set_interface;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {
        Set<Integer> treeset1 = new TreeSet<>();
        treeset1.add(5);
        treeset1.add(8);
        treeset1.add(2);
        treeset1.add(1);
        treeset1.add(10);
//        treeset1.add(null);
        System.out.println(treeset1);
        treeset1.remove(2);
        System.out.println(treeset1);
        System.out.println(treeset1.contains(2));
    }
}
