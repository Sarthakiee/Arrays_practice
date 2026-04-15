// 44. Count the number of sub arrays with a given sum.
import java.util.*;

public class Q44 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        int k = 2;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0, count = 0;

        for (int i : arr) {
            sum += i;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(count);
    }
}