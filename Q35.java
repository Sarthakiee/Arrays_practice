// 35. Move all zeroes to the end without changing order of other elements.
import java.util.*;

public class Q35 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        int index = 0;

        for (int i : arr) {
            if (i != 0) {
                arr[index++] = i;
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}