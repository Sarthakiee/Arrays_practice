// 39. Find the union of two arrays.
import java.util.*;

public class Q39 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {3, 4, 5};

        Set<Integer> set = new HashSet<>();

        for (int i : a) set.add(i);
        for (int i : b) set.add(i);

        System.out.println(set);
    }
}