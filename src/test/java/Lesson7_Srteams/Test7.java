package Lesson7_Srteams;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        Student st1 = new Student("John", 'm', 19, 2, 88.1);
        Student st2 = new Student("Maria", 'f', 22, 4, 74.3);
        Student st3 = new Student("Brenda", 'f', 17, 1, 62.9);
        Student st4 = new Student("Arnold", 'm', 20, 3, 77.6);
        Student st5 = new Student("Will", 'm', 23, 5, 91.2);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied Mathematics");

        f1.addStudentsToFaculty(st1);
        f1.addStudentsToFaculty(st2);
        f1.addStudentsToFaculty(st3);
        f2.addStudentsToFaculty(st4);
        f2.addStudentsToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream()).forEach(e->System.out.println(e.getName()));
    }
}

class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentsToFaculty(Student student) {
        studentsOnFaculty.add(student);
    }
}
