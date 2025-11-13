package Lesson6_LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//public class StudentInfo4 {

//    public void printStudents(ArrayList<Student> list, StudentCheck4 sc) {
//        for (Student s : list) {
////            int q=0;
////            if (sc.check(s,q)) {
////                System.out.println(s);
////            }
//            if (sc.check(s)) {
//                System.out.println(s);
//            }
//        }
//    }
//}

class Test4 {
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
//        StudentInfo4 si = new StudentInfo4();
////        int p;
////        si.printStudents(list, (Student st)->{return st.avgGrade > 8;});
//        System.out.println("-----------------------------------------------------------------");
////        si.printStudents(list, p->p.age<30);
////        si.printStudents(list, (Student p)->{return p.age<30;});
////        si.printStudents(list, (Student p)->p.age<30);
////        si.printStudents(list, p->{System.out.println("Hello"); return p.age<30;});
//
////        si.printStudents(list, p->{System.out.println("Hello"); return p.age<30;});
//        StudentCheck4 sc4 =  (p)->{return p.age<30;};
//        si.printStudents(list, sc4);
//        System.out.println("-----------------------------------------------------------------");
////        si.printStudents(list, (st)->st.age > 20 && st.avgGrade < 9.5 && st.sex == 'f');
//        System.out.println("-----------------------------------------------------------------");

//        Collections.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s1.course-s2.course;
//            }
//        });
        Collections.sort(list,(p1,p2)->p1.course-p2.course);

        System.out.println(list);

    }
}

//interface StudentCheck4 {
////    boolean check(Student s, int i);
//    boolean check(Student s);
//}
