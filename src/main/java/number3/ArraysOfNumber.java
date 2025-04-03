package number3;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysOfNumber {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,0,4,5, 3);

        String result = getNumbers(numbers);
        System.out.println(result);

    }
    public static String getNumbers(List<Integer> numbers){
        return  numbers.stream()
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
