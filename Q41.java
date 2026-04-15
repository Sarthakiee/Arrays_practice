// 41. Find the duplicate number in an array (with one duplicate).
import java.util.*;

public class Q41 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};

        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (set.contains(i)) {
                System.out.println(i);
                break;
            }
            set.add(i);
        }
    }
}