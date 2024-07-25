import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestInAnArray {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        Integer ans=listOfIntegers
                .stream()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .max(Comparator.reverseOrder())
                .get();

        Integer ans2=listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(ans+" "+ans2);
    }
}
