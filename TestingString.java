import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class TestingString
{
    public static void main(String args[])
    {
        String s1="feaebdcefdacef";
        Map<Character,Long>count= s1.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),  LinkedHashMap::new,Collectors.counting()));
        System.out.println("find character:"+count);
    }
}
