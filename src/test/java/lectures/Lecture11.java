package lectures;


import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.stream.Collectors;

import com.sun.deploy.util.StringUtils;
import org.junit.Test;

public class Lecture11 {

    @Test
    public void joiningStrings() throws Exception {
        List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");
        String result = StringUtils.join(names, ", ");
        System.out.println(result);
    }

    @Test
    public void joiningStringsWithStream() throws Exception {
        List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");
        String collect = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
        System.out.println(collect);
    }
}
