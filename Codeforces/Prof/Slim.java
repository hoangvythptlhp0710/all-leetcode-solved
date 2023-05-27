package src.Codeforces.Prof;

import java.util.*;
/*
Given an array of n integers a1, a2,... an where ai != 0, check if you can make
this array sorted by using the following operation any number of times (possibly
zero). An array is sorted if its elements are arranged in a non-decreasing order.

1. Select two indices i and j (1 <= i, j <= n) such that ai and aj have different
signs. In other words, one must be positive and one must be negative.

2. Swap the signs of ai and aj. For example if you select ai = 3 and aj = =2, then
they will change to ai = -3 and aj = 2.
 */
public class Slim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String y = "YES", n = "NO";
        int test = sc.nextInt();

        for (int i = 0; i < test; i++){
            int res = sc.nextInt();
            int k = 0;
            int[] arr = new int[res];
            for (int j = 0; j < res; j++){
                arr[j] = sc.nextInt();
                if (arr[j] < 0){
                    k++;
                }
                arr[j] = Math.abs(arr[j]);
            }
            for (int t = 0; t < k; t++){
                arr[t] = -1 * arr[t];
            }
            int f = 0;
            for (int r = 0; r < arr.length - 1; r++){
                if (arr[r] > arr[r+1]){
                    f = 1;
                    break;
                }
            }
            if (f == 1){
                System.out.println(n);
            }
            else{
                System.out.println(y);
            }
        }
    }
}
