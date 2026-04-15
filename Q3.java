// 3. Find the maximum/minimum element in an array.
import java.util.*;

public class que3 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6};

        int max = arr[0];
        int min = arr[0];

        for (int i : arr) {
            if (i > max) max = i;
            if (i < min) min = i;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}