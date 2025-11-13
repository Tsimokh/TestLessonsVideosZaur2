package Lesson6_LambdaExpression;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentInfo5 {
    public void printStudents(ArrayList<Student> list, Predicate<Student> pr) {
        for (Student s : list) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}

class Test5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("John", 'm', 22, 3, 8.5);
        Student st2 = new Student("Mike", 'm', 27, 4, 9.7);
        Student st3 = new Student("Nicky", 'f', 19, 1, 8.8);
        Student st4 = new Student("Serhio", 'm', 21, 2, 6.5);
        Student st5 = new Student("Brenda", 'f', 23, 4, 7.7);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        System.out.println(list);
        StudentInfo5 si = new StudentInfo5();
//        si.printStudents(list, p-> p.avgGrade > 8);
//        System.out.println("-----------------------------------------------------------------");
//        si.printStudents(list, p->p.age<30);
//        System.out.println("-----------------------------------------------------------------");
//        si.printStudents(list, p->p.age > 20 && p.avgGrade < 9.5 && p.sex == 'f');
//        System.out.println("-----------------------------------------------------------------");
        Predicate<Student> p1 = s -> s.avgGrade > 7.5;
//        Predicate<Student> p2 = s -> s.sex == 'm';
//        si.printStudents(list, p1.and(p2));
//        si.printStudents(list, ((Predicate<Student>) (s -> s.avgGrade > 7.5)).and(s -> s.sex == 'm'));
//        si.printStudents(list, ((Predicate<Student>) (s -> s.avgGrade > 7.5)).or(s -> s.sex == 'm'));
        si.printStudents(list, p1.negate());

    }
}