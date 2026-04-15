// 14. Find the index of the last occurrence of a given element.
import java.util.*;

public class Q14 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4};
        int key = 2;

        int index = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}