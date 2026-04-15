// 9. Separate even and odd elements into two arrays.
import java.util.*;

public class que9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int i : arr) {
            if (i % 2 == 0) even.add(i);
            else odd.add(i);
        }

        System.out.println(even);
        System.out.println(odd);
    }
}