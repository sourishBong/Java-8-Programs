import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighehestNumber {

    public static void main(String[] args) {
        int a[] = { 3, 6, 32, 1, 8, 5, 31, 22 };

        int secundMax = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(1).findAny().get();
        System.out.println(secundMax);

    }
}
