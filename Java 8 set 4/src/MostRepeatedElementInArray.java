import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElementInArray {

    public static void main(String[] args) {

        List<String> listOfStrings
                = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        Map.Entry<String,Long> entry=listOfStrings.stream()
                .collect(
                        Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue()).get();

        System.out.println(entry.getKey()+" "+entry.getValue());

    }
}
