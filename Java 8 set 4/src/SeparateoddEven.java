import java.util.*;
import java.util.stream.Collectors;

public class SeparateoddEven {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

//       Collection<List<Integer>> evenOddList= listOfIntegers.stream().collect(Collectors.collectingAndThen(
//                Collectors.partitioningBy(e->e%2==0), Map::values)
//        );
//
//        System.out.println(evenOddList);

        Map<Boolean,List<Integer>> map=listOfIntegers.stream().collect(Collectors.partitioningBy(e->e%2==0));

        Set<Map.Entry<Boolean,List<Integer>>> set=map.entrySet();

        for(Map.Entry<Boolean,List<Integer>> s:set){
            if(s.getKey()){
                System.out.println("Even Numbers");
            }else{
                System.out.println("Odd Numbers");
            }

            List<Integer> l=s.getValue();
            for(Integer i:l){
                System.out.println(i);
            }
        }
    }
}
