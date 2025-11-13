package Lesson4_Collection.map_interface;

import java.util.Objects;
import java.util.TreeMap;

public class TreeMapExample4 {
    public static void main(String[] args) {
        Student3 st1 = new Student3("John", "Morris", 2);
        Student3 st2 = new Student3("Licie", "Mackkenley", 4);
        Student3 st3 = new Student3("Adam", "Sendler", 2);
        Student3 st4 = new Student3("Nick", "Nickolson", 3);
        Student3 st5 = new Student3("Brenda", "Walsh", 5);
        Student3 st6 = new Student3("Erica", "Tsukerman", 3);
        Student3 st7 = new Student3("Jefri", "Mackain", 1);
        Student3 st8 = new Student3("Jefri", "Mackain", 1);
        Student3 st9 = new Student3("Kate", "Soliar", 5);
        TreeMap<Student3, Double> treeMap1 = new TreeMap<>((s1,s2)->{return s1.name.compareTo(s2.name);});
//        TreeMap<Student3, Double> treeMap1 = new TreeMap<>((s1,s2)->s1.name.compareTo(s2.name));

        treeMap1.put(st5, 8.5);
        treeMap1.put(st2, 7.8);
        treeMap1.put(st4, 7.4);
        treeMap1.put(st7, 8.1);
        treeMap1.put(st3, 9.1);
        treeMap1.put(st6, 7.7);
        treeMap1.put(st1, 6.9);
        System.out.println(treeMap1);
    }
}

class Student3 {

    String name;
    String surname;
    int course;

    public Student3(String name, String surname, int course) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
//
}
