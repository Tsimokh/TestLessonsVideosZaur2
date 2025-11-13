package Lesson4_Collection.list_interface.LinkedList;

import java.util.LinkedList;

public class LinkedListExample1 {
    public static void main(String[] args) {
        Student2 st1 = new Student2("John", 3);
        Student2 st2 = new Student2("Maria", 1);
        Student2 st3 = new Student2("Brenda", 4);
        Student2 st4 = new Student2("Arnold", 2);
        Student2 st5 = new Student2("Will", 5);
        LinkedList<Student2> listStudent = new LinkedList<>();
        listStudent.add(st1);
        listStudent.add(st2);
        listStudent.add(st3);
        listStudent.add(st4);
        listStudent.add(st5);
        System.out.println("LinkedList = " + listStudent);
////        System.out.println(listStudent.get(2));
//        Student2 st6 = new Student2("Lucie", 3);
//        Student2 st7 = new Student2("Max", 1);
//        listStudent.add(st6);
//        listStudent.add(st7);
//        System.out.println("LinkedList = " + listStudent);
        listStudent.remove(1);
        System.out.println("LinkedList = " + listStudent);
    }
}

class Student2 {
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
