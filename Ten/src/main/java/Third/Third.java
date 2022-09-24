package Third;

import java.util.ArrayList;
import java.util.TreeMap;

public class Third {
    public static void main(String[] args) {
        String readFile = "words.txt";
        ArrayList<String> textArray = ReadWords.readFile(readFile);
        System.out.println(textArray);
        TreeMap<Integer, String> arrayCountWords = Counter.count(textArray);
        System.out.println(arrayCountWords);
        DataSorted.print(arrayCountWords);
    }
}
