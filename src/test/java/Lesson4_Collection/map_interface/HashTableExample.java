package Lesson4_Collection.map_interface;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Double, Student> ht = new Hashtable<>();
        Student st1 = new Student("John", "Morris", 2);
        Student st2 = new Student("Licie", "Mackkenley", 4);
        Student st3 = new Student("Adam", "Sendler", 2);
        Student st4 = new Student("Nick", "Nickolson", 3);
        ht.put(7.8, st1);
        ht.put(9.3, st4);
        ht.put(5.8, st2);
        ht.put(6.0, st3);
//        ht.put(null, st3);
        ht.put(5.5, null);
        System.out.println(ht);

    }
}
