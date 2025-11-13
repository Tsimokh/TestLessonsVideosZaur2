package Practice;

abstract public class Animal {
    abstract void eat();
    void print(){
        System.out.println("Hello");
    }

    Animal getAnimal(){
        return this;
    }
}
