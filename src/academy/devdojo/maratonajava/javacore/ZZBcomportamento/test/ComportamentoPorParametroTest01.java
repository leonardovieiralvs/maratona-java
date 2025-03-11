package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("Yellow", 1999), new Car("Blue", 2010), new Car("Black", 2000));

    public static void main(String[] args) {
        System.out.println(filterGreenCard(cars));
        System.out.println(filterCarByColor(cars, "Blue"));
        System.out.println("--------------");
        System.out.println(filterCarAge(cars, 2029));
    }


    private static List<Car> filterGreenCard(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("Yellow")) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String cor) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(cor)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    private static List<Car> filterCarAge(List<Car> cars, int year) {
        List<Car> oldCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                oldCars.add(car);
            }
        }
        return oldCars;
    }
}


