package lectures;


import com.google.common.collect.Lists;

import java.util.Arrays;

import org.junit.Test;

public class Lecture9 {

    @Test
    public void reduce() throws Exception {
        Integer[] integers = {1, 2, 3, 4, 99, 100, 121, 1302, 199};
        Integer reduce = Arrays.stream(integers).reduce(0, (num1, num2) -> num1 + num2);
        System.out.println(reduce);

        Integer reduce1 = Arrays.stream(integers).reduce(0, Integer::sum);

        System.out.println(reduce1); //its doing the same function
    }


}

