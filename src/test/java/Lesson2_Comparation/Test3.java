package Lesson2_Comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<Employee3> list = new ArrayList<>();
        Employee3 emp1 = new Employee3(102, "Mariya", "Zimermann", 1550);
        Employee3 emp2 = new Employee3(35, "Dmytro", "Tsimokh", 25300);
        Employee3 emp3 = new Employee3(55, "Dmytro", "Petrenko", 13600);
        Employee3 emp4 = new Employee3(23, "Nadia", "Petrenko", 12340);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        System.out.println("Before sorting: " + "\n" + list);

        list.sort(new IdEmployee3Comparator());
        System.out.println("After  sorting by id:" + "\n" + list);

        Collections.sort(list, new NameEmployee3Comparator());
        System.out.println("After  sorting by name:" + "\n" + list);

        Collections.sort(list, new SalaryEmployee3Comparator());
        System.out.println("After  sorting by salary:" + "\n" + list);

        Collections.sort(list, new SurnameEmployee3Comparator());
        System.out.println("After  sorting by surname:" + "\n" + list);

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

        Collections.sort(list, (e1,e2)->{int result=0; result = e1.surname.compareTo(e2.surname); if (result==0)
        {result=e1.name.compareTo(e2.name);}return result;});
        System.out.println("After  sorting by surname and name:" + "\n" + list);
    }
}

class Employee3 {

    Integer id;
    String name;
    String surname;
    int salary;

    public Employee3(int id, String name, String surname, int salary) {
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
}

//    @Override
//    public int compare(Employee3 emp1, Employee3 emp2) {
//        return emp1.name.compareTo(emp2.name);
//    }
//}


class IdEmployee3Comparator implements Comparator<Employee3> {
    @Override
    public int compare(Employee3 emp1, Employee3 emp2) {
        if (emp1.id == emp2.id) {
            return 0;
        } else if (emp1.id < emp2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

class NameEmployee3Comparator implements Comparator<Employee3> {
    @Override
    public int compare(Employee3 emp1, Employee3 emp2) {
        int result = 0;
        result=emp1.name.compareTo(emp2.name);
        if (result ==0){
            result = emp1.surname.compareTo(emp2.surname);
        }
        return result;
    }
}

class SalaryEmployee3Comparator implements Comparator<Employee3> {
    @Override
    public int compare(Employee3 emp1, Employee3 emp2) {
        return emp1.salary - emp2.salary;
    }
}

class SurnameEmployee3Comparator implements Comparator<Employee3> {
    @Override
    public int compare(Employee3 emp1, Employee3 emp2) {
        return emp1.surname.compareTo(emp2.surname);
    }
}
