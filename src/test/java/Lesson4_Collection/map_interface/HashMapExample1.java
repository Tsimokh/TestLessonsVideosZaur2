package Lesson4_Collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<Integer,String> hashMap1 = new HashMap<>();
        hashMap1.put(1341234, "Tsukerberg Mark");
        hashMap1.put(1690234, "Ibragimovich Zlatan");
        hashMap1.put(9961234, "Walsh Emeli");
        hashMap1.put(1262334, "Kutcher Emma");
        hashMap1.put(1631234, "Zimmermann Mark");
        hashMap1.put(1991234, "Sheringem Teddy");
        hashMap1.put(1232334, "Walsh Emeli");
//        System.out.println(hashMap1);
//        hashMap1.putIfAbsent(1341234, "Tucker Cris");
////        hashMap1.put(null, "Walsh Emeli");
//        hashMap1.put(1341234, null);
//        System.out.println(hashMap1);
//        System.out.println(hashMap1.get(1341234));
//        System.out.println(hashMap1.get(34));
//        hashMap1.remove(1690234);
//        hashMap1.remove(164);
//        System.out.println(hashMap1);
//        System.out.println(hashMap1.containsValue("Sheringem Teddy"));
//        System.out.println(hashMap1.containsValue("Sheringem Te"));

//        System.out.println(hashMap1.containsKey(16));
//        System.out.println(hashMap1.containsKey(1631234));

//        System.out.println(hashMap1.keySet());
        System.out.println(hashMap1.values());
        Map<Integer,String> map = new HashMap<>(16,0.75f);

    }
}
