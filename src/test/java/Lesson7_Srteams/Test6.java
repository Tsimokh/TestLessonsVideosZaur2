package Lesson7_Srteams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test6 {
    public static void main(String[] args) {
//        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,1,2,3);
//        stream1.filter(x->{
//            System.out.println("!!!");
//            return x%2==0;
//        }).collect(Collectors.toList());

        Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6);
        Stream<Integer> stream3 = Stream.of(3,4,5,6,7,8,9,10);
//        Stream<Integer> stream4 = Stream.concat(stream2,stream3);
//        stream4.forEach(System.out::println);
//        List<Integer> list = stream4.collect(Collectors.toList());
//        System.out.println(list);

//        Stream<Integer> stream5 = Stream.concat(stream2,stream3);
//        stream5.forEach(System.out::println);

//        List<Integer> list6 = Stream.concat(stream2,stream3).collect(Collectors.toList());
//        list6.forEach(System.out::println);

//        list6.stream().distinct().forEach(System.out::println);

        Stream<Integer> stream6 = Stream.of(7,1,8,3,9,5,5,5,6,6,7,7,8,4,9,2,1);
////        stream6.distinct().forEach(System.out::println);
////        long l = stream6.count();
////        System.out.println(l);
////        System.out.println(stream6.count());
//        System.out.println(stream6.distinct().count());

        System.out.println(stream6.distinct().peek(System.out::println).count());
    }
}
