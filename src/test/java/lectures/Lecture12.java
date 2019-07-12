package lectures;

import beans.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import mockdata.MockData;
import org.junit.Test;

public class Lecture12 {
    @Test
    public void understandingCollect() throws Exception {
        List<String> emails = MockData.getPeople()
                .stream()
                .map(Person::getEmail)
                // .collect(Collectors.toList()); //this is the same as the below code
                .collect(
                        () -> new ArrayList<String>(), //begin with empty array list
                        (list, element) -> list.add(element),
                        (list1, list2) -> list1.addAll(list2)); // here is how the concatenate happens
        //.collect(   // This is the same
        //      ArrayList::new,
        //    ArrayList::add,
        //  ArrayList::addAll);

        emails.forEach(System.out::println);
    }
}
