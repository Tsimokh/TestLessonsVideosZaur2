package Lesson2_Comparation;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//@Test
public class Test2 {
    public static void main(String[] args) {
        List<Employee2> list = new ArrayList<>();
        Employee2 emp1 = new Employee2(102, "Mariya", "Zimermann", 1550);
        Employee2 emp2 = new Employee2(35, "Dmytro", "Tsimokh", 25300);
        Employee2 emp3 = new Employee2(55, "Dmytro", "Petrenko", 13600);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting: " + "\n" + list);
        Collections.sort(list);
        System.out.println("After  sorting: " + "\n" + list);
    }
}

class Employee2 implements Comparable<Employee2> {

    Integer id;
    String name;
    String surname;
    int salary;

    public Employee2(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee:{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                "}";
    }

    @Override
    public int compareTo(Employee2 anotherEmp) {
//        if (this.id == anotherEmp.id) {
//            return 0;
//        } else if (this.id < anotherEmp.id) {
//            return -1;
//        } else {
//            return 1;
//        }
//
//        return this.id - anotherEmp.id;
//        return this.id.compareTo(anotherEmp.id);
//     return this.name.compareTo(anotherEmp.name);
        int res = this.name.compareTo(anotherEmp.name);
        if (res == 0) {
            res = this.surname.compareTo(anotherEmp.surname);
        }
        return res;
    }
}