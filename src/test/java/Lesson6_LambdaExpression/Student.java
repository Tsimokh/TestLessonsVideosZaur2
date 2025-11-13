package Lesson6_LambdaExpression;

import java.util.ArrayList;
import java.util.function.Predicate;

class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;


    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

//    public void filterStudent(ArrayList<Student> list, Predicate<Student> pr) {
//        for (Student st : list) {
//            if (pr.test(st)) {
//                System.out.println(st.toString());
//            }
//        }
//    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
