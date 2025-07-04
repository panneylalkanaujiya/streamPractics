import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MeargingTwoArray {
    public static void main(String args[])
    {
        int arr1 []={12,23,45,78,98,90};
        int arr2[]={12,23,43,54,67};
        int arr3[]= IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2))
        .distinct()
                .toArray();
        System.out.println(Arrays.toString(arr3));


    }
}
