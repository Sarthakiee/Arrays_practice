// 12. Compare two arrays for equality.
import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        boolean equal = Arrays.equals(a, b);

        System.out.println(equal);
    }
}