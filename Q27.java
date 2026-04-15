// 27. Find the smallest three elements in an array.
import java.util.*;

public class Q27 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i < first) {
                third = second;
                second = first;
                first = i;
            } else if (i < second) {
                third = second;
                second = i;
            } else if (i < third) {
                third = i;
            }
        }

        System.out.println(first + " " + second + " " + third);
    }
}