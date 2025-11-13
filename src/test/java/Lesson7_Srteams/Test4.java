package Lesson7_Srteams;

import java.util.ArrayList;
import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {

////        Stream<Integer> streamInteger = Stream.of(5,8,2,4,3);
////        List<Integer> list = new ArrayList<>(Stream.of(5,8,2,4,3).collect(Collectors.toList()));
////        list=streamInteger.collect(Collectors.toList());
//        List<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.add(8);
//        list.add(2);
//        list.add(4);
//        list.add(3);
//        System.out.println(list);
////        int result = list.stream().reduce((accumulator, element) -> {System.out.println(accumulator);
////            return accumulator * element;}).get();
//        int result = list.stream().reduce((accumulator, element) -> accumulator * element).get();
//        System.out.println(result);

//        List<Integer> list2 = new ArrayList<>();
//        int result2 = list2.stream().reduce((accumulator, element) -> accumulator * element).get();
//        System.out.println(result2);
//        Optional<Integer> optional = list2.stream().reduce((accumulator, element) -> accumulator * element);
//        if (optional.isPresent()) {
//            System.out.println(optional.get());
//        } else {
//            System.out.println("Value of the element not present");
//        }

//        int result = list.stream().reduce(1,(accumulator,element)->{
//            System.out.println(accumulator);return accumulator*element;});
//        System.out.println(result);



//        List<String> list3 = new ArrayList<>();
//        list3.add("Hello");
//        list3.add("How are you?");
//        list3.add("I am ok");
//        list3.add("Bye-bye");
//        list3.add("Hello");
//
//        String resultConcat = list3.stream().reduce((x,y)->x+"_"+y).get();
//        System.out.println(resultConcat);

        String[] arrayString = {"Hello","How are you?","I am ok","Bye-bye","Hello"};
        String result = Arrays.stream(arrayString).reduce((a,e)->a+"_"+e).get();
        System.out.println(result);
    }
}
