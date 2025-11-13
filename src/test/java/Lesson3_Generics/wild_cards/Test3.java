package Lesson3_Generics.wild_cards;


import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
//        List<?> list1 = new ArrayList<Integer>();
////        list1.add("Hello");
////        List<?> list2 = new ArrayList<Integer>();
//        List<Double> listInteger = new ArrayList<>();
//        listInteger.add(2.14);
//        listInteger.add(4.67);
//        listInteger.add(9.324324);
//        showListInfo(listInteger);
//
//        List<String> listString = new ArrayList<>();
//        listString.add("Hello");
//        listString.add("Ok");
//        listString.add("Bye-bye");
//        showListInfo(listString);
//
//        List<Object> listObject = new ArrayList<>();
//        listObject.add("Hello");
//        listObject.add(123);
//        listObject.add("Bye-bye");
//        showListInfo(listObject);

        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(10);
        listInteger.add(20);
        listInteger.add(30);
        System.out.println(summElements(listInteger));

        List<Double> listDouble = new ArrayList<>();
        listDouble.add(10.1);
        listDouble.add(20.2);
        listDouble.add(30.3);
        System.out.println(summElements(listDouble));

        List<Float> listFloat = new ArrayList<>();
        listFloat.add(10.1f);
        listFloat.add(20.2f);
        listFloat.add(30.3f);
        System.out.println(summElements(listFloat));

        List<String> listString = new ArrayList<>();
        listString.add("Hello");
        listString.add("How are you");
        listString.add("Fine");
//        System.out.println(summElements(listString));

    }

    public static void showListInfo(List<?> list) {
        System.out.println("The list has such elements: " + list);
    }
    public static double summElements(List<? extends Number> list){
        double summ = 0;
        for (Number n :list){
            summ += n.doubleValue();
        }
        return summ;

    }
}
