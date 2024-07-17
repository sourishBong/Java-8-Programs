import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfStringInAscendingOrder {

    public static void main(String[] args) {
        List<String> str=new ArrayList<>();
        str.add("Sourish");
        str.add("Sarmistha");
        str.add("Anuroop");
        str.add("Debanjali");
        str.add("Dipyaman");
        str.add("Yashwant");

        ascending(str);
        descending(str);
    }

    private static void descending(List<String> str) {

        str.sort((s1,s2)->-s1.compareTo(s2));
        System.out.println(str);
    }

    private static void ascending(List<String> str) {

        str.sort((s1,s2)->s1.compareTo(s2));
        System.out.println(str);
    }
}
