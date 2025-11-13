package Practice;

public class Cat extends Animal {
    void eat() {
        System.out.println("Cat is eating");
    }
    Animal an = getAnimal();

    @Override
    void print() {
        super.print();
    }
}

interface Speakable{

   static final String s  = "";
  void def();
   private static void abc(){
       System.out.println("www");
   }
      private  void qqq(){
        System.out.println("www");
    }
}
