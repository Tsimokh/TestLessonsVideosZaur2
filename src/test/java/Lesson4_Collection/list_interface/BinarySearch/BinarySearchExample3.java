package Lesson4_Collection.list_interface.BinarySearch;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample3 {
    public static void main(String[] args) {
        Employee3 emp1 = new Employee3("Tsukerberg", "Mark", 13);
        Employee3 emp2 = new Employee3("Lampard", "Johua", 2);
        Employee3 emp3 = new Employee3("Walsh", "Emeli", 104);
        Employee3 emp4 = new Employee3("Dacascass", "Mark", 77);
        Employee3 emp5 = new Employee3("Ibragimovich", "Zlatan", 7);
        Employee3 emp6 = new Employee3("Zimmermann", "Mark", 35);
        Employee3 emp7 = new Employee3("Cole", "Mark", 18);
        Employee3 emp8 = new Employee3("Ibragimovich", "Zlatan", 4);
        Employee3 emp9 = new Employee3("Sheringem", "Teddy", 27);
        Employee3 emp10 = new Employee3("Tsukerberg", "Mark", 69);
        List<Employee3> listEmployee = new ArrayList<>();
        listEmployee.add(emp6);
        listEmployee.add(emp9);
        listEmployee.add(emp5);
        listEmployee.add(emp7);
        listEmployee.add(emp1);
        listEmployee.add(emp4);
        listEmployee.add(emp3);
        listEmployee.add(emp8);
        listEmployee.add(emp10);
        listEmployee.add(emp2);
        System.out.println(listEmployee);

//        Comparator<Employee3> employeeComparator = Comparator
//                .comparing((Employee3 e) -> {return e.surName;})
//                .thenComparing((Employee3 e) -> {return e.name;})
//        .thenComparing((Employee3 e) -> {return e.id;});
        

        Comparator<Employee3> employeeComparator = Comparator
                .comparing((Employee3 e) -> e.surName)
                .thenComparing(e -> e.name)
                .thenComparingInt(e -> e.id);

        Collections.sort(listEmployee, employeeComparator);
        System.out.println(listEmployee);
//        System.out.println(Collections.binarySearch(listEmployee, emp5));

        System.out.println(Collections.binarySearch(listEmployee,
                new Employee3("Ibragimovich", "Zlatan", 7), employeeComparator));

    }
}

class Employee3 {
    String name;

    String surName;

    int id;


    Employee3(String surName, String name, int id) {
        this.surName = surName;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "surName='" + surName + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}