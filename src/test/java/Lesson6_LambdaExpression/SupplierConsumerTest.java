package Lesson6_LambdaExpression;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierConsumerTest {
    public static ArrayList<Car> create3Cars(Supplier<Car> carsSupplier){
        ArrayList<Car> listCars = new ArrayList<>();
        while (listCars.size()<=3) {
            listCars.add(carsSupplier.get());
        }
        return listCars;
    }

    public static void changeCar(Car car, Consumer<Car> consumerCar){
        consumerCar.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> al = new ArrayList<>();
        al = create3Cars(()->new Car("BMW", "Black", 3.2));
        System.out.println(al);
//        System.out.println(al.get(0)==al.get(1));
//        System.out.println(al.get(0)==al.get(2));
//        System.out.println(al.get(1)==al.get(2));
//        System.out.println(create3Cars(()->new Car("BMW", "Black", 3.2)));
        changeCar(al.get(0),x->{x.model="Mercedes"; x.color="White"; x.engine=4.2;
//            System.out.println("Upgraded car: "+x);
        });
        System.out.println(al);
    }

}
class Car{
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}