package Data;

import java.io.*;
import java.io.FileReader;
import java.util.ArrayList;

public class TextStorage {
    ArrayList<String> text = new ArrayList<String>();

    public void textStorage(String path) throws IOException {
        BufferedReader textToStorage = new BufferedReader(new FileReader(path));

        String line;

        while((line = textToStorage.readLine()) != null)
                text.add(line);
    }

    @Override
    public String toString() {
        return "TextStorage{" +
                "text=" + text +
                '}';
    }
}

