package Lesson4_Collection.list_interface.ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethods4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder sb5 = new StringBuilder("E");

        StringBuilder[] arrSb = {sb1, sb2, sb3, sb4, sb5};

        System.out.println("Array: " + Arrays.toString(arrSb));
//        String s1 = new String("1");
//        String s2 = new String("2");
//        String s3 = new String("3");
//        String s4 = new String("4");
//        String s5 = new String("5");

//        String[] arrS = {s1, s2, s3, s4, s5};
//        System.out.println(Arrays.toString(arrS));
        List<StringBuilder> listSb = Arrays.asList(arrSb);
//        arrSb[0].append("!!!");
//        arrSb[3]= new StringBuilder("123456");
        arrSb[2] = new StringBuilder();
        System.out.println("ArrayList: " + listSb);
    }
}
