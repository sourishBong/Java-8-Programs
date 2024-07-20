import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums={1,2,2,4,4,5};
        boolean ans=containsDuplicate(nums);
        System.out.println(ans);
    }

    private static boolean containsDuplicate(int[] nums) {

        List<Integer> list=Arrays.stream(nums).boxed().collect(Collectors.toList());
        Set<Integer> set=new HashSet<>(list);

        if(set.size()==list.size())
            return false;
        else
            return true;
    }
}
