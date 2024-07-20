import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEach {

    // Write a program to print the count of each character in a String
    public static void main(String[] args) {
            String s="string data to count each character";

        Map<String, Long> map =  Arrays.stream(s.split(""))
                .filter(a->!a.isBlank())
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}
