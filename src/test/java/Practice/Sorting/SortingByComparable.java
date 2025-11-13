package Practice.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingByComparable {
    private static final String GREEN_COLOR_TEXT = "\u001B[32m";
    private static final String DEFAULT_COLOR_TEXT = "\u001B[0m";

    public static void main(String[] args) {
        Car2 c1 = new Car2("Mercedes", "GL250", "green", 300, 550);
        Car2 c2 = new Car2("Tesla", "Model Y", "white", 220, 600);
        Car2 c3 = new Car2("BMW", "720", "grey", 310, 470);
        Car2 c6 = new Car2("BMW", "520", "blue", 310, 450);
        Car2 c7 = new Car2("Honda", "E-type", "white", 310, 450);
        Car2 c4 = new Car2("Tesla", "Vodel 3", "black", 250, 700);
        Car2 c5 = new Car2("Skoda", "Superb", "yellow", 200, 340);
        List<Car2> cars = new ArrayList<>();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);
        cars.add(c6);
        cars.add(c7);
        System.out.println(GREEN_COLOR_TEXT + "The origin list of cars:\n" + DEFAULT_COLOR_TEXT + cars);
        Collections.sort(cars);
        Collections.reverse(cars);
        System.out.println(GREEN_COLOR_TEXT + "Sorted list of cars:\n" + DEFAULT_COLOR_TEXT + cars);

    }
}

class Car2 implements Comparable<Car2> {
    private String brand;
    private String model;
    private String color;
    private int maxSpeed;
    private int power;

    public Car2(String brand, String model, String color, int maxSpeed, int power) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.power = power;
    }


    @Override
    public String toString() {
        return "Car2{" +
                "maxSpeed=" + maxSpeed +
                ", engine=" + power +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car2 anotherCar) {
        int result = this.maxSpeed - anotherCar.maxSpeed;
        if (result == 0) {
            result = this.power - anotherCar.power;
            if (result == 0) {
                result = this.brand.compareTo(anotherCar.brand);
            }
        }
        return result;
    }
}
