import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8MapUpper {

    public static void main(String[] args) {

        List<String> list= Arrays.asList("aa","bb","cc");

        list.stream().map(e->e.toUpperCase()).forEach(System.out::println);

        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
