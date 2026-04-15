// 5. Count the occurrences of a specific element.
import java.util.*;

public class que5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 2, 4};
        int key = 2;
        int count = 0;

        for (int i : arr) {
            if (i == key) count++;
        }

        System.out.println(count);
    }
}