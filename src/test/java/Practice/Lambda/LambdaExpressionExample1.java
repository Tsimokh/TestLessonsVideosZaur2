package Practice.Lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class LambdaExpressionExample1 {
}

class Student1 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student1() {

    }

    public Student1(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public void filterStudent(ArrayList<Student1> list, Predicate<Student1> pr) {
        for (Student1 st : list) {
            if (pr.test(st)) {
                System.out.println(st);
            }
        }
    }

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

class Test1 {
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();
        Student1 st1 = new Student1("John", 'm', 22, 3, 8.5);
        Student1 st2 = new Student1("Mike", 'm', 27, 4, 9.7);
        Student1 st3 = new Student1("Nicky", 'f', 19, 1, 8.8);
        Student1 st4 = new Student1("Serhio", 'm', 21, 2, 6.5);
        Student1 st5 = new Student1("Brenda", 'f', 23, 4, 7.7);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        System.out.println(list);
        System.out.println("-----------------------------------------------------------------");
        Student1 st = new Student1();
        System.out.println("avgGrade > 8.2: ");
        st.filterStudent(list, (p) -> p.avgGrade > 8.2);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("avgGrade < 9: ");
        st.filterStudent(list, (s) -> s.avgGrade < 9);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("age > 23: ");
        st.filterStudent(list, (s) -> s.age > 23);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("age < 25: ");
        st.filterStudent(list, (s) -> s.age < 25);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("sex == 'm': ");
        st.filterStudent(list, (s) -> s.sex == 'm');
        System.out.println("-----------------------------------------------------------------");
        System.out.println("avgGrade > 8 && s.age < 26 && s.sex == 'f': ");
        st.filterStudent(list, (s) -> s.avgGrade > 8 && s.age < 26 && s.sex == 'f');
    }
}
