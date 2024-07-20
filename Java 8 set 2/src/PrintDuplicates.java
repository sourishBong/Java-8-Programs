import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintDuplicates {

    public static void main(String[] args) {
        int a[] = { 1, 4, 5, 2, 12, 34, 2, 11 };
        System.out.println("Duplicate number by java 1.8 : " + findDuplicateNumberByJava(a));
    }

    private static int findDuplicateNumberByJava(int[] a) {

        Map<Integer,Long> map=Arrays.stream(a)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        int duplicate=map.keySet().stream().filter(x->map.get(x)>1).findFirst().orElse(0);

        return duplicate;

    }
}
