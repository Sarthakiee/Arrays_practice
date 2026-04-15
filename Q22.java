// 22. Count frequency of each element.
import java.util.*;

public class Q22 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        System.out.println(map);
    }
}