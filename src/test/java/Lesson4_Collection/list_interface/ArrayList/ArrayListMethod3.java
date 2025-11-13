package Lesson4_Collection.list_interface.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod3 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("How are you?");
        list1.add("Good bye");
        list1.add("Hello");
//        System.out.println(list1);
//        System.out.println("----------");
        List<String> list2 = new ArrayList<>();
//        List<String> list2 = new SpecialList<>();
        list2.addAll(list1);
//        list2.add("!!!");
//        list2.add("????");
////        list1.addAll(list2);
//        list1.addAll(1, list2);
//        System.out.println(list1);
//        list1.clear();
//        System.out.println(list1);
//        System.out.println(list1.indexOf("How are you?"));
//        System.out.println(list1.lastIndexOf("Hello"));
//        System.out.println(list1.size());
//        System.out.println(list1.isEmpty());
        System.out.println(list1.contains("He"));
        System.out.println(list1.contains("Hello"));

        System.out.println(list1.containsAll(list2));
    }
//    @Override
//    public boolean equals(Object obj) {
//        List<String> aL1 = (ArrayList<String>) this;
//        if (obj == this) return true;
//        if (this.getClass() != obj.getClass())return false;
//        List<String> aL2 = (ArrayList<String>)obj;
//        return (aL2.containsAll(aL1));
//    }

}
// class MyList extends ArrayList<String> {
//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof List<?> otherList) {
//            return this.containsAll(otherList);
//        }
//        return false;
//    }
//}

