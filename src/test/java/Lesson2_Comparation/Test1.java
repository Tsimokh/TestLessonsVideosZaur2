package Lesson2_Comparation;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//@Test
public class Test1 {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Mark");
        list1.add("Jessica");
        list1.add("Dmytro");
        System.out.println("Before sort: " + "\n" + list1);
        Collections.sort(list1);
        System.out.println("After sort: " + "\n" + list1);
    }
}
