import java.util.Iterator;
import java.util.Vector;

public class VectorDemo1 {
    public static void main(String args[])
    {
        Vector<String> vector= new Vector<String>();
        vector.add("rohitsharma");
        vector.add("rohitsharma");
        vector.add("patil");
        vector.add("pandit");
        vector.add("sweta");
        vector.add("panney");
        vector.add("Ankit verma");
        Iterator<String>itr=vector.iterator();
        while(itr.hasNext())
        {
            System.out.println("iterarting the element:"+itr.next());
        }
    }
    }


