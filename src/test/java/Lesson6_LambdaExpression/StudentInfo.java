package Lesson6_LambdaExpression;

import java.util.ArrayList;

public class StudentInfo {
    public void printStudentsOverGrade(ArrayList<Student> list, double grade) {
        System.out.println("Students with over grade " + grade + ":");
        for (Student s : list) {
            if (s.avgGrade > grade) {
                System.out.println(s);
            }
        }
    }

    public void printStudentsUnderAge(ArrayList<Student> list, int age) {
        System.out.println("Students with under age " + age + ":");
        for (Student s : list) {
            if (s.age < age) {
                System.out.println(s);
            }
        }
    }

    public void printStudentsMixConditions(ArrayList<Student> list, int age, double grade, char sex) {
        System.out.println("Students with over age " + age + ", under grade " + grade + ", char = " + sex + ":");
        for (Student s : list) {
            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
                System.out.println(s);
            }
        }
    }
}


class Test1 {
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
//        System.out.println(list);
//        System.out.println("-----------------------------------------------------------------");
        StudentInfo info = new StudentInfo();
        info.printStudentsOverGrade(list, 8);
        System.out.println("-----------------------------------------------------------------");
        info.printStudentsUnderAge(list, 30);
        System.out.println("-----------------------------------------------------------------");
        info.printStudentsMixConditions(list, 20, 9.5, 'f');
        System.out.println("-----------------------------------------------------------------");

//        System.out.println("-----------------------------------------------------------------");
//        Student st = new Student();
//        System.out.println("avgGrade > 8.2: ");
//        st.filterStudent(list, (p) -> p.avgGrade > 8.2);
//        System.out.println("-----------------------------------------------------------------");
//        System.out.println("avgGrade < 9: ");
//        st.filterStudent(list, (s) -> s.avgGrade < 9);
//        System.out.println("-----------------------------------------------------------------");
//        System.out.println("age > 23: ");
//        st.filterStudent(list, (s) -> s.age > 23);
//        System.out.println("-----------------------------------------------------------------");
//        System.out.println("age < 25: ");
//        st.filterStudent(list, (s) -> s.age < 25);
//        System.out.println("-----------------------------------------------------------------");
//        System.out.println("sex == 'm': ");
//        st.filterStudent(list, (s) -> s.sex == 'm');
//        System.out.println("-----------------------------------------------------------------");
//        System.out.println("avgGrade > 8 && s.age < 26 && s.sex == 'f': ");
//        st.filterStudent(list, (s) -> s.avgGrade > 8 && s.age < 26 && s.sex == 'f');
    }
}
