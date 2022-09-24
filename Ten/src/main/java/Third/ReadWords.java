package Third;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadWords {

    public static ArrayList<String> readFile(String readFile) {
        ArrayList<String> text = new ArrayList<>();
        String[] words;
        try (BufferedReader reader = new BufferedReader(new FileReader(readFile))) {
            String line = reader.readLine();
            while (line != null) {
                words = line.trim().split("\\s+");
                for (String word : words) {
                    text.add(word);
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}
