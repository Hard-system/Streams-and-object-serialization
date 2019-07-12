package readcsvfile;

import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ReadCsvFile {
    public static void main(String[] args) throws Exception {

        File file = new File("src/test/resources/aaaa.csv");

        List<String> lines = Files.readAllLines(file.toPath(),
                StandardCharsets.UTF_8);
        lines.stream().map(l -> l.split(",", 2)).
                forEach(r -> {
                            if (r[0].equals("10")) {
                                System.out.println("Hello");
                            }
                        }
                );
    }
}
