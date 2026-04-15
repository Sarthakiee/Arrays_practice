// 45. Find the length of the longest sub array with all distinct elements.
import java.util.*;

public class Q45 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};

        Set<Integer> set = new HashSet<>();

        int left = 0, maxLen = 0;

        for (int right = 0; right < arr.length; right++) {
            while (set.contains(arr[right])) {
                set.remove(arr[left]);
                left++;
            }

            set.add(arr[right]);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println(maxLen);
    }
}