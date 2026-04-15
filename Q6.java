// 6. Replace all occurrences of a specific element with another number.
import java.util.*;

public class que6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 2};
        int oldVal = 2;
        int newVal = 9;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldVal) {
                arr[i] = newVal;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}