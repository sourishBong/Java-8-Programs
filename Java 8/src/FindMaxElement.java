import java.util.Arrays;
import java.util.List;

public class FindMaxElement {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        int max=myList.stream().max(Integer::compare).get();
        int min=myList.stream().min(Integer::compare).get();
        System.out.println(max);
        System.out.println(min);
    }
}
