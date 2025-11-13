package Lesson4_Collection.queue_interface;


import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueExample3 {
    public static void main(String[] args) {
        Student3 st1 = new Student3("John", 2);
        Student3 st2 = new Student3("Licie", 4);
        Student3 st3 = new Student3("Adam", 2);
        Student3 st4 = new Student3("Nick", 3);
        Student3 st5 = new Student3("Brenda", 5);
        PriorityQueue<Student3> priorityQueue = new PriorityQueue<>();
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

class Student3 implements Comparable<Student3> {
    String name;
    int course;

    public Student3(String name, int course) {
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
    
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student3 Student2 = (Student3) object;
        return course == Student2.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
    
    @Override
    public int compareTo(Student3 anotherStudent2) {
        return this.course - anotherStudent2.course;

    }
}