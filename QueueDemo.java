import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static  void main(String args[])
    {
        Queue<String>queue= new LinkedList<>();
        queue.add("panney");
        queue.add("Rahul kumar");
        queue.add("sweta kumari");
        queue.add("dhrub kumar");
        queue.add("atul kumar mishra");
        queue.add("Ambani ji");
        Iterator<String>itr= queue.iterator();
        while(itr.hasNext())
        {
            System.out.println("iterrating the elements:"+itr.next());
        }

    }
}
