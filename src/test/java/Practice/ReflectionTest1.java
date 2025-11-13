package Practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReflectionTest1 {
    public static void main(String[] args) throws NoSuchMethodException {
        Class classString = String.class;

        System.out.println(Arrays.toString(classString.getConstructors()));
        System.out.println(Arrays.toString(classString.getClasses()));
        System.out.println(Arrays.toString(new Constructor[]{classString.getDeclaredConstructor()}));
        Field[] f = classString.getDeclaredFields();
        System.out.println(Arrays.toString(f));


    }

}
