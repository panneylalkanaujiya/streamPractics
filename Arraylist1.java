import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist1 {
    public static void main(String args[])
    {
        ArrayList<Integer>list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        Iterator<Integer>itr= list.iterator();
        while(itr.hasNext())
        {
            System.out.println("Iterating the element:"+itr.next());
        }


    }
}
