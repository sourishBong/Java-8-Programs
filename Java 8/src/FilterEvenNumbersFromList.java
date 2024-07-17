import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbersFromList {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(9);
        list.add(6);
        list.add(7);
        list.add(5);
        list.add(4);

        filter(list);
        filter2(list);
        filter3(list);
        ascending(list);
    }

    //add filtered item to list
    private static void filter3(List<Integer> list) {

        List<Integer> ans=list.stream().filter(s->s%2==1).sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println(ans);
    }

    //ascending order
    private static void ascending(List<Integer> list) {
        list.sort((s1,s2)->s1.compareTo(s2));
        System.out.println(list);
    }

    //print on same line
    private static void filter(List<Integer> list) {

        list.stream().filter(l-> l%2!=0).forEach(l->System.out.print(l+" "));

    }

    //print in new line
    private static void filter2(List<Integer> list) {

        list.stream().filter(l-> l%2!=0).forEach(System.out::println);

    }
}
