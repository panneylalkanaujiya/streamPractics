import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestingMain {
    public static void main(String args[])
    {
        List<Integer> list= Arrays.asList(12,23,4,4,8,9,40);
        Optional<Integer>maxvalue=list.stream().max(Integer::compareTo);

        maxvalue.ifPresent(max->System.out.println("max number is:"+max));
    }
}
