import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Firstrepeatedcharacter {
    public static void main(String args[])
    {
        String s1="panney";
        Optional<Character>name=s1.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst();
        if(name.isPresent())
        {
            System.out.println("nonrepeatedchar:"+name.get());
        }
        else {
            System.out.println("non repeated character found");
        }
    }
}
