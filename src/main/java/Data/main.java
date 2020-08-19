package Data;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        String path = "FileToRead/text1.txt";

        FileReader x = new FileReader();

//        x.fileReader(path);

        TextStorage y = new TextStorage();

        y.textStorage(path);
        System.out.println(y.toString());
    }
}
