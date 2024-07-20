import java.util.*;

public class CheckOptional {

    // How to check if list is empty in Java 8 using Optional,
    // if not null iterate through the list and print the object
    public static void main(String[] args) {
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");

//        Optional.ofNullable(names)
//                .orElseGet(Collections::emptyList)
//                .stream().filter(Objects::nonNull)
//                .map()
    }
}
