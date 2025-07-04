import java.util.Arrays;
import java.util.List;
public class SumOfTheNumber {
    public static void main(String args[])
    {
        List<Integer> number= Arrays.asList(12,23,45,12,23,7,8,9,90);
        int sum=number.stream()
                        //.reduce(0,( a,  b)->a+b);
                                .reduce(0,(Integer::sum));
        System.out.println("addding the ddtaat:"+sum);
    }
}
