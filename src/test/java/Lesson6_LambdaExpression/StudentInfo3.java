package Lesson6_LambdaExpression;

import java.util.ArrayList;

public class StudentInfo3 {
    public void printStudents(ArrayList<Student> list, StudentCheck3 sc) {
        for (Student s : list) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }
}

class Test3 {
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
        StudentInfo3 si = new StudentInfo3();
        si.printStudents(list, new StudentCheck3() {@Override public boolean check(Student s) {return s.avgGrade > 8;}});
        System.out.println("-----------------------------------------------------------------");
        si.printStudents(list, new StudentCheck3() {@Override public boolean check(Student s) {return s.age<30;}});
        System.out.println("-----------------------------------------------------------------");
        si.printStudents(list, new StudentCheck3(){@Override public boolean check(Student s){return s.age > 20 && s.avgGrade < 9.5 && s.sex == 'f';}});
        System.out.println("-----------------------------------------------------------------");
    }
}

interface StudentCheck3 {
    boolean check(Student s);
}

