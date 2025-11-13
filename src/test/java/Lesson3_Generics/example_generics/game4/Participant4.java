package Lesson3_Generics.example_generics.game4;

public abstract class Participant4 {
    private String name;
    private int age;

    public Participant4(String name, int age) {
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
