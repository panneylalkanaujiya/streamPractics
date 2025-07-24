
import java.util.HashSet;
public class SubarraySumZero
{
        public static boolean hasZeroSumSubarray(int[] arr)
        {
            HashSet<Integer> set = new HashSet<>();
            int sum = 0;

            for (int num : arr) {
                sum += num;

                // Check if sum is 0 or already seen
                if (sum == 0 || set.contains(sum)) {
                    return true;
                }

                set.add(sum);
            }
            return false;
        }
        public static void main(String[] args)
        {
            int[] A = {2, 2, 1, -3, 4, 3, 1, -2, -3, 2};
            System.out.println(hasZeroSumSubarray(A)); // Output: true
        }
}
