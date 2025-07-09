import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class chedkingstaringposition {
    public static void main(String args[])
    {
        List<String> list= Arrays.asList("panney","rohit","sauravkedarnagar","radha");
        Optional<String> lenght=list.stream()
                //.filter(s->s.startsWith("p"))
                .max(Comparator.comparingInt(String::length));
        lenght.ifPresent(lenght1->System.out.println("Length:"+lenght1));
                //.collect(Collectors.toList());
        //System.out.println("lenght:"+lenght);

    }
}
