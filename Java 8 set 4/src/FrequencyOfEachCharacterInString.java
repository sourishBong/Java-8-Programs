import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacterInString {

    public static void main(String[] args) {
        String inputString = "Java Concept Of The Dayj";

//        inputString
//                .chars()
//                .mapToObj(ch->Character.toLowerCase((char) ch))
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                .entrySet()
//                .stream()
//                .forEach(m-> System.out.print(m.getKey()+":"+m.getValue()+" "));

       Map<Character,Long> map= inputString
                .chars()
                .mapToObj(ch->(char) ch)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);
    }
}
