import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetDemo1
{
    public static void main(String args[])
    {
        TreeSet<Integer>treeSet= new TreeSet<>();
        treeSet.add(190);
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(5880);
        treeSet.add(16);
        treeSet.add(17);
        treeSet.add(18);
        Iterator itr=treeSet.iterator();
        while(itr.hasNext())
        {
            System.out.println("iterating the elements:"+itr.next());
        }
    }
    }

