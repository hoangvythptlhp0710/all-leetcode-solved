package main;

public class fmm_algo {
    public static long modular_exponentiation(int a, int b, int m){
       int x = 1;
       while (b > 0) {
           if (b % 2 == 1) {
               x = (x * a) % m;
           }
           a = (a * a) % m;
           b >>= 1;
       }
       return x;
    }


    public static void main(String[] args) {
        System.out.println(modular_exponentiation(667,937,2537));
    }
}
