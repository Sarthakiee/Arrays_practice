// 37. Find the majority element (element occurring more than n/2 times).
import java.util.*;

public class Q37 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 2, 3, 2, 2};

        int candidate = 0, count = 0;

        for (int i : arr) {
            if (count == 0) {
                candidate = i;
            }
            count += (i == candidate) ? 1 : -1;
        }

        System.out.println(candidate);
    }
}