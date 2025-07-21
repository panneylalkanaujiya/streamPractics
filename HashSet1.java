import java.util.HashSet;
import java.util.Iterator;
public class HashSet1
{
    public static void main(String args[])
    {
        HashSet<String>hashSet= new HashSet<>();
        hashSet.add("panney");
        hashSet.add("swetakumari");
        hashSet.add("susma devi");
        hashSet.add("naresh");
        hashSet.add("Arpit");
        hashSet.add("panney");
        Iterator<String>itr=hashSet.iterator();
                while(itr.hasNext())
        {
           System.out.println("iterating element:"+itr.next());
        }
    }
}
