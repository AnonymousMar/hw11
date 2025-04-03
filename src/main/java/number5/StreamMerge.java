package number5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMerge {
    public static void main(String[] args) {

        Stream<String> streamA = Stream.of("Alpha", "Beta", "Gamma");
        Stream<String> streamB = Stream.of("1", "2", "3","4");

        Stream<String> result = zipIterators(streamA, streamB);

        result.peek(System.out::println).collect(Collectors.toList());

    }
    public static <T> Stream<T> zipIterators( Stream<T> streamA,Stream<T> streamB ){

        Iterator<T> iteratorA = streamA.iterator();

        Iterator<T> iteratorB = streamB.iterator();

        return Stream.iterate(0, i -> iteratorA.hasNext() && iteratorB.hasNext(),  i -> i + 1)
                .flatMap(i -> Stream.of(iteratorA.next(), iteratorB.next()));
    }

}
