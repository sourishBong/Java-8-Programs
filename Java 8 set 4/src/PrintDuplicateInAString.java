import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintDuplicateInAString {

    public static void main(String[] args) {

        String inputString = "Java Concept Of The Day";

        inputString
                .chars()
                .mapToObj(ch->Character.toLowerCase((char) ch))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1L)
                .filter(e->e.getKey()!=' ')
                .forEach(e->System.out.println(e.getKey()));
    }
}
