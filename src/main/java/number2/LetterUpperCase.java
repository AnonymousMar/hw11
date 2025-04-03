package number2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LetterUpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Zlata", "Peter", "Maryna", "Kateryna", "Vitalii", "Tetiana", "Lena");
        String result = getNameOfList(names);
        System.out.println(result);


    }
    public static String getNameOfList(List<String> names){
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(", "));


    }
}
