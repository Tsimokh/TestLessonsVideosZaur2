package Lesson4_Collection.map_interface;

import java.util.TreeMap;

public class TreeMapExample5 {
    public static void main(String[] args) {
        Student4 st1 = new Student4("John", "Morris", 2);
        Student4 st2 = new Student4("Licie", "Mackkenley", 4);
        Student4 st3 = new Student4("Adam", "Sendler", 2);
        Student4 st4 = new Student4("Nick", "Nickolson", 3);
        Student4 st5 = new Student4("Brenda", "Walsh", 5);
        Student4 st6 = new Student4("Erica", "Tsukerman", 3);
        Student4 st7 = new Student4("Jefri", "Mackain", 1);
        Student4 st8 = new Student4("Jefri", "Mackain", 1);
        TreeMap<Student4, Double> treeMap1 = new TreeMap<>();
        treeMap1.put(st5, 8.5);
        treeMap1.put(st2, 7.8);
        treeMap1.put(st4, 7.4);
        treeMap1.put(st7, 8.1);
        treeMap1.put(st3, 9.1);
        treeMap1.put(st6, 7.7);
        treeMap1.put(st1, 6.9);
//        System.out.println(treeMap1);
        System.out.println(treeMap1.containsKey(st8));
    }
}

class Student4 implements Comparable<Student4> {

    String name;
    String surname;
    int course;

    public Student4(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }


    @Override
    public int compareTo(Student4 anotherStudent) {
        return this.name.compareTo(anotherStudent.name);
    }
}
