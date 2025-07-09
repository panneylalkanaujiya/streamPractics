import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String args[])
    {
        List<Integer> list= Arrays.asList(1,2,3,4,4,5,6,7,9,11);
        List<Integer>number= list.stream()
                .filter(PrimeNumber::isPrime)
        .collect(Collectors.toList());
        System.out.println("primenumber:"+number);

    }
    public static boolean  isPrime(int number)
    {
      return  number >1 &&
              IntStream.rangeClosed(2,(int) Math.sqrt(number))
                      .allMatch(n->number%n!=0);
    }
}
