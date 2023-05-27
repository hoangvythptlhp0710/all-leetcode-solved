package Tut5;

import java.util.Scanner;

public class act2 {

    public static float avg(float[] a) {
        float average = 0;
        float sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            average = sum / a.length;
        }
        return average;
    }

    public static float smallest(float[] a) {
        float min = a[0];
        int i = 0;
        while (i < a.length) {
            if (a[i] < min) {
                min = a[i];
            }
            i++;
        }
        return min;
    }

    public static float largest(float[] a) {
        float max = a[0];
        int i = 0;
        while (i < a.length) {
            if (a[i] > max) {
                max = a[i];
            }
            i++;
        }
        return max;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers in the set: ");
        int n = sc.nextInt();
        float[] arr = new float[n];
        System.out.println("Enter " + n + " floating-points numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextFloat();
        }
        System.out.println("The average of values: "+ avg(arr));
        System.out.println("The smallest of values: "+ smallest(arr));
        System.out.println("The largest of values: " + largest(arr));
        System.out.print("The ranges of values: " );
        System.out.printf("%.1f",(largest(arr) - smallest(arr)));
    }
}
