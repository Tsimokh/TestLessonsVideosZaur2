package Lesson3_Generics.parameterized_class;

import org.testng.annotations.Test;

@Test
public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String,Short> p1 = new Pair<>("Hello", (short)2);
        Pair<Double,StringBuilder> p2 = new Pair<>(3.13, new StringBuilder("Bye-bye"));
        System.out.println("Value of the pair1: value1 - " + p1.getFirstValue() + "; value2 - " + p1.getSecondValue());
        System.out.println("Value of the pair2: value1 - " + p2.getFirstValue() + "; value2 - " + p2.getSecondValue());

        OtherPair<Short> op1 = new OtherPair<>((short) 1, (short)2);
        OtherPair<Double> op2 = new OtherPair<>(3.13, 2.19);
        System.out.println("Value of the pair1: value1 - " + op1.getFirstValue() + "; value2 - " + op1.getSecondValue());
        System.out.println("Value of the pair2: value1 - " + op2.getFirstValue() + "; value2 - " + op2.getSecondValue());

    }

}
class Pair<V1,V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public V1 getFirstValue(){
        return value1;
    }
    public V2 getSecondValue(){
        return value2;
    }
}
class OtherPair<V>{
    private V value1;
    private V value2;

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public V getFirstValue(){
        return value1;
    }
    public V getSecondValue(){
        return value2;
    }
//    public <V> V abc(V val){
//        return val;
//    }
}