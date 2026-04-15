// 19. Find the second largest element in an array.
import java.util.*;

public class Q19 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > first) {
                second = first;
                first = i;
            } else if (i > second && i != first) {
                second = i;
            }
        }

        System.out.println(second);
    }
}