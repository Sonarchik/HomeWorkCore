package Fifth;

import java.util.Iterator;
import java.util.stream.Stream;

public class Mixing {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iFirst = first.iterator();
        Iterator<T> iSecond = second.iterator();
        Stream<T> resultStream = Stream.empty();

        while (iFirst.hasNext() && iSecond.hasNext()) {
            resultStream = Stream.concat(resultStream, Stream.of(iFirst.next(), iSecond.next()));
        }
        return resultStream;
    }
}
