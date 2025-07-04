import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class DistinctElementUsingHashmap {
    public static void main(String args[])
    {
        HashMap<String,Integer>hm= new HashMap<>();
        hm.put("panney",1);
        hm.put("sweta",2);
        hm.put("rahul",3);
        hm.put("Ambresh",4);
        List< Map.Entry <String,Integer>>distinct=hm.entrySet().stream()
        //List<Integer> distinct=hm.values().stream()
                .distinct()
        .collect(Collectors.toList());
        System.out.println("distinct:"+distinct);
    }
}
