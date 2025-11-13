package Lesson5_NestedClasses.inner_class;

public class Car2 {
    String color;
    int dorCount;
    Engine engine;

    public Car2(String color, int dorCount) {
        this.color = color;
        this.dorCount = dorCount;
//        Engine eng = new Engine(300);
//        System.out.println(eng.horsePower);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "my car: " +
                "{color = '" + color + '\'' +
                ", dorCount = " + dorCount +
                ", engine = " + engine + '}';
    }

    public class Engine {
        private int horsePower;
        public final static int A = 5;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            System.out.println(A);
        }

        @Override
        public String toString() {
            return "my car engine: " +
                    "{horsePower = " + horsePower + '}';
        }
    }
}

class Test2 {
    public static void main(String[] args) {
        Car2 myCar = new Car2("black", 4);
        Car2.Engine myEngine = myCar.new Engine(300);
//        Car2.Engine myEngine2 = new myCar.Engine(300);
//        Car2.Engine myEngine2 = new Car2.Engine(300);
//        Car2.Engine myCar = new Car2("black", 4).new Engine(300);

//        System.out.println(myCar.engine = myEngine);
        myCar.setEngine(myEngine);
        System.out.println(myEngine);
        System.out.println(myCar);
    }
}
