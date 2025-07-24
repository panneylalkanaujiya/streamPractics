
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class EvenOddUsingPredicate
{
   public static void main(String args[])
   {
       List<Integer>list= Arrays.asList(12,23,3,4,54,56,90,10);
       evenandodd(list,n->n%2==0,"even no:");
       evenandodd(list,n->n%2!=0,"odd no:");


    }
    public static  void evenandodd(List<Integer>list,Predicate<Integer>condition,String message)
    {
        System.out.println("message");
        list.stream()
        .filter(condition)
            .forEach(System.out::println);
    }

}