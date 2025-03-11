package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("Yellow", 1999), new Car("Blue", 2010), new Car("Black", 2000));

    public static void main(String[] args) {
//        List<Car> filterCar = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("Black");
//            }
//        });

        List<Car> filterCarColor = filter(cars, car -> car.getColor().equals("Black"));
        List<Car> filterCarYear = filter(cars, car -> car.getYear() < 2020);
        System.out.println(filterCarColor);
        System.out.println(filterCarYear);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }
}


