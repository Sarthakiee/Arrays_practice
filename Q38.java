// 38. Find the intersection of two arrays.
import java.util.*;

public class Q38 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};

        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int i : a) set.add(i);

        for (int i : b) {
            if (set.contains(i)) result.add(i);
        }

        System.out.println(result);
    }
}