package Tut8;

public class act2 {
    public static int sumWithoutSmallest(int[] a){
        int min = a[0];
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] < min){
                min = a[i];
            }
            sum += a[i];
        }
        return sum - min;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(sumWithoutSmallest(a));
    }
}
