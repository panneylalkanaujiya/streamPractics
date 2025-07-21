
import java.util.*;
public class LinkedHasSet
{
    public static void main(String args[])
    {
        LinkedHashSet<String> linkedhashSet= new LinkedHashSet<String>();
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
