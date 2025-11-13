package Lesson4_Collection.list_interface.Vecotor;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Mike");
        vector.add("Sonia");
        vector.add("David");
        vector.add("Maria");
        vector.add("Mike");
        vector.add("Tyson");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(1));
    }
}
