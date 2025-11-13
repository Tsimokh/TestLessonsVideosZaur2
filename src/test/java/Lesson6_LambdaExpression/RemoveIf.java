package Lesson6_LambdaExpression;

import com.google.common.base.Predicate;

import java.util.AbstractList;
import java.util.ArrayList;

public class RemoveIf {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Bye-bye!");
        list.add("Nice to meet you");
        list.add("Have a good day");
        list.add("How are you?");
        System.out.println(list);
//        list.removeIf(t->t.contains("-"));
        Predicate<String> p = t->t.contains("-");
        list.removeIf(p);
        System.out.println(list);
    }
}
