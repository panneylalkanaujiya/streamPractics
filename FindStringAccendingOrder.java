import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringAccendingOrder {
    public static void main(String  args[])
    {
        List<String> list= Arrays.asList("rohit verma","swetakumari","rahul sharma","vijaykumar");
         List<String> result=list.stream()
                 .sorted()
                         .collect(Collectors.toList());
        result.forEach(System.out::println);

    }
}
