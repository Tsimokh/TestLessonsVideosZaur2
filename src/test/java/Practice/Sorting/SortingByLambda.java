package Practice.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class SortingByLambda {
    private static final String GREEN_COLOR_TEXT = "\u001B[32m";
    private static final String DEFAULT_COLOR_TEXT = "\u001B[0m";

    private static void printCar(List<Car1> listCars, Predicate<Car1> predicate) {
        for (Car1 c : listCars) {
            if (predicate.test(c)) {
                System.out.println(c);
            }
        }
    }

    public static void main(String[] args) {
        Car1 c1 = new Car1("Mercedes", "GL250", "green", 300, 550);
        Car1 c2 = new Car1("Tesla", "Model Y", "white", 220, 600);
        Car1 c3 = new Car1("BMW", "720", "grey", 310, 470);
        Car1 c6 = new Car1("BMW", "520", "blue", 310, 450);
        Car1 c7 = new Car1("Honda", "E-type", "white", 310, 450);
        Car1 c4 = new Car1("Tesla", "Vodel 3", "black", 250, 700);
        Car1 c5 = new Car1("Skoda", "Superb", "yellow", 200, 340);
        List<Car1> cars = new ArrayList<>();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);
        cars.add(c6);
        cars.add(c7);
        System.out.println(GREEN_COLOR_TEXT + "The origin list of cars:\n" + DEFAULT_COLOR_TEXT + cars);
//        Comparator<Car1> comparatorCar = Comparator
//                .comparingInt(Car1::getMaxSpeed)
//                .thenComparingInt(Car1::getPower)
//                .thenComparing(Car1::getBrand);
//        Collections.sort(cars,comparatorCar);
//        Collections.reverse(cars);
        System.out.println(GREEN_COLOR_TEXT + "Sorted list of cars:\n" + DEFAULT_COLOR_TEXT + cars);

        System.out.println(GREEN_COLOR_TEXT + "Green cars: "+ DEFAULT_COLOR_TEXT);
        printCar(cars,c->c.getColor()=="green");
        System.out.println(GREEN_COLOR_TEXT + "Car's speed >210 and <300 km/h: "+ DEFAULT_COLOR_TEXT);
        printCar(cars,c->c.getMaxSpeed()>210&&c.getMaxSpeed()<300);

        cars.removeIf(c->c.getBrand()=="BMW");
        System.out.println(GREEN_COLOR_TEXT + "List isn't including BMW: "+ DEFAULT_COLOR_TEXT);
        System.out.println(cars);
//        Collections.sort(cars, Comparator.comparing(c -> c.getColor().equalsIgnoreCase("green")));
//        System.out.println(GREEN_COLOR_TEXT + "Sorted list of green cars:\n" + DEFAULT_COLOR_TEXT + cars);
//        cars.sort((Car1 c)->{return c.getColor().equals("Green");});
    }
}

class Car1 {
    private String brand;
    private String model;
    private String color;
    private int maxSpeed;
    private int power;

    public Car1(String brand, String model, String color, int maxSpeed, int power) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        maxSpeed = maxSpeed;
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getPower() {
        return power;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }



    @Override
    public String toString() {
        return "Car1{" +
                "maxSpeed=" + maxSpeed +
                ", engine=" + power +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
