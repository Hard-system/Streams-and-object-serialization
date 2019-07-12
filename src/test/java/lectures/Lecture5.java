package lectures;


import static org.assertj.core.api.Assertions.assertThat;

import beans.Car;
import beans.Person;
import beans.PersonDTO;
import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import mockdata.MockData;
import org.junit.Test;

public class Lecture5 {

    @Test
    public void understandingFilter() throws Exception {
        List<Car> cars = MockData.getCars();
        List<Car> carsFiltered = cars
                .stream()
                .filter(car -> car.getPrice() < 1000)
                .collect(Collectors.toList());
        carsFiltered.forEach(System.out::println);

    }

    @Test
    public void ourFirstMapping() throws Exception {
        // transform from one data type to another
        List<Person> people = MockData.getPeople();
        people.stream().map(person -> {
            PersonDTO peDTO = new PersonDTO(person.getId(), person.getFirstName(), person.getAge());
            return peDTO;
        }).collect(Collectors.toList());
    }

    @Test
    public void averageCarPrice() throws Exception {
        // calculate average of car prices
        List<Car> cars = MockData.getCars();
        Double intAverage = cars.stream()
                .mapToDouble(car -> car.getPrice())
                .average()
                .orElse(0);
        System.out.println(intAverage);
    }

    @Test
    public void test() throws Exception {

    }
}



