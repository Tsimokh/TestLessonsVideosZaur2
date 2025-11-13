package Lesson4_Collection.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

 public class HashCodeExample1 {
    public static void main(String[] args) {
        Map<Student, Double> hashMap1 = new HashMap<>();
        Student st1 = new Student("John", "Morris", 2);
        Student st2 = new Student("Licie", "Mackkenley", 4);
        Student st3 = new Student("Adam", "Sendler", 1);
        hashMap1.put(st1, 8.8);
        hashMap1.put(st2, 9.2);
        hashMap1.put(st3, 7.7);
//        System.out.println(hashMap1);
//        Student st4 = new Student("Licie", "Mackkenley", 4);
//        boolean result = hashMap1.containsKey(st4);
//        System.out.println("result = " + result);
//        System.out.println(st1.hashCode());
//        System.out.println(st2.hashCode());
//        System.out.println(st3.hashCode());
//        for (Map.Entry<Student, Double> entry : hashMap1.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }
//        System.out.println(hashMap1.containsKey(st1));
        System.out.println(st1.hashCode());
        st1.course=6;
//        System.out.println(hashMap1.containsKey(st1));
//        System.out.println(hashMap1.get(st1));
        System.out.println(st1.hashCode());
    }
}

 class Student {

    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
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
//    @Override
//    public int hashCode() {
////        return name.length() + surname.length() + course;
//        return name.length() * 11 + surname.length() * 12 + course * 13;
//    }
}

