package Lesson5_NestedClasses.inner_class;

public class Car {
    String color;
    int dorCount;
    Engine engine;

    public Car(String color, int dorCount, int horsePower) {
        this.color = color;
        this.dorCount = dorCount;
        this.engine = this.new Engine(230);
    }
//    public void abc(){
//        System.out.println(Lesson5_NestedClasses.static_nested_class.Car.Engine.countObjects);
//        Lesson5_NestedClasses.static_nested_class.Car.Engine engine = new Lesson5_NestedClasses.static_nested_class.Car.Engine(120);
//        System.out.println(engine.horsePower);
//    }

    @Override
    public String toString() {
        return "my car: " +
                "{color = '" + color + '\'' +
                ", dorCount = " + dorCount +
                ", engine = " + engine + '}';
    }

    public class Engine {
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "my car engine: " +
                    "{horsePower = " + horsePower + '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car myCar = new Car("black", 4, 300);
        System.out.println(myCar.engine);
        System.out.println(myCar);
    }
}
