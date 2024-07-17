import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortValues {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        // approach 1
        myList.sort((s1,s2)->s1.compareTo(s2));
        System.out.println(myList);

        //approach 2
        List<Integer> result=myList.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println(result);
    }
}
