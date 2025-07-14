import java.util.HashMap;
import java.util.Map;
public class RomanToInteger {
    public static int romanToInt(String s)
    {
        Map<Character,Integer> romanMap =new HashMap<>();
        romanMap .put('I',1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;
        for(int i=s.length()-1;i>=0;i--)
        {
            int currentValue=romanMap.get(s.charAt(i));
            if(currentValue<prevValue) {
                total -= currentValue;
            }
            else {
                total += currentValue;
            }
            prevValue=currentValue;

            }
        return total;
            }
            public static void main(String args[]) {
                String s1 = "III";
                String s2 = "LVIII";
                String s3 = "MCMXCIV";
                System.out.println("Input: " + s1 + " → Output: " + romanToInt(s1)); // 3
                System.out.println("Input: " + s2 + " → Output: " + romanToInt(s2)); // 58
                System.out.println("Input: " + s3 + " → Output: " + romanToInt(s3)); // 1994
            }
        }
