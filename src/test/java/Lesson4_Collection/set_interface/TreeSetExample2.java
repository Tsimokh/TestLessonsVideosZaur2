package Lesson4_Collection.set_interface;

import java.util.*;

public class TreeSetExample2 {
    public static void main(String[] args) {
//        LinkedHashSet<Student> treeSet = new LinkedHashSet<>();
        TreeSet<Student> treeSet = new TreeSet<>();
//        TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                int result = 0;
//                result = s1.course - s2.course;
//                if (result == 0) {
//                    result = s1.name.compareTo(s2.name);
//                }
//                return result;
//            }
//        });
        Student st1 = new Student("John", 2);
        Student st2 = new Student("Licie", 4);
        Student st3 = new Student("Adam", 2);
        Student st4 = new Student("Nick", 3);
        Student st5 = new Student("Brenda", 5);
//        Student st6 = new Student("Brenda", 2);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
//        treeSet.add(st6);

        System.out.println(treeSet);
//        System.out.println(treeSet.first());
//        System.out.println(treeSet.last());

        Student st7 = new Student("Jamal", 3);
//        System.out.println(treeSet.headSet(st7));
//        System.out.println(treeSet.tailSet(st7));
        Student st8 = new Student("Marry", 5);

//        System.out.println(treeSet.subSet(st7,st8));
        System.out.println(st4.equals(st7));
        System.out.println(st4.hashCode()==st7.hashCode());
    }
}

class Student implements Comparable<Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return course == student.course && Objects.equals(name, student.name);
//    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return course == student.course;
    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, course);
//    }
        @Override
    public int hashCode() {
        return Objects.hash(course);
    }

//    @Override
//    public int compareTo(Student anotherStudent) {
//        int result = 0;
//        result = this.course - anotherStudent.course;
//        if (result == 0) {
//            result = this.name.compareTo(anotherStudent.name);
//        }
//        return result;
//    }
    @Override
    public int compareTo(Student anotherStudent) {
      return this.course - anotherStudent.course;

    }
}
