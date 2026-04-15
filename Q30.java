// 30. Replace all zeroes with ones.
import java.util.*;

public class Q30 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}