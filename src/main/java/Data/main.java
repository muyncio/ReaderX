package Data;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        String path = "FileToRead/text1.txt";

        FileReader x = new FileReader();

        x.txtReader(path);
    }
}
