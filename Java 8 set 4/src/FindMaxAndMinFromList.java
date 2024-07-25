import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxAndMinFromList {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

       int max= listOfIntegers.stream().max(Comparator.naturalOrder()).get();

        int min= listOfIntegers.stream().min(Comparator.naturalOrder()).get();

        int max2= listOfIntegers.stream().max((s1,s2)->s1.compareTo(s2)).get();

        System.out.println(max+" "+min+" "+max2);
    }
}
