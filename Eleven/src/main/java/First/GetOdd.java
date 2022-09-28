package First;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class GetOdd {
    public static String getOddIndex(ArrayList<String> list) {
        final StringBuilder sb = new StringBuilder();
        IntStream.range(0, list.size())
                .filter(index -> index % 2 != 0)
                .forEach(index -> {
                    sb.append(index).append(". ").append(list.get(index));
                    if (index != list.size() - 1) {
                        sb.append(", ");
                    }
                });
        return sb.toString();
    }
}
