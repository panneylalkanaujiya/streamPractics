import java.util.Iterator;
import java.util.Stack;
public class StackDemo1
{
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<>();
        stack.push("panney");
        stack.push("Anjali");
        stack.push("panney");
        stack.push("pradeep");
        stack.push("rahulkumar");
        stack.push("kundan sharma");
        stack.pop();
        //stack.peek();
        Iterator<String> itr=stack.iterator();
        while(itr.hasNext())
        {
            System.out.println("iterating the element:"+itr.next());
        }
    }
}
