// 8. Count how many elements are even and how many are odd.
import java.util.*;

public class que8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int even = 0, odd = 0;

        for (int i : arr) {
            if (i % 2 == 0) even++;
            else odd++;
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}