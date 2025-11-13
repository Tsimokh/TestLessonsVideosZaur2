package Lesson7_Srteams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    static float start;
    static float end;
    static float timeResult;

    public static void main(String[] args) {

//        int [] array = {1,2,3,4,5};
//        Arrays.stream(array).forEach(System.out::println);
//        System.out.println("---------------");
//
//        List<Double> list = List.of(1.2, 2.5, 9.3, 145.9, 5.456);
        List<Double> list = List.of(10.0, 5.0, 1.0, 0.25);
        list.stream().forEach(System.out::println);
        System.out.println("---------------");

//////        long contElements = list.stream().count();
////
//////        Double sumResult1 = list.stream().reduce((accumulator, element) -> accumulator + element).get()/contElements;
//////        System.out.println("sumResult = " + sumResult1);
//////
//////        Double sumResult2 = list.stream().mapToDouble(x->x.doubleValue()).average().getAsDouble();
//////        System.out.println("sumResult = " + sumResult2);
////
////        Double sumResult = list.parallelStream().reduce((accumulator, element) -> accumulator + element).get();
////        System.out.println("sumResult = " + sumResult);
//
//        Double sumResult = list.parallelStream().reduce((accumulator, element) -> accumulator + element).get();
//        System.out.println("sumResult = " + sumResult);

        Double resultDivision1 = list.stream().reduce((accumulator, element)->accumulator/element).get();
        System.out.println("divisionResultSequentialStreams = " + resultDivision1);

        Double resultDivision2 = list.parallelStream().reduce((accumulator, element)->accumulator/element).get();
        System.out.println("divisionResultParallelStream = " + resultDivision2);

//
//        List<Integer> list = List.of(1, 2, 3, 4, 5);
//        list.parallelStream().forEach(System.out::println);
//        System.out.println("---------------");
//        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
//        stream.parallel();


//        start = System.nanoTime();
//        List<Double> list = new ArrayList<>(100_000_000);
//        for (int i = 1; i <= 100_000_000; i++) {
//            list.add(i*0.6);
//        }
//        end = System.nanoTime();
//        timeResult = end -start;
//        System.out.println("Work time adding elements to ArrayList : " + timeResult/1000000000 + " seconds");
//        System.out.println("------------------------------------------------");
//
//        start = System.nanoTime();
//        double methodResult = list.stream().reduce(0.0,(accumulator, element)->accumulator+element);
//        System.out.println("Result of sequential stream: " + methodResult);
//        end = System.nanoTime();
//        timeResult = end -start;
//        System.out.println("Work time method by sequential stream: " + timeResult/1000000000 + " seconds");
//        System.out.println("------------------------------------------------");
//
//        start = System.nanoTime();
//        double methodParallelResult = list.parallelStream().reduce(0.0,(accumulator, element)->accumulator+element);
//        System.out.println("Result of parallel stream: " + methodParallelResult);
//        end = System.nanoTime();
//        timeResult = end -start;
//        System.out.println("Work time method by parallel stream: " + timeResult/1000000000 + " seconds");
    }
}
