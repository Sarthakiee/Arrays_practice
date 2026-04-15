// 13. Find the index of the first occurrence of a given element.
import java.util.*;

public class Q13 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4};
        int key = 2;

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}