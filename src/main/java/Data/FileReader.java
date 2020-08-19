package Data;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FileReader {

    List<String> bookStorage = new ArrayList<>();

        String pathName;

    public void txtReader(String pathName) throws IOException {
        File txt = new File(pathName);

        try (Stream<String> linesStream = Files.lines(txt.toPath())) {
            linesStream.forEach(System.out::println);
        }
    }


}