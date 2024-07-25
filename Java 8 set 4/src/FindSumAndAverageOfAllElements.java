import java.util.Arrays;
import java.util.stream.Collectors;

public class FindSumAndAverageOfAllElements {

    public static void main(String[] args) {

        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};

        int sum=Arrays.stream(a).sum();

        double average=Arrays.stream(a).average().getAsDouble();

        System.out.println(sum+" "+average);
    }
}
