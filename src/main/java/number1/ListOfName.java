package number1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ListOfName {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ivan", "Zlata", "Peter", "Maryna", "Kateryna", "Vitalii", "Tetiana", "Lena");

        IntStream.range(0, names.size())
                .filter(index -> index % 2 != 0)

                .forEach(index -> System.out.print(index + ". " + names.get(index) + ", "));
    }
}
