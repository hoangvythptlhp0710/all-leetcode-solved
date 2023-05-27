package src.LythuyetDSA.Sort;
/*
Ý tưởng: Cho một mảng, chia đôi mảng ra thành 2 phần, sắp xếp xong trộn vào
Thuật toán: Cho một mảng gồm n phần tử, chúng ta chia mảng thành 2 phần nhỏ hơn với mảng có n/2 phần tử, tiếp tục
thực hiện chia đến bao giờ chỉ còn một mảng một phần tử. Sau đó, với mỗi mảng một phần từ, ta coi chúng là mảng đã
sắp xếp, trộn chúng vào với nhau=> được mảng mới đã sắp xếp.


*/
import java.util.Arrays;

public class sapxeptron {
    public int[] merge(int[] a1, int[] a2){
        int a3 = a1.length + a2.length;
        int [] result = new int [a3];
        int i = 0, i1 = 0, i2 = 0;
        while (i < a3){
            if (i1 < a1.length && i2 < a2.length) {//a1 và a2 khác rỗng
                if (a1[i1] <= a2[i2]) {//a1 nhỏ hơn
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else {//a2 nhỏ hơn
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            }
            else{//a1 hoặc a2 rỗng
                if (i1<a1.length){//a1 khác rỗng
                    result[i] = a1[i1];
                    i++;
                    i1++;
                }
                else{//a2 khác rỗng
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            }
        }
        return result;


    }
    public int[] mergeSort(int a[], int L, int R)
    {
        //trường hợp đặc biệt, điều kiện dừng
        if (L>R) return new int[0];
        if (L == R) {
            int[] singleElement = {a[L]};
            return singleElement;
        }

        // Chia ra
        System.out.println("Chia: " + L + " - " + R);
        int k = (L+R)/2;
        int[] a1 = mergeSort(a, L, k);
        int[] a2 = mergeSort(a, k+1, R);
        //Trộn vào: a1 và a2 là các mảng đã được sắp xếp
        int [] result = merge(a1, a2);
        System.out.println("Kết quả trộn: " + Arrays.toString(result));
        return result;
    }
    public int [] sortArray(int[] nums){
        return mergeSort(nums, 0, nums.length -1);
    }
    public static void main(String[] args){
        sapxeptron s = new sapxeptron();
        //int [] a1 = {1, 3, 5, 7, 9};
        //int [] a2 = {2, 4, 6, 8, 10};
        int [] c = {9, 45, 53, 72, 84, 97, 61, 26};

        System.out.println(Arrays.toString(s.mergeSort(c, 0, c.length-1)));
    }
}






























