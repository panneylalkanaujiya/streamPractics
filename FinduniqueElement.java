import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FinduniqueElement {
    public static void main(String args[])
    {
        List<Integer>list= Arrays.asList(12,32,43,45,45,67,67);
        List<Integer> duplicate= list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()==1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
                System.out.println("duplicateno:"+duplicate);

    }
}
