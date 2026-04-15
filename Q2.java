// 2. Find the average of array elements.
import java.util.*;

public class que2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        double avg = (double) sum / arr.length;
        System.out.println(avg);
    }
}