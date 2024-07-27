import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PalindromeUsingJava8Stream {

    public static void main(String[] args) {

        String str = "ROTATOR";

        boolean isItPalindrome =IntStream.rangeClosed(1,str.length()/2)
                        .noneMatch(i->str.charAt(i)==str.charAt(str.length()-i-1));


        System.out.println(isItPalindrome);
    }
}
