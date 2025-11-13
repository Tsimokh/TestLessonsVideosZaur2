package Lesson3_Generics.parameterized_method;

import java.util.ArrayList;

public class ParameterizedMethod1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        //  ArrayList arrayList1 = new ArrayList();
        int i = arrayList1.get(1);
        // int i =  (Integer) arrayList1.get(1);

        arrayList1.add(10);
        arrayList1.add(20);
        arrayList1.add(5);
        GenMethod1 g1 = new GenMethod1();
        System.out.println(g1.getSecondElement(arrayList1));

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("abc");
        arrayList2.add("def");
        arrayList2.add("ghi");
        GenMethod1 g2 = new GenMethod1();
        System.out.println(g2.getSecondElement(arrayList2));

    }
}

class GenMethod1 {

    public <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
//}
//    public <T> T getSecondElement(ArrayList<T extends Number> al) {
//        return al.get(1);
//    }
//    public <T extends Number & I1&I2> T getSecondElement(ArrayList<T> al) {
//        return al.get(1);
//    }
}

interface I1 {

}

interface I2 {

}


