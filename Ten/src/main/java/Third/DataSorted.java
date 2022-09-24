package Third;

import java.util.Map;
import java.util.TreeMap;

public class DataSorted {
    public static void print(TreeMap<Integer, String> arrayCountWords) {
        for (Map.Entry<Integer, String> entry : arrayCountWords.descendingMap().entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}
