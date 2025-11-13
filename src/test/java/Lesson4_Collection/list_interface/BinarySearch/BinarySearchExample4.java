package Lesson4_Collection.list_interface.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchExample4 {
    public static void main(String[] args) {
        Employee4 emp1 = new Employee4("Tsukerberg", "Mark", 13);
        Employee4 emp2 = new Employee4("Lampard", "Johua", 2);
        Employee4 emp3 = new Employee4("Walsh", "Emeli", 104);
        Employee4 emp4 = new Employee4("Dacascass", "Mark", 77);
        Employee4 emp5 = new Employee4("Ibragimovich", "Zlatan", 7);
        Employee4 emp6 = new Employee4("Zimmermann", "Mark", 35);
        Employee4 emp7 = new Employee4("Cole", "Mark", 18);
        Employee4 emp8 = new Employee4("Ibragimovich", "Zlatan", 4);
        Employee4 emp9 = new Employee4("Sheringem", "Teddy", 27);
        Employee4 emp10 = new Employee4("Tsukerberg", "Mark", 69);
        List<Employee4> listEmployee = new ArrayList<>();
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

        Comparator<Employee4> employeeComparator = Comparator
                .comparing(Employee4::getSurName)
                .thenComparing(Employee4::getName)
                .thenComparing(Employee4::getId);

        Collections.sort(listEmployee, employeeComparator);
        System.out.println(listEmployee);
//        System.out.println(Collections.binarySearch(listEmployee, emp5));

        System.out.println(Collections.binarySearch(listEmployee,
                new Employee4("Ibragimovich", "Zlatan", 7), employeeComparator));

    }
}

class Employee4 {
    private String name;

    private String surName;

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getId() {
        return id;
    }

    private int id;


    Employee4(String surName, String name, int id) {
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