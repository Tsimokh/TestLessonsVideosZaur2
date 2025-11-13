package Lesson5_NestedClasses;

import java.util.Comparator;

public class NestedClasses {
    static class StaticClass1{};
    static abstract class StaticClass2{};
    static final class StaticClass3{};
    protected class InnerClass{};
     public void abc(){
         class AbcClass{};
     }
     Comparator <String> comparator = new Comparator() {
         @Override
         public int compare(Object o1, Object o2) {
             return 0;
         }
     };
}
