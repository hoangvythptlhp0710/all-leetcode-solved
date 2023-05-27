package src.LythuyetDSA.Sort;

import java.util.Scanner;

public class sapxepchen {
    public static void printArray(int no, int[] a) {
        System.out.printf("%d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }

    public static void insertionSort(int[] a) {
        int n = a.length;
        for(int i = 1; i < n; i++){
            //chen a[i] vao day 0 -> i-1
            int b = a[i];
            int j = i-1;
            while (j >= 0 && a[j] > b){
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = b;
            printArray(i, a);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int [] a = new int[b];
        for (int i = 0; i < b; i++){
            a[i] = sc.nextInt();
        }
        insertionSort(a);
        printArray(b,a);
    }
}
