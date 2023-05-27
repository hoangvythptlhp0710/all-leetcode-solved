package Tut8;

import java.util.Arrays;

public class act4 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int [] a = {9, 29, 44, 103, 2, 52, 12, 12, 76, 35, 20};
        countLastDigits(a);
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }


    public static void countLastDigits(int[] a) {
        int[] count = new int[10];
        for (int i = 0; i < a.length; i++) {
            int digit = a[i] % 10;
            count[digit]++;
        }
        System.out.print("{");
        for (int i = 0; i < count.length; i++){
            System.out.print(+count[i] + ", ");
        }
        System.out.print("}");
        System.out.println();
    }
}
