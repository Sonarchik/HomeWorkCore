package Third;

import java.util.*;

public class Counter {
    public static TreeMap<Integer, String> count(ArrayList<String> textArray) {
        TreeMap<Integer, String> arrayCountWords = new TreeMap<>();
        int counter = 0;

        while (textArray.size() != 0) {
            String word = textArray.get(0);
            while (textArray.remove(word)) {
                counter++;
            }
            arrayCountWords.put(counter, word);
            counter = 0;
        }
        return arrayCountWords;
    }
}
