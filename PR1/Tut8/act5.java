package Tut8;

public class act5 {
    public static void shiftRight(int []a){
        int t = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--){
            a[i] = a[i-1];
        }
        a[0] = t;
    }

    public static void main(String[] args) {
        int[] a = {2,3,4,5,1};
        shiftRight(a);
        for (int j : a){
            System.out.print(j + " ");
        }
    }
}
