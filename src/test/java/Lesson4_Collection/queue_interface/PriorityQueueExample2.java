package Lesson4_Collection.queue_interface;

import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueExample2 {
    public static void main(String[] args) {
        Student2 st1 = new Student2("John", 2);
        Student2 st2 = new Student2("Licie", 4);
        Student2 st3 = new Student2("Adam", 2);
        Student2 st4 = new Student2("Nick", 3);
        Student2 st5 = new Student2("Brenda", 5);
        PriorityQueue<Student2> priorityQueue = new PriorityQueue<>(new Comparator<Student2>() {
            @Override
            public int compare(Student2 s1, Student2 s2) {
                return s1.course- s2.course;
            }
        });
        priorityQueue.add(st1);
        priorityQueue.add(st2);
        priorityQueue.add(st3);
        priorityQueue.add(st4);
        priorityQueue.add(st5);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
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
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student3 student = (Student3) object;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
