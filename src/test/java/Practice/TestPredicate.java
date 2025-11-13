package Practice;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestPredicate {

    public static void printInfoStudents(List<Student> al, Predicate<Student> pr) {
        for (Student s : al) {
            if (pr.test(s)) {
                System.out.print(s);
            }
        }
    }

    public static void removeStudentsIf(List<Student> al, Predicate<Student> pr) {

        for (int i = 0; i < al.size(); i++) {
            if(pr.test(al.get(i))){
                al.remove(i);
            }
        }
    }

    public static void main(String[] args) {


        Student st1 = new Student("Bernard", "Hopkings", 35, 5, 7.2, 'm');
        Student st2 = new Student("Jack", "Besus", 27, 3, 8.9, 'm');
        Student st3 = new Student("Mariya", "Hopkings", 23, 4, 8.1, 'f');
        Student st4 = new Student("Mike", "Jackson", 17, 1, 9.3, 'm');
        Student st5 = new Student("Angel", "Morris", 25, 4, 6.9, 'f');
        Student st6 = new Student("Volodymyr", "Velukiy", 35, 2, 8.2, 'm');
        Student st7 = new Student("Sonia", "Lembard", 22, 3, 9.0, 'f');
        Student[] arrayStudents = {st1, st2, st3, st4, st5, st6, st7};
//        int [] arr = {1,5,8,99,3,4,2,0,8,19,3};
//        System.out.println(Arrays.toString(arr));
//       arr = Arrays.stream(arr).sorted().toArray();
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrayStudents));
        arrayStudents = Arrays.stream(arrayStudents).sorted((x,y) ->x.getSurname().compareTo(y.getSurname())).toArray(Student[]::new);
        System.out.println(Arrays.toString(arrayStudents));
//        for(Student s: arrayStudents){
//            System.out.print(s);
//        }
//        Arrays.sort();
        List<Student> list = new ArrayList<>();
//        list.add(st1);
//        list.add(st6);
//        list.add(st2);
//        list.add(st4);
//        list.add(st3);
//        list.add(st5);
//        list.add(st7);

        for (int i = 0; i < arrayStudents.length; i++) {
            list.add(arrayStudents[i]);
        }

//        System.out.println(list);
////        StudentInfo studentInfo = new StudentInfo();
//        System.out.println("------------------------");
//        printInfoStudents(list, student -> student.getSex() == 'f');
//        printInfoStudents(list, (Student s) -> {
//            return s.getSex() == 'm';
//        });
//        System.out.println("------------------------");
//        printInfoStudents(list, student -> student.getAge() < 20);
//        System.out.println("------------------------");
//        printInfoStudents(list, student -> student.getCourse() > 2 && student.getName().startsWith("M"));
//        System.out.println("------------------------");
//        printInfoStudents(list, student -> student.getAge() > 8 && student.getAge() < 9);
//        System.out.println("------------------------");
//        printInfoStudents(list, student -> student.getSex() == 'm' && student.getCourse() >= 2 && student.getCourse() < 5);
//        System.out.println("------------------------");
//        removeStudentsIf(list, student -> student.getName().startsWith("B"));
//        System.out.println(list);
    }

}

class Student {
    private String surname;
    private String name;
    private int age;
    private int course;
    private double avgGrade;
    private char sex;

    public Student(String name, String surname, int age, int course, double avgGrade, char sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
        this.sex = sex;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public char getSex() {
        return sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && course == student.course && Double.compare(avgGrade, student.avgGrade) == 0
                && sex == student.sex && Objects.equals(surname, student.surname) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, age, course, avgGrade, sex);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                ", sex=" + sex +
                '}';
    }
}


//class StudentInfo {
//    public static void printInfo(List<Student> al, Predicate<Student> pr) {
//        for (Student s : al) {
//            if (pr.test(s)) {
//                System.out.print(s);
//            }
//        }
//    }
//}
