import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindEachOccuranceInString {
    public static void main(String args[])
    {
        String s1="panney";
        Map<Character,Long>map=s1.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("map:"+map);

    }
}
