import java.util.Arrays;
import java.util.List;

public class FindFirstElement {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        //method 1
        Integer i=myList.stream().findFirst().get();
        System.out.println(i);

        // method 2
        myList.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
