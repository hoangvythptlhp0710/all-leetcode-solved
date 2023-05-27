
import java.util.*;

public class Hello1 {


    public static int kthFactor(int n, int k) {
        if (n == 1) {
            return 1;
        }
        int result = -1;
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                set.add(i);
            }
        }
        Object [] arr = set.toArray();
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (k-1 == i) {
                result = (int) arr[i];
            }
        }
        if (k > arr.length || k < 0) {
            return -1;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 32, k = 1;
        System.out.println(kthFactor(n, k));

    }





}
