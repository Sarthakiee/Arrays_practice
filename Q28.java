// 28. Find the sum of even and sum of odd elements separately.
import java.util.*;

public class Q28 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int evenSum = 0, oddSum = 0;

        for (int i : arr) {
            if (i % 2 == 0) evenSum += i;
            else oddSum += i;
        }

        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);
    }
}