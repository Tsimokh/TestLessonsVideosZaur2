package Lesson3_Generics.type_erasure;

public class ParameterizedClass3 {
    public static void main(String[] args) {
    }

//    public void abc(Info3<String> info) {
//        String s = info.getValue();
//    }
//
//    public void abc(Info3<Integer> info) {
//        int i = info.getValue();
//    }
//   // public void abc(Info3 info)
}


class Info3<T> {
    private T value;

    public Info3(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return this.value;
    }
}

class Parent{
    public void abc(Info3<String> info) {
        String s = info.getValue();
    }
}

//class Child extends Parent{
//    public void abc(Info3<Integer> info) {
//        int i = info.getValue();
//    }
//}

