import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateoddEven {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

       Collection<List<Integer>> evenOddList= listOfIntegers.stream().collect(Collectors.collectingAndThen(
                Collectors.partitioningBy(e->e%2==0), Map::values)
        );

        System.out.println(evenOddList);
    }
}
