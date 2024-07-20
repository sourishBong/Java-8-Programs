import java.util.Arrays;

public class Java8Stream {

    // Write a Java 8 program to sort an array and then convert the sorted array into Stream
    public static void main(String[] args) {
        int arr[] = { 99, 55, 203, 99, 4, 91 };

        // Sorted the Array using parallelSort()
        Arrays.parallelSort(arr);

        /* Converted it into Stream and then
           printed using forEach */
        Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
    }
}
