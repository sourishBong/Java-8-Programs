import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseAWordOfAStringUsingJava8 {

    public static void main(String[] args) {

        String str = "Java Concept Of The Day";

        String reversedString=Arrays.stream(str.split(" ")).map(word->new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(reversedString);
    }
}
