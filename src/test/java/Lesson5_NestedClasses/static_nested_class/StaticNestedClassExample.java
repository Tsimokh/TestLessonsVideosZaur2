package Lesson5_NestedClasses.static_nested_class;

public class StaticNestedClassExample {
    public static final class NClass {};

    public static interface NInterface {};
}

interface Nestedable {
    static interface NInterface {};


    public static class NClass {};
}

