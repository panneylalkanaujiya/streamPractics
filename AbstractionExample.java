import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AbstractionExample
{
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        List<String> searh = strs.stream()

                .filter(str -> str.startsWith("b"))

                .collect(Collectors.toList());
        System.out.println("searh:" + searh);

    }
}

