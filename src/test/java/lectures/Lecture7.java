package lectures;


import static org.assertj.core.api.Assertions.assertThat;

import beans.Car;
import com.google.common.collect.ImmutableList;

import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import mockdata.MockData;
import org.junit.Test;

public class Lecture7 {

    @Test
    public void count() throws Exception {
        long numberOfFemales = MockData.getPeople()
                .stream()
                .filter(person -> person.getGender().equalsIgnoreCase("female"))
                .count();
        System.out.println(numberOfFemales);
    }

    @Test
    public void min() throws Exception {
        double minCar = MockData.getCars()
                .stream()
                .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
                .mapToDouble(Car::getPrice)// .mapToDouble(car -> car.getPrice())
                .min()
                .orElse(0);
        System.out.println(minCar);
    }

    @Test
    public void max() throws Exception {
        double maxCar = MockData.getCars()
                .stream()
                .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
                .mapToDouble(Car::getPrice)// .mapToDouble(car -> car.getPrice())
                .max()
                .orElse(0);
        System.out.println(maxCar);
    }


    @Test
    public void average() throws Exception {
        List<Car> cars = MockData.getCars();
        cars.stream()
                .mapToDouble(Car::getPrice)
                .average()
                .orElse(0);
        System.out.println(cars);
    }

    @Test
    public void sum() throws Exception {
        List<Car> cars = MockData.getCars();
        double sum = cars.stream()
                .mapToDouble(Car::getPrice)
                .sum();
        BigDecimal bigDecimalSum = BigDecimal.valueOf(sum);
        System.out.println(sum);
        System.out.println(bigDecimalSum);

    }

    @Test
    public void statistics() throws Exception {
        List<Car> cars = MockData.getCars();
        DoubleSummaryStatistics doubleSummaryStatistics = cars
                .stream()
                .mapToDouble(Car::getPrice)
                .summaryStatistics();
        System.out.println(doubleSummaryStatistics.getMax());
        System.out.println(doubleSummaryStatistics.getMin());
        System.out.println(doubleSummaryStatistics.getAverage());
        System.out.println(doubleSummaryStatistics.getCount());
        System.out.println(doubleSummaryStatistics.getSum());
    }

}