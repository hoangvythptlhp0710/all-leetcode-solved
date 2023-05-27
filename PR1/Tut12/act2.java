package src.PR1.Tut12;

import Tut12.*;

import java.util.Arrays;
import java.util.Scanner;

public class act2 {
    public static int binarySearch(int [] A, int k, int low, int high){
        if (high < low){
            return -1;
        }
        int mid = (low + high)/2;
        if (A[mid] == k){
            return mid;
        }
        else if (A[mid] > k){
            return binarySearch(A,k,low,mid-1);
        }
        else{
            return binarySearch(A,k,mid+1,high);
        }
    }

    public static int binarySearch2(int[] a, int k){
        return binarySearch(a, k, 0, a.length-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,3,5,6,2,62,326,541,32,47,12,45};
        int[] b = Tut12.act1.selectionSort(a);
        System.out.println(Arrays.toString(b));
        int k = sc.nextInt();
        System.out.println(binarySearch2(b, k));
        }
    }

