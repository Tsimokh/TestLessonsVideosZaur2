package Lesson4_Collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("John");
        hs.add("Mark");
        hs.add("Mikkie");
        hs.add("David");
//        System.out.println(hs);
        hs.remove("David");
//        for(String s :hs){
//            System.out.println(s);
//        }
//        hs.add(null);
        System.out.println(hs);
//        System.out.println(hs.size());
//        System.out.println(hs.isEmpty());
        System.out.println(hs.contains("David"));
    }
}
