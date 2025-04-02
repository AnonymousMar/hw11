package number4;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIterateStream {
    public static void main(String[] args) {

        StreamIterate r = new StreamIterate  (25214903917L, 281474976710656L, 11, 0);

        Stream<Long> iterate =
                Stream.iterate(r.next(), seed -> r.next());

       iterate.limit(10)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
