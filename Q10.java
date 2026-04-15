// 10. Copy elements from one array to another.
import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        System.out.println(Arrays.toString(copy));
    }
}