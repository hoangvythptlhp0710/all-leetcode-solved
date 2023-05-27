package Tut12;

import java.util.Arrays;
import java.util.Scanner;

public class act1 {

    public static int[] selectionSort(int[] a){
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int p = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[p]) {
                    p = j;
                }
            }
            b[i] = a[p];
            a[p] = a[i];
        }
        return b;
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,6,2,62,326};
        int[] b = selectionSort(a);
        System.out.println(Arrays.toString(b));
    }
}
