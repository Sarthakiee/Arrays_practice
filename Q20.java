// 20. Find the second smallest element in an array.
import java.util.*;

public class Q20 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i < first) {
                second = first;
                first = i;
            } else if (i < second && i != first) {
                second = i;
            }
        }

        System.out.println(second);
    }
}