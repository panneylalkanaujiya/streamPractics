import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindMaxNumber {
    public static void main(String args[])
    {
        List<Integer> maxno= Arrays.asList(12,3,478,98,43,90);
        Optional<Integer>maxnumber=maxno.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
        .findFirst();
        //.max(Integer::compareTo);

        maxnumber.ifPresent(max->System.out.println("maxnumber:"+max));

    }
}
