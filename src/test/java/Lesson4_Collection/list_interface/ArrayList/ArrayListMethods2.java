package Lesson4_Collection.list_interface.ArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {

    public static void main(String[] args) {
        Student1 st1 = new Student1("Mike", 'm', 26,4,7.8);
        Student1 st2 = new Student1("Mariya", 'f', 24,3,8.2);
        Student1 st3 = new Student1("Arnold", 'm', 19,1,9.1);
        Student1 st4 = new Student1("Jerry", 'f', 21,2,7.9);
        Student1 st5 = new Student1("Silvestor", 'm', 30,5,8.5);
        ArrayList<Student1> listStudents = new ArrayList<>();
        listStudents.add(st1);
        listStudents.add(st2);
        listStudents.add(st3);
        listStudents.add(st4);
        listStudents.add(st5);
        System.out.println(listStudents);
        Student1 st6 = new Student1("Silvestor", 'm', 30,5,8.5);
        listStudents.remove(st6);
        System.out.println(listStudents);

    }
}

class Student1 {
    String name;
    char sex;
    int age;
    int coure;
    double avgGrade;

    public Student1(String name, char sex, int age, int coure, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.coure = coure;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", coure=" + coure +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student1 student = (Student1) object;
        return sex == student.sex && age == student.age && coure == student.coure && Double.compare(avgGrade,
                student.avgGrade) == 0 && Objects.equals(name, student.name);
    }
}
