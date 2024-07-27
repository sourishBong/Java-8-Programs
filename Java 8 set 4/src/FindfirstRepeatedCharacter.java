import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindfirstRepeatedCharacter {

    public static void main(String[] args) {

        String inputString = "Java Concept Of The Day";

       Character ans= inputString
                .chars()
                .mapToObj(ch->Character.toLowerCase((char) ch))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(ch->ch.getValue()>1L)
                .findFirst()
                .get()
                .getKey();

        System.out.println(ans);
    }
}
