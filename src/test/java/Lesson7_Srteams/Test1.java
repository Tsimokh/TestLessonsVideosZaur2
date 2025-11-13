package Lesson7_Srteams;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("How are you?");
        list1.add("I am ok");
        list1.add("Bye-bye");
        list1.add("Hello");

        System.out.println(list1);
//        for (int i =0; i < list1.size(); i++){
//            list1.set(i, String.valueOf(list1.get(i).length()));
//        }


        List<Integer> list2 = list1.stream().map(element -> element.length()).collect(Collectors.toList());
////
////        List<Integer> list2 = list1.stream().map(new Function<String, Integer>() {
////           @Override
////          public Integer apply(String s){
////              return s.length();
////            }
////        }).collect(Collectors.toList());
        System.out.println(list2);


////        List<String> list3 = list1.stream().filter(x -> x.length() > 5).collect(Collectors.toList());
//
//        List<String> list3 = list1.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                if (s.length() > 5) {
//                    return true;
//                } else
//                    return false;
//            }
//        }).collect(Collectors.toList());
//        System.out.println(list3);

////        List<String> list4 = list1.stream().filter(x-> x.startsWith("I")).collect(Collectors.toList());
//
//        List<String> list4 = list1.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                if (s.startsWith("I")) {
//                    return true;
//                } else
//                    return false;
//            }
//        }).collect(Collectors.toList());
//        System.out.println(list4);

        List<String> list5 = list1.stream().filter(x-> x.contains(" ")).collect(Collectors.toList());
//
//
//        List<String> list5 = list1.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                if (s.contains(" ")) {
//                    return true;
//                } else
//                    return false;
//            }
//        }).collect(Collectors.toList());
        System.out.println(list5);

//        List<String> list6 = list1.stream().distinct().collect(Collectors.toList());
//        System.out.println(list6);
//
//        List<String> list7 = list1.stream().sorted().collect(Collectors.toList());
//        System.out.println(list7);

        List<String> list8 = list1.stream().sorted((x,y)->y.length()-x.length()).collect(Collectors.toList());

//        List<String> list8 = list1.stream().sorted(new Comparator<String>() {
//            @Override
//            public int compare(String st1, String st2) {
//                int compare = 0;
//                if (st1.length() < st2.length()) {
//                    compare = -1;
//                } else if (st1.length() > st2.length()) {
//                    compare = 1;
//                }
//                return compare;
//            }
//        }).collect(Collectors.toList()).reversed();
        System.out.println(list8);

//        List<String> list9 = list1.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList());
//        System.out.println(list9);

//        System.out.println(list1.reversed());

//        int arr1[] = {1, 4, 2, 4, 9, 5, 3, 9,};
//        System.out.println(Arrays.toString(arr1));
//        List<Integer> list11 = Arrays.stream(arr1).boxed().collect(Collectors.toList()).reversed();
//        list11.stream().sorted();
//        System.out.println(list11);

//        int arr2[] = new int[8];
//        for (int i = arr1.length-1, j = 0; j < arr2.length; i--, j++) {
//            arr2[j]=arr1[i];
//        }
//
////        Arrays.stream(arr2).sorted();
//
////        List<Integer> listI = Arrays.stream(arr1).boxed().collect(Collectors.toList());
////        Collections.reverse(listI);
////        int arr2[] = listI.stream().mapToInt(Integer::intValue).toArray();
//
//        System.out.println(Arrays.toString(arr2));


//        Arrays.stream(arr2).boxed().collect(Collectors.toList()).reversed().stream().mapToInt(Integer::intValue);

//        String s = "Aloola";
//
//        List<Character> listCHar1 = s.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.toList());
//        List<Character> listCHar2 = new ArrayList<>();
//        listCHar2=listCHar1.reversed();
//        System.out.println(listCHar1.equals(listCHar2));
//        System.out.println(listCHar1);
//        System.out.println(listCHar2);


//        String[] arr1 = {"Hello", "How are you?", "I am ok", "Bye-bye", "Hello"};
//        System.out.println(Arrays.toString(Arrays.stream(arr1).map(el -> el.toUpperCase()).toArray()));
//        System.out.println(Arrays.toString(Arrays.stream(arr1).map(el -> el.length()).toArray()));
//        Arrays.sort(arr1);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(Arrays.stream(arr1).sorted().toArray()));
//          System.out.println(Arrays.toString(Arrays.stream(arr1).sorted((x,y)->y.length()-x.length()).toArray()));


        int[] arr = {5, 9, 3, 8, 1};
        System.out.println("----------------------");
        System.out.println(Arrays.toString(arr));
        arr = Arrays.stream(arr).map(el -> {
            if (el % 3 == 0) {
                el = el / 3;
            }
            return el;
        }).toArray();
        System.out.println(Arrays.toString(arr));


        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("How are you?");
        set.add("I am ok");
        set.add("Bye-bye");
        set.add("Hello");
        System.out.println("----------------------");
        System.out.println(set);
        Set<Integer> setInteger = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        System.out.println(setInteger);

        List<Integer> listInteger = set.stream().map(String::length).collect(Collectors.toList());
        System.out.println(listInteger);

        LinkedList<Integer> linkedListInteger = set.stream().map(String::length).collect(Collectors.toCollection(LinkedList::new));
        System.out.println(linkedListInteger);

        Integer[] arrayInteger = set.stream().map(e -> e.length()).toArray(Integer[]::new);
        System.out.println(Arrays.toString(arrayInteger));
    }
}