package Lesson2_Comparation;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
@Test
public class Test4 {
    public static void main(String[] args) {
        List<Employee4> list = new ArrayList<>();
        Employee4 emp1 = new Employee4(102, "Mariya", "Zimermann", 1550);
        Employee4 emp2 = new Employee4(35, "Dmytro", "Tsimokh", 25300);
        Employee4 emp3 = new Employee4(55, "Dmytro", "Petrenko", 13600);
        Employee4 emp4 = new Employee4(23, "Nadia", "Petrenko", 12340);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        System.out.println("Before sorting: " + "\n" + list);

        Collections.sort(list);
        System.out.println("After  sorting by id:" + "\n" + list);

        Collections.sort(list, new NameEmployee4Comparator());
        System.out.println("After  sorting by name:" + "\n" + list);

        Collections.sort(list, new SalaryEmployee4Comparator());
        System.out.println("After  sorting by salary:" + "\n" + list);


//        list.sort(new Comparator<Employee3>() {
//            @Override
//            public int compare(Employee3 e1, Employee3 e2) {
//                int result = 0;
//                result = e1.surname.compareTo(e2.surname);
//                if (result==0){
//                    result=e1.name.compareTo(e2.name);
//                }
//                return result;
//            }
//        });

        Collections.sort(list, (e1, e2) -> {
            int result = 0;
            result = e1.surname.compareTo(e2.surname);
            if (result == 0) {
                result = e1.name.compareTo(e2.name);
            }
            return result;
        });
        System.out.println("After  sorting by surname and name:" + "\n" + list);
    }
}

class Employee4 implements Comparable<Employee4> {

    Integer id;
    String name;
    String surname;
    int salary;

    public Employee4(int id, String name, String surname, int salary) {
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
    public int compareTo(Employee4 emp2) {
        if (this.id > emp2.id) {
            return 1;
        } else if (this.id < emp2.id) {
            return -1;
        }
        return 0;
    }
}


class NameEmployee4Comparator implements Comparator<Employee4> {
    @Override
    public int compare(Employee4 emp1, Employee4 emp2) {
        int result = 0;
        result = emp1.name.compareTo(emp2.name);
        if (result == 0) {
            result = emp1.surname.compareTo(emp2.surname);
        }
        return result;
    }
}

class SalaryEmployee4Comparator implements Comparator<Employee4> {
    @Override
    public int compare(Employee4 emp1, Employee4 emp2) {
        return emp1.salary - emp2.salary;
    }
}


