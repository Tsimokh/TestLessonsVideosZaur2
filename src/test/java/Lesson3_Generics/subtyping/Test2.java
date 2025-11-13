package Lesson3_Generics.subtyping;

public class Test2 {
    public static void main(String[] args) {
        X x = new Y();
//        List<X> list = new ArrayList<Y>();
//        List<X> list = new ArrayList<X>();
//        List<X> list = new ArrayList<>();
//        List<Number> list = new ArrayList<Integer>();
//        list.add(12);
//        list.add(3.14);

    }
}

class X {
}

class Y extends X {
}

