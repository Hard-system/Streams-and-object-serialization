package lectures;

import static org.assertj.core.api.Assertions.assertThat;

import beans.Person;

import com.google.common.collect.ImmutableList;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;


public class Lecture1 {

    @Test
    public void imperativeApproach() throws IOException {
        List<Person> people = MockData.getPeople();
        // 1. Find people aged less or equal 18
        // 2. Then change implementation to find first 10 people
        List<Person> youngPeople = Lists.newArrayList();
        int peopleCounter = 0;
        for (Person p : people) {
            if (p.getAge() <= 18) {
                if (peopleCounter <= 9) {
                    youngPeople.add(p);
                    peopleCounter++;
                }
            }
        }
        for (Person young : youngPeople) {
            System.out.println(young);
        }
    }

    @Test
    public void declarativeApproachUsingStreams() throws Exception {
        List<Person> people = MockData.getPeople();

        List<Person> youngPeople = people
                .stream().filter(p -> p.getAge() <= 18).limit(10).collect(Collectors.toList());
        youngPeople.forEach(System.out::println);
    }
}
