// 4. Search for a given element (linear search) in an array.
import java.util.*;

public class que4{
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int key = 5;

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