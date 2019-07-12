package lectures;


import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.google.common.collect.Streams;
import org.junit.Before;
import org.junit.Test;

public class Lecture10 {

    private static final List<ArrayList<String>> arrayListOfNames = Lists.newArrayList(
            Lists.newArrayList("Mariam", "Alex", "Ismail"),
            Lists.newArrayList("John", "Alesha", "Andre"),
            Lists.newArrayList("Susy", "Ali")
    );

    @Before
    public void setUp() {
        System.out.println(arrayListOfNames);
    }

    @Test
    public void withoutFlatMap() throws Exception {
// Output:   [Mariam, Alex, Ismail, John, Alesha, Andre, Susy, Ali]
        List<String> newList = new ArrayList<>();
        for (List<String> listNames : arrayListOfNames) {
            for (String name : listNames) {
                newList.add(name);
            }
        }
        System.out.println(newList);
    }

    @Test
    public void withFlatMap() throws Exception {
//   [Mariam, Alex, Ismail, John, Alesha, Andre, Susy, Ali]
        List<String> collectNames = arrayListOfNames.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(collectNames);
    }

}

