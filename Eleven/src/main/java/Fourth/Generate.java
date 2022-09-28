package Fourth;

import java.util.stream.Stream;

public class Generate {

    static Stream<Long> gen(long a, int c, int m, int maxSizeGen, long seed) {
        return Stream.iterate(seed, n -> ((a * n + c) % m)).limit(maxSizeGen);
    }
}
