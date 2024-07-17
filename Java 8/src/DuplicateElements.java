import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElements {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,10,25,98,98,32,15);

        //method 1
        Set<Integer> set=new HashSet<>();
        myList.stream()
                .filter(n->!set.add(n))
                .forEach(System.out::println);

        //method 2
        Set<Integer> s=myList.stream()
                .filter(i->Collections.frequency(myList,i)>1)
                .collect(Collectors.toSet());
        System.out.println(s);

    }
}
