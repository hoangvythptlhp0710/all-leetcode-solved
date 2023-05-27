package src;

import java.util.Scanner;

public class _binary_To_Integer {

    public static int bintoint(int binary){
        String bin = String.valueOf(binary);
        int s = Integer.parseInt(bin, 2);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            System.out.println(bintoint(n));
        }
    }
}
