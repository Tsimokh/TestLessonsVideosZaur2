package Lesson7_Srteams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        Student st1 = new Student("John", 'm', 19, 2, 88.1);
        Student st2 = new Student("Maria", 'f', 22, 4, 74.3);
        Student st3 = new Student("Brenda", 'f', 17, 1, 62.9);
        Student st4 = new Student("Arnold", 'm', 20, 3, 77.6);
        Student st5 = new Student("Will", 'm', 23, 5, 91.2);
        List<Student> listStudent = new LinkedList<>();
        listStudent.add(st1);
        listStudent.add(st2);
        listStudent.add(st3);
        listStudent.add(st4);
        listStudent.add(st5);
//        System.out.println(
//                "LinkedList before sort = "
////                        + "list before method \"forEach()\": "
//                        + listStudent);
//
//       listStudent = listStudent.stream().sorted((x, y)->x.getName().compareTo(y.getName())).collect(Collectors.toList());
//        System.out.println(
//                "LinkedList after sort = "
//                                + listStudent);
//
//     String[] listInteger = {"1","177","7","50","323","3","79"};
//        listInteger = Arrays.stream(listInteger).sorted((x,y)->x.compareTo(y)).toArray(String[]::new);
//        System.out.println(Arrays.toString(listInteger));
//
////
////        listStudent.forEach(x -> {
////            x.setAvgGrade((double) Math.round((x.getAvgGrade() / 10) * 100) / 100);
////            System.out.println(x);
////        });
////        System.out.println("list after method \"forEach()\": " + listStudent);
////
//////        listStudent = listStudent.stream().filter(st->st.getAge()>18 && st.getAvgGrade()<88.2)
//////                .collect(Collectors.toCollection(LinkedList::new));
//////        System.out.println("LinkedList after sort = " + listStudent);
////        Student[] arrS = {new Student("John", 'm', 19, 2, 88.1),
////                new Student("Maria", 'f', 22, 4, 74.3),
////                new Student("Brenda", 'f', 17, 1, 62.9),
////                new Student("Arnold", 'm', 20, 3, 77.6),
////                new Student("Will", 'm', 23, 5, 91.2)};
////        System.out.println("array before method \"forEach()\": " + Arrays.toString(arrS));
////        Arrays.stream(arrS).forEach(x -> {
////            x.setName("!!!");
////            System.out.println(x);
////        });
////        System.out.println("array after method \"forEach()\": " + Arrays.toString(arrS));
//        Stream<Student> myStream = Stream.of(st1,st2,st3,st4,st5);
////        myStream.forEach(System.out::println);
////        System.out.println(myStream.filter(x->x.getAvgGrade()>77.7&&x.getAge()<24).collect(Collectors.toList()));

        System.out.println("List before chaining methods: "+"\n"+listStudent);
        System.out.println("------------------------------------------");
        System.out.println("List after chaining methods: ");
        listStudent.stream().map(e -> {e.setName(e.getName().toUpperCase()); return e;})
                        .filter(e->e.getSex()=='f').sorted((x,y)->{return x.getAge()- y.getAge();})
                        .forEach(System.out::println);
        System.out.println("------------------------------------------");
        }
    }

    class Student {
        private String name;
        private char sex;
        private int age;
        private int course;
        private double avgGrade;
        private long id;

        public Student(String name, char sex, int age, int course, double avgGrade) {
            this.setName(name);
            this.setSex(sex);
            this.setAge(age);
            this.setCourse(course);
            this.setAvgGrade(avgGrade);
            this.id = 101010+1;
        }

        public long getId(){
           return id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public char getSex() {
            return sex;
        }

        public void setSex(char sex) {
            this.sex = sex;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getCourse() {
            return course;
        }

        public void setCourse(int course) {
            this.course = course;
        }

        public double getAvgGrade() {
            return avgGrade;
        }

        public void setAvgGrade(double avgGrade) {
            this.avgGrade = avgGrade;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", sex=" + sex +
                    ", age=" + age +
                    ", course=" + course +
                    ", avgGrade=" + avgGrade +
                    '}';
        }
    }
