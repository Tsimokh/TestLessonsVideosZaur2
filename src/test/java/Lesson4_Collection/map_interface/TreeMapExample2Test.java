package Lesson4_Collection.map_interface;

import org.testng.annotations.Test;

import java.util.Objects;
import java.util.TreeMap;
public class TreeMapExample2Test {
    @Test
    public void testTreeMapExample2() {
        Student4 st1 = new Student4("John", "Morris", 2);
        Student4 st2 = new Student4("Licie", "Mackkenley", 4);
        Student4 st3 = new Student4("Adam", "Sendler", 2);
        Student4 st4 = new Student4("Nick", "Nickolson", 3);
        Student4 st5 = new Student4("Brenda", "Walsh", 5);
        Student4 st6 = new Student4("Erica", "Tsukerman", 3);
        Student4 st7 = new Student4("Jefri", "Mackain", 1);
        Student4 st8 = new Student4("Jefri", "Mackain", 1);
        Student4 st9 = new Student4("Kate", "Soliar", 5);
        TreeMap<Student4,Double> treeMap1 = new TreeMap<>();
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
class StudentC implements Comparable<Student4> {

    String name;
    String surname;
    int course;

    public StudentC(String name, String surname, int course) {
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

    @Override
    public int compareTo(Student4 anotherStudent) {
        return this.name.compareTo(anotherStudent.name);
    }
}
