package lectures;

import static org.assertj.core.api.Assertions.assertThat;

import com.google.common.collect.ImmutableList;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;

public class Lecture3 {

    @Test
    public void min() throws Exception {
        final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
        Integer minNum = numbers
                .stream()
                .min(Comparator.naturalOrder()) //this is easier way
                //.min((number1, number2) -> number1 > number2 ? 1 : -1) //a bit harder way
                .get();
        assertThat(minNum).isEqualTo(1);
        System.out.println(minNum);
    }

    @Test
    public void max() throws Exception {
        final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
        Integer maxNum = numbers.stream().max(Comparator.naturalOrder())
                .get();
        System.out.println(maxNum);
        assertThat(maxNum).isEqualTo(100);
    }
}
