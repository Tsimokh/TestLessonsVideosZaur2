package Lesson3_Generics.example_generics.game1;

public abstract class Participant1 {
    private String name;
    private int age;

    public Participant1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
