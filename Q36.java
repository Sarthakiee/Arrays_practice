// 36. Rearrange array so that positive and negative numbers alternate.
import java.util.*;

public class Q36 {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6};

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int i : arr) {
            if (i >= 0) pos.add(i);
            else neg.add(i);
        }

        int i = 0, j = 0, k = 0;

        while (i < pos.size() && j < neg.size()) {
            arr[k++] = pos.get(i++);
            arr[k++] = neg.get(j++);
        }

        while (i < pos.size()) arr[k++] = pos.get(i++);
        while (j < neg.size()) arr[k++] = neg.get(j++);

        System.out.println(Arrays.toString(arr));
    }
}