import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingWithOne {

    public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

        //method 1
        List<String> ans=myList.stream().map(s->String.valueOf(s))
                .filter(s->s.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(ans);

        //method 2
        myList.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);

    }
}
