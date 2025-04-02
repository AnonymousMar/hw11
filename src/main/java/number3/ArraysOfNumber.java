package number3;
import java.util.Arrays;
import java.util.List;

public class ArraysOfNumber {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,0,4,5);

        numbers.stream()
                .sorted()
                .forEach(number -> System.out.print( number + ","));

    }
}
