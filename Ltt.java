import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ltt
{
    public static void main(String args[])
    {
        List<Integer> list= Arrays.asList(12,3,4,56,89,20);
        Optional<Integer>subtract=list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .reduce((a,b)->a-b);
        subtract.ifPresent(subtractvalue->System.out.println("subtractvalue:"+subtractvalue));
    }
}