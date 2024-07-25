import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        //Set<String> set= listOfStrings.stream().collect(Collectors.toSet());
        //System.out.println(set);

        List<String> list=listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.println(list);

    }
}

