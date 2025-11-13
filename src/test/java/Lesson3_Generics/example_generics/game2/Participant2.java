package Lesson3_Generics.example_generics.game2;

public abstract class Participant2 {
    private String name;
    private int age;

    public Participant2(String name, int age) {
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
