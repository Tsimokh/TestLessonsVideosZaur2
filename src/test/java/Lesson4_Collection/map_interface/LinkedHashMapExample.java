package Lesson4_Collection.map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>(16,0.75f,true);
        Student st1 = new Student("John", "Morris", 2);
        Student st2 = new Student("Licie", "Mackkenley", 4);
        Student st3 = new Student("Adam", "Sendler", 2);
        Student st4 = new Student("Nick", "Nickolson", 3);

        lhm.put(7.2, st1);
        lhm.put(7.5, st4);
        lhm.put(5.8, st2);
        lhm.put(6.4, st3);
        System.out.println(lhm);
        System.out.println(lhm.get(6.4));
        System.out.println(lhm.get(7.2));
        System.out.println(lhm.get(7.5));
        System.out.println(lhm.get(5.8));

        System.out.println(lhm);
    }
}
