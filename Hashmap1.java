import java.util.HashMap;
import java.util.Map;
public class Hashmap1
{
    public static void main(String args[])
    {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("panney", 101);
        hm.put("Ankit sharma", 9);
        hm.put("Rahul", 10);
        hm.put("Saurav ", 12);
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getValue() + "   " + m.getKey());
        }

    }
}