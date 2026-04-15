// 31. Find the difference between the largest and smallest element.
import java.util.*;

public class Q31 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};

        int max = arr[0], min = arr[0];

        for (int i : arr) {
            if (i > max) max = i;
            if (i < min) min = i;
        }

        System.out.println(max - min);
    }
}