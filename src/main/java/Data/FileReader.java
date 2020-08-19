package Data;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class FileReader {

    public void fileReader(String pathName) throws IOException {
        File txt = new File(pathName);

        try (Stream<String> linesStream = Files.lines(txt.toPath())) {
            linesStream.forEach(System.out::println);
        }
    }


}