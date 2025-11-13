package Practice.Sorting;

import java.util.Arrays;
import java.util.stream.Stream;


public class SortingByStreamsTest {
    private static final String GREEN_COLOR = "\u001b[32m";
    private static final String DEFAULT_COLOR = "\u001b[0m";

    public static void main(String[] args) {
        Student st1 = new Student("Hopkings", "Bernard", 35, 5, 7.2, 'm');
        Student st2 = new Student("Besus", "Jack", 27, 3, 8.9, 'm');
        Student st3 = new Student("Hopkings", "Mariya", 23, 4, 8.1, 'f');
        Student st4 = new Student("Jackson", "Mike", 17, 1, 9.3, 'm');
        Student st5 = new Student("Morris", "Angel", 25, 4, 6.9, 'f');
        Student st6 = new Student("Velukiy", "Volodymyr", 35, 2, 8.2, 'm');
        Student st7 = new Student("Lembard", "Sonia", 22, 3, 9.0, 'f');

        Student[] array = {st1, st2, st3, st4, st5, st6, st7};

        System.out.println(GREEN_COLOR + "Before sorting:" + DEFAULT_COLOR);
        Student.printStudents(array);

        array = Arrays.stream(array).sorted((x, y) -> x.getSurname().compareTo(y.getSurname())).toArray(Student[]::new);

        System.out.println(GREEN_COLOR + "After sorting:" + DEFAULT_COLOR);
        Student.printStudents(array);

    }
}
