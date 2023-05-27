package src.LythuyetDSA.Sort;

import java.util.Arrays;

public class sapxepnhanh {

    public static int partition(int[] a, int L, int R, int key){
        int iL = L;
        int iR = R;
        while (iL <= iR){
            while (a[iL] < key) iL++;
            while (a[iR] > key) iR--;

            if (iL <= iR){
                int temp = a[iL];
                a[iL] = a[iR];
                a[iR] = temp;
                iL++; iR--;
            }
        }
        return iL;
    }

    public static void quickSort(int[] a, int L, int R){
        if (L >= R) return;
        //b1: chon khoa
        int key = a[(L+R)/2];


        //b2: phan bo lai mang
        int k = partition(a, L, R, key);

        //b3: chia doi mang: lap lai

        quickSort(a, L, k-1);
        quickSort(a, k, R);
    }

    /**
     * QuickSelect is a selection algorithm to find the kth smallest element in an unordered list
     * It is related to the quick sort sorting algorithm.
     *
     *
     *
     * @param args
     */

    public static int quickSelect(int[] a, int l, int r, int k){
        int partition = partition(a, l, r, k);
        if (partition == k -1) return a[partition];
        else if (partition < k - 1) {
            return quickSelect(a, partition + 1, r, k);
        }
        else{
            return quickSelect(a, l, partition - 1, k);
        }
    }

    public static void main(String[] args) {
        int[] a = {6,7,8,3,4,2,1,5};
        quickSort(a, 0, a.length -1);
        System.out.println(quickSelect(a, 0, a.length - 1, 2));
        System.out.println(Arrays.toString(a));
    }
}
