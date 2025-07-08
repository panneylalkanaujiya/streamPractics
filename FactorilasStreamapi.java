import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FactorilasStreamapi {
    public static void main(String args[])
    {
        int number=5;
        int factorials= IntStream.rangeClosed(1,number)
                        .reduce(1,(a,b)->a*b);
        System.out.println("num:"+factorials);
    }
}
