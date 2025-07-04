import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxStringInList {
    public static void main(String args[])
    {
        List<String> names= Arrays.asList("lal","panneylal","kanaujiyao","sweta");
        Optional<String> maxstringname=names.stream()
                
        .max( Comparator.comparingInt(String::length));
        maxstringname.ifPresent(max->System.out.println("max:"+max));
    }
}
