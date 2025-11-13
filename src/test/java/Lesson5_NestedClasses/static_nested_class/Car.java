package Lesson5_NestedClasses.static_nested_class;

public class Car {
    String color;
    int dorCount;
    Engine engine;
    private static int a;

    public Car(String color, int dorCount, Engine engine) {
        this.color = color;
        this.dorCount = dorCount;
        this.engine = engine;
    }
    public void abc(){
        System.out.println(Engine.countObjects);
        Engine engine = new Engine(120);
        System.out.println(engine.horsePower);
    }

    @Override
    public String toString() {
        return "my car: " +
                "{color = '" + color + '\'' +
                ", dorCount = " + dorCount +
                ", engine = " + engine + '}';
    }

    public static class Engine {
        private int horsePower;
        protected static int countObjects;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            System.out.println(a);
//            System.out.println(dorCount);
            countObjects++;
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
        Car.Engine myEngine = new Car.Engine(300);
        System.out.println(Car.Engine.countObjects);
//        Car.Engine myEngine = new Car.Engine(300) {
//            @Override
//            public String toString() {
//                return super.toString();
//            }
//        };
        System.out.println(myEngine);
        Car myCar = new Car("black", 4, myEngine);
        System.out.println(myCar);
    }
}

//class B extends Car.Engine {
//    //    public B(int horsePower) {
////        super(horsePower);
////    }
//    public B() {
//        super(200);
//    }
//};
