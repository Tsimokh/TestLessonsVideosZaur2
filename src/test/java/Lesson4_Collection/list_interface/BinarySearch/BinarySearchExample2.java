package Lesson4_Collection.list_interface.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample2 {
    public static void main(String[] args) {
        Employee2 emp1 = new Employee2("Tsukerberg", "Mark", 13);
        Employee2 emp2 = new Employee2("Lampard", "Johua", 2);
        Employee2 emp3 = new Employee2("Walsh", "Emeli", 104);
        Employee2 emp4 = new Employee2("Dacascass", "Mark", 77);
        Employee2 emp5 = new Employee2("Ibragimovich", "Zlatan", 7);
        Employee2 emp6 = new Employee2("Zimmermann", "Mark", 35);
        Employee2 emp7 = new Employee2("Cole", "Mark", 18);
        Employee2 emp8 = new Employee2("Ibragimovich", "Zlatan", 4);
        Employee2 emp9 = new Employee2("Sheringem", "Teddy", 27);
        Employee2 emp10 = new Employee2("Tsukerberg", "Mark", 69);
        List<Employee2> listEmployee = new ArrayList<>();
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
        Collections.sort(listEmployee);
        System.out.println(listEmployee);
//        System.out.println(Collections.binarySearch(listEmployee, emp5));
        System.out.println(Collections.binarySearch(listEmployee,
                new Employee2("Ibragimovich", "Zlatan", 7)));

    }
}

class Employee2 implements Comparable<Employee2> {
    String name;
    String surName;
    int id;

    public Employee2(String surname, String name, int id) {
        this.surName = surname;
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

    @Override
    public int compareTo(Employee2 anotherEmployee) {
        int result = this.surName.compareTo(anotherEmployee.surName);
        if (result == 0) {
            result = this.name.compareTo(anotherEmployee.name);
            if(result == 0){
                result = this.id - anotherEmployee.id;
            }
        }
        return result;
    }
}
