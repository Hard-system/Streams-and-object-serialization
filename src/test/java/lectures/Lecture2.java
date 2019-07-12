package lectures;

import beans.Person;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import mockdata.MockData;
import org.junit.Test;

public class Lecture2 {

  @Test
  public void range() throws Exception {
    System.out.println("---------For Loop---------");
    for (int i = 0; i <= 10; i++) {
      System.out.println(i);
    }
    System.out.println("---------Exclusive the last---------");
    IntStream.range(0,10)
            .forEach(index -> System.out.println(index));
    System.out.println("---------Inclusive the last---------");
    IntStream.rangeClosed(0,10).forEach(System.out::println);
  }

  @Test
  public void rangeIteratingLists() throws Exception {
    List<Person> people = MockData.getPeople();
    IntStream.range(0, people.size())
            .forEach(index-> {
              Person people1 = people.get(index);
              System.out.println(people1);
            });

    //people.forEach(System.out::println); this is the same but we dont have the index
  }

  @Test
  public void intStreamIterate() throws Exception {
    //get the even numbers until 20 and print each of them
      IntStream.iterate(0, operand -> operand + 1)
          .filter(number -> number % 2 == 0)
          .limit(20)
          .forEach(System.out::println);
  }
}
