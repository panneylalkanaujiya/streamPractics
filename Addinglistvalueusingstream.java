import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Addinglistvalueusingstream
{
    public static void main(String args[])
    {
        List<Integer> list= Arrays.asList(12,23,4,45,78,21);
         int  sum= list.stream()
                .reduce(1, (a, b) -> a + b);
        //.collect(Collectors.toList());
System.out.println("sum of the:"+sum);

    }
}
