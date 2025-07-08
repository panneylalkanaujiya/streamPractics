import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FindRepeatedNo {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,1,1,2,2,3,4,5,6,6,7,8,8);
        HashSet<Integer>unique= new HashSet<>();
        List<Integer>repeatedno=list.stream()
                .filter(n->!unique.add(n))
                .distinct()
                .collect(Collectors.toList());
        System.out.println("repeatedno is :"+repeatedno);
    }
}
