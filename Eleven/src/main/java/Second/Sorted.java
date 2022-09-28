package Second;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Sorted {
    public static ArrayList<String> sorted(ArrayList<String> list) {
        return (ArrayList<String>) list.stream()
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }
}
