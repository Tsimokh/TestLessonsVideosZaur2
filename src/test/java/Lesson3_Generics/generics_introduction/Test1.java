package Lesson3_Generics.generics_introduction;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
@Test
public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
//        list.add(new StringBuilder("1234"));
//        list.add(2);
//        list.add(new A());
        list.add("How are you?");
        list.add("Fine and you?");
        list.add("I am fine too");
//        list.add(new A());
        for (Object o:list){
            System.out.println("Lenght of the " + o + ": " + ((String)o).length());
        }
    }
}
class A{}
