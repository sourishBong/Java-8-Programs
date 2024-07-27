import java.util.*;
import java.util.stream.Collectors;

public class ExctractDuplicatesFromArray {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);

        Set<Integer> set=new HashSet<>();

        List<Integer> result=listOfIntegers.stream().filter(l->!set.add(l)).collect(Collectors.toList());
        System.out.println(result);
    }
}
