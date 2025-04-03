package number1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListOfName {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ivan", "Zlata", "Peter", "Maryna", "Kateryna", "Vitalii", "Tetiana", "Lena");
        String result = getName(names);
        System.out.println(result);


    }
    public static String getName(List<String> names ){
       return IntStream.range(0, names.size())
                .filter(index -> index % 2 != 0)
               .mapToObj(index -> index + ". " + names.get(index))
               .collect(Collectors.joining(", "));
    }
}
