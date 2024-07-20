import java.util.Arrays;

public class FindMaxInArray {

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};

        int max=Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }
}
