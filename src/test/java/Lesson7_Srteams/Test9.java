package Lesson7_Srteams;

import java.util.*;
import java.util.stream.Collectors;

public class Test9 {
    public static void main(String[] args) {
//        List<Integer> list1 = List.of(4,67,-87,90,1,5,0,3,7);
//        Integer min = list1.stream().min((x,y)->x.compareTo(y)).get();
//        System.out.println(min);
//        Integer max = list1.stream().max((x,y)->x.compareTo(y)).get();
//        System.out.println(max);
        Student st1 = new Student("John", 'm', 19, 2, 88.1);
        Student st2 = new Student("Maria", 'f', 23, 4, 74.3);
        Student st3 = new Student("Brenda", 'f', 17, 1, 62.9);
        Student st4 = new Student("Arnold", 'm', 20, 3, 77.6);
        Student st5 = new Student("Will", 'm', 23, 5, 91.2);
        Student st6 = new Student("Maggy", 'f', 22, 3, 91.2);
        List<Student> listStudent = List.of(st1, st2, st3, st4, st5, st6);
//////        Comparator<Student> compareStudentAge = Comparator.comparing(x->x.getAge());
//////        Student studentMinAge = listStudent.stream().min(compareStudentAge).get();
//////        Student studentMaxAge = listStudent.stream().max(compareStudentAge).get();
////////        Student minStudent = listStudent.stream().min((x, y) -> x.getAge() - y.getAge()).get();
////////        Student maxStudent = listStudent.stream().max((x, y) -> x.getAge() - y.getAge()).get();
////////        System.out.println("The min student: " + minStudent + "\n" + "The max student: " + maxStudent);
////////        System.out.println("The min student age: " + minStudent);
////////        System.out.println("The max student age: " + maxStudent);
//////        System.out.println("The min student age: " + studentMinAge);
//////        System.out.println("The max student age: " + studentMaxAge);
////
////        listStudent.stream().filter(x->x.getAge()>=20).forEach(System.out::println);
////        System.out.println("------------------");
////        listStudent.stream().filter(x->x.getAge()>=20).limit(2).forEach(System.out::println);
////        System.out.println("------------------");
////        listStudent.stream().filter(x->x.getAge()>=20).skip(3).forEach(System.out::println);
//        List<Integer> listIntegers = listStudent.stream().mapToInt(x->x.getAge()).boxed().collect(Collectors.toList());
//        System.out.println(listIntegers);
//
//        List<Double> listDoubles = listStudent.stream().mapToDouble(x->x.getAvgGrade()).boxed().collect(Collectors.toList());
//        System.out.println(listDoubles);
        int sumCourses = listStudent.stream().mapToInt(x->x.getCourse()).sum();
        System.out.println(sumCourses);

        double average = listStudent.stream().mapToInt(x->x.getAge()).average().getAsDouble();
        System.out.println(average);
        System.out.println("-----------");

//        double averageL = listStudent.stream().mapToLong(x->x.getId()).average().getAsDouble();
//        System.out.println(averageL);

        int min = listStudent.stream().mapToInt(x->x.getCourse()).min().getAsInt();
        System.out.println(min);

        int max = listStudent.stream().mapToInt(x->x.getCourse()).max().getAsInt();
        System.out.println(max);
        System.out.println("--------------");

        int [] arr = {10,3,9,0,2,3,5,6,8};
        System.out.println(Arrays.toString(Arrays.stream(arr).filter(x->x%2==0&& x!=0).toArray()));
        System.out.println(Arrays.stream(arr).min().getAsInt());
        System.out.println(Arrays.stream(arr).max().getAsInt());
        System.out.println(Arrays.stream(arr).average().getAsDouble());
        System.out.println(Arrays.stream(arr).sum());

    }
}
