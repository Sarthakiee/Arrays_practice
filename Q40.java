// 40. Find missing number in a sequence from 1 to n.
import java.util.*;

public class Q40 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;

        int sum = n * (n + 1) / 2;

        int actual = 0;
        for (int i : arr) actual += i;

        System.out.println(sum - actual);
    }
}