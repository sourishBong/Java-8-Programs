import java.util.Arrays;
import java.util.List;

public class SortDescending {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        myList.sort((s1,s2)->s1.compareTo(s2));
        System.out.println(myList);
    }
}
