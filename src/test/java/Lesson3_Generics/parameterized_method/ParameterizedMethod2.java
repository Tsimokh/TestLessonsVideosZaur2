package Lesson3_Generics.parameterized_method;

import java.util.ArrayList;

public class ParameterizedMethod2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(10);
        arrayList1.add(20);
        arrayList1.add(5);
        GenMethod2 g1 = new GenMethod2();
        System.out.println(g1.getSecondElement(arrayList1));

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("abc");
        arrayList2.add("def");
        arrayList2.add("ghi");
        GenMethod2 g2 = new GenMethod2();
        System.out.println(g2.getSecondElement(arrayList2));

//        System.out.println(new GenMethod().getSecondElement(arrayList3));
    }
}

class GenMethod2<T>{

    public T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}
