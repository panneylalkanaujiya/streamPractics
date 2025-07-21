import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 {
    public static void main(String args[])
    {
        SortedSet<String> linkedhashSet= new TreeSet<>();
        linkedhashSet.add("panney");
        linkedhashSet.add("swetakumari");
        linkedhashSet.add("susma devi");
        linkedhashSet.add("naresh");
        linkedhashSet.add("Arpit");
        linkedhashSet.add("panney");
        Iterator<String> itr=linkedhashSet.iterator();
        while(itr.hasNext())
        {
            System.out.println("iterating element:"+itr.next());
        }
    }
}
