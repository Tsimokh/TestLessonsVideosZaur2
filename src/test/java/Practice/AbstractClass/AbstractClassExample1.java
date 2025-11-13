package Practice.AbstractClass;

public abstract class AbstractClassExample1 {

    abstract void makeSound();

    void sleep() {
        System.out.println("Sleeping...");
    }

    void sleep2() {
        System.out.println("Sleeping2...");
    }
}

class Main {

    public static void main(String[] args) {
        AbstractClassExample1 ex1 = new AbstractClassExample1() {
            @Override
            void makeSound() {
                System.out.println("Hello...");
            }
        };
        ex1.sleep();
        ex1.sleep2();
    }
}
