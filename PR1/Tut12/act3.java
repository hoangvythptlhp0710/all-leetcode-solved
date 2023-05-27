package Tut12;

import java.util.Arrays;
import java.util.HashSet;

public class act3 {

    public static HashSet<Integer> intersect(HashSet<Integer> a, HashSet<Integer> b) {

        HashSet<Integer> c = new HashSet<>();
        if (a.size() < b.size()) {
            HashSet<Integer> t = a;
            a = b;
            b = t;
        }
        for (int i : a) {
            if (b.contains(i)) {
                c.add(i);
            }
        }
        return c;
    }


    public static void main(String[] args) {
        Integer[] A = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        Integer[] B = new Integer[]{11,3,5,2,16,7,64,74,43};
        HashSet<Integer> a = new HashSet<>(Arrays.asList(A));
        HashSet<Integer> b = new HashSet<>(Arrays.asList(B));
        HashSet<Integer> c = intersect(a,b);
        System.out.println(c.toArray());
    }

}
