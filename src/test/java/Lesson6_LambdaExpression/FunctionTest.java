package Lesson6_LambdaExpression;

import java.util.ArrayList;
import java.util.function.Function;

public class FunctionTest {
    public static double getAvgOfSomething(ArrayList<Student> arrayList, Function<Student, Double> function) {
        double avgDouble = 0.0;
        for (Student s : arrayList) {
                avgDouble += function.apply(s);
        }
        return avgDouble / arrayList.size();
    }

    public static void main(String[] args) {
        ArrayList<Student> arrayListStudents = new ArrayList<>();
        Student st1 = new Student("John", 'm', 22, 3, 8.5);
        Student st2 = new Student("Mike", 'm', 27, 4, 9.7);
        Student st3 = new Student("Nicky", 'f', 19, 1, 8.8);
        Student st4 = new Student("Serhio", 'm', 21, 2, 6.5);
        Student st5 = new Student("Brenda", 'f', 23, 4, 7.7);
        arrayListStudents.add(st1);
        arrayListStudents.add(st2);
        arrayListStudents.add(st3);
        arrayListStudents.add(st4);
        arrayListStudents.add(st5);
        System.out.println(arrayListStudents);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("avg grade of the all students: ");
        System.out.println(getAvgOfSomething(arrayListStudents, x -> x.avgGrade));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("avg course of the all students: ");
        System.out.println(getAvgOfSomething(arrayListStudents, x -> (double) x.course));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("avg age of the all students: ");
        System.out.println(getAvgOfSomething(arrayListStudents, x -> (double) x.age));
        System.out.println("-------------------------------------------------------------------");
//        list.sort((x,y)->{return x.name.compareTo(y.name);});
//        list.sort();
//        System.out.println(list);
//Comparable


    }
}
