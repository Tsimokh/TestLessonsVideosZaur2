package Lesson3_Generics.parameterized_class;

import org.testng.annotations.Test;

@Test
public class ParameterizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("Hello");
//        System.out.println(info1);
//        String value1 = info1.getValue();

        Info<Integer> info2 = new Info<>(128);
        System.out.println(info2);
        Integer value2 = info2.getValue();

//        Info<Bus> info3 = new Info<>(new Bus());
//        System.out.println(info3);
//        Bus value3 = info3.getValue();
    }

}

class Info<T extends Number> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return this.value;
    }
}

class Bus {
}