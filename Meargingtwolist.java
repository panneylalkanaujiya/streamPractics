import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Meargingtwolist {
    public static void main(String args[])
    {
       List<Integer> list1= Arrays.asList(12,2,3,4,445,78);
        List<Integer>list2= Arrays.asList(12,34,56,89);
        List<Integer> list3 = Stream.concat(list1.stream(), list2.stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("list3:"+list3);

    }
}
