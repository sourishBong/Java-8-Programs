import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindPrimeOrNot {

    public static void main(String[] args) {

        System.out.println(" Is Prime No : " + isPrimeByJava8(9));
    }

    private static boolean isPrimeByJava8(int n) {

        if(n==0||n==1)
            return false;

        if(n==2)
            return true;

        boolean isPrime = IntStream.rangeClosed(2, n / 2).noneMatch(x -> n % x == 0);
        return isPrime;

    }
}
