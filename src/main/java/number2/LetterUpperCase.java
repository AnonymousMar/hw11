package number2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LetterUpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Zlata", "Peter", "Maryna", "Kateryna", "Vitalii", "Tetiana", "Lena");

        names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
