package Lesson7_Srteams;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test8 {
    public static void main(String[] args) {
        Student st1 = new Student("John", 'm', 19, 2, 88.1);
        Student st2 = new Student("Maria", 'f', 22, 4, 74.3);
        Student st3 = new Student("Brenda", 'f', 17, 1, 62.9);
        Student st4 = new Student("Arnold", 'm', 20, 3, 77.6);
        Student st5 = new Student("Will", 'm', 23, 5, 91.2);
        Student st6 = new Student("Maggy", 'f', 22, 3, 91.2);
        List<Student> listStudent = new LinkedList<>();
        listStudent.add(st1);
        listStudent.add(st2);
        listStudent.add(st3);
        listStudent.add(st4);
        listStudent.add(st5);
        listStudent.add(st6);

//        Map<Integer, List<Student>> map1 = listStudent.stream().map(element -> {
//                    element.setName(element.getName().toUpperCase());
//                    return element;
//                })
//                .collect(Collectors.groupingBy(element -> element.getCourse()));
////        System.out.println(map1);
//        for (Map.Entry<Integer, List<Student>> entry : map1.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
////        System.out.println(map1);


//        Map<Boolean, List<Student>> map2 = listStudent.stream().collect(Collectors.partitioningBy(x -> x.getAvgGrade() > 77));
//        for (Map.Entry<Boolean, List<Student>> entry : map2.entrySet()) {
//            System.out.println("good avgGrade - " + entry.getKey() + " : " + entry.getValue());
////            System.out.println(map2);
//        }
//        Map.Entry firstStudent = map2.entrySet().stream().findFirst().get();
//
       Student firstStudent = listStudent.stream().findFirst().get();
        System.out.println(firstStudent);
    }
}
