// 7. Check if an array contains a given number.
import java.util.*;

public class que7 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8};
        int key = 6;

        boolean found = false;

        for (int i : arr) {
            if (i == key) {
                found = true;
                break;
            }
        }

        System.out.println(found);
    }
}