package Lesson3_Generics.example_generics.game3;

public abstract class Participant3 {
    private String name;
    private int age;

    public Participant3(String name, int age) {
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
