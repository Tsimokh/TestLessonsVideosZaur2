package Practice.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

class SortingByLoopTest {
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

        // Bubble sort за прізвищем
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                String surname1 = array[j].getSurname();
                String surname2 = array[j + 1].getSurname();
                if (surname1.compareTo(surname2) > 0) {
                    Student temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println(GREEN_COLOR + "After sorting:" + DEFAULT_COLOR);
        Student.printStudents(array);
    }
}

