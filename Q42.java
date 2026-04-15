// 42. Find the element that appears only once while others appear twice.
import java.util.*;

public class Q42 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4, 4};

        int result = 0;

        for (int i : arr) {
            result ^= i;
        }

        System.out.println(result);
    }
}