package Fifth;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fifth {
    public static void main(String[] args) {
        var result
                = Mixing.zip(Stream.of(1, 2, 3, 4, 5, 6, 7, 8),
                        Stream.of("Bogdan", "Sasha", "Sergei", "Katia", "Dasha", "Nikola", "Ivan"))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
