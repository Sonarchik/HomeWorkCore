package Third;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Sorted {
    public static ArrayList<Integer> sort(String[] string) {
        return Arrays.stream(string)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .map(Integer::valueOf)
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));
    }
}

