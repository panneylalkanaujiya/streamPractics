import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String args[])
    {
        LinkedList<String>linkedList= new LinkedList<>();

        linkedList.add("panney");
        linkedList.add("Rahul");
        linkedList.add("Geeta");
        linkedList.add("sohan kumar");
        linkedList.add("Sweta kumari");
        linkedList.add("Deepak");
        linkedList.add("patilji");
        linkedList.add("pulkit");
        linkedList.add("panney");

        Iterator<String>itr=linkedList.iterator();
        while (itr.hasNext())
        {
            System.out.println("iterating the element:"+itr.next());
        }
    }
}
