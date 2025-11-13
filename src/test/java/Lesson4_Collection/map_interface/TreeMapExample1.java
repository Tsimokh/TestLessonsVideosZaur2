package Lesson4_Collection.map_interface;

import java.util.TreeMap;

public class TreeMapExample1 {
    public static void main(String[] args) {
//        Student st1 = new Student("John", "Morris", 2);
//        Student st2 = new Student("Licie", "Mackkenley", 4);
//        Student st3 = new Student("Adam", "Sendler", 2);
//        Student st4 = new Student("Nick", "Nickolson", 3);
//        Student st5 = new Student("Brenda", "Walsh", 5);
//        Student st6 = new Student("Erica", "Tsukerman", 3);
//        Student st7 = new Student("Jefri", "Mackain", 1);
//        Student st8 = new Student("Jefri", "Mackain", 1);
//        Student st9 = new Student("Kate", "Soliar", 5);
//        TreeMap<Double, Student> treeMap1 = new TreeMap<>();
//        treeMap1.put(8.5,st5);
//        treeMap1.put(7.8,st2);
//        treeMap1.put(7.4,st4);
//        treeMap1.put(8.1,st7);
//        treeMap1.put(9.1,st3);
//        treeMap1.put(7.7,st6);
//        treeMap1.put(6.9,st1);
////        treeMap1.put(6.3,st8);
////        System.out.println(treeMap1);
////        treeMap1.put(6.3,st9);
////        System.out.println(treeMap1);
////        System.out.println(treeMap1.get(7.4));
////        treeMap1.remove(6.9);
////        System.out.println(treeMap1.get(7.9));
////        System.out.println(treeMap1);
////        System.out.println(treeMap1.descendingMap());
////        System.out.println(treeMap1.tailMap(7.8));
////        System.out.println(treeMap1.headMap(7.8));
////        System.out.println(treeMap1.lastEntry());
//        System.out.println(treeMap1.firstEntry());
        Student st1 = new Student("John", "Morris", 2);
        Student st2 = new Student("Licie", "Mackkenley", 4);
        Student st3 = new Student("Adam", "Sendler", 2);
        Student st4 = new Student("Nick", "Nickolson", 3);
        Student st5 = new Student("Brenda", "Walsh", 5);
        Student st6 = new Student("Erica", "Tsukerman", 3);
        Student st7 = new Student("Jefri", "Mackain", 1);
        Student st8 = new Student("Jefri", "Mackain", 1);
        Student st9 = new Student("Kate", "Soliar", 5);
        TreeMap<Student,Double> treeMap1 = new TreeMap<>();
        treeMap1.put(st5,8.5);
        treeMap1.put(st2,7.8);
        treeMap1.put(st4,7.4);
        treeMap1.put(st7,8.1);
        treeMap1.put(st3,9.1);
        treeMap1.put(st6,7.7);
        treeMap1.put(st1,6.9);
        System.out.println(treeMap1);

    }
}
