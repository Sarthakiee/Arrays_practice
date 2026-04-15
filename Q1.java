// 1. Find the sum of all elements in an array.
import java.util.*;

public class que1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        System.out.println(sum);
    }
}