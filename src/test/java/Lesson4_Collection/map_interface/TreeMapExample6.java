package Lesson4_Collection.map_interface;

import java.util.TreeMap;

public class TreeMapExample6 {
    public static void main(String[] args) {
        Student st1 = new Student("John", "Morris", 2);
        Student st2 = new Student("Licie", "Mackkenley", 4);
        Student st3 = new Student("Adam", "Sendler", 2);
        Student st4 = new Student("Nick", "Nickolson", 3);
        Student st5 = new Student("Brenda", "Walsh", 5);
        Student st6 = new Student("Erica", "Tsukerman", 3);
        Student st7 = new Student("Jefri", "Mackain", 1);
        TreeMap<Double, Student> treeMap1 = new TreeMap<>();
        treeMap1.put(5.8, st5);
        treeMap1.put(6.4, st3);
        treeMap1.put(7.2, st1);
        treeMap1.put(7.5, st4);
        treeMap1.put(7.9, st6);
        treeMap1.put(8.2, st2);
        treeMap1.put(9.1, st7);
    }
}
