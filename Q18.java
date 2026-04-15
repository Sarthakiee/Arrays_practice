// 18. Sort an array in descending order.
import java.util.*;

public class Q18 {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 9, 1, 3};

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
    }
}