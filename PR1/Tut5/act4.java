package Tut5;

import java.util.Scanner;

public class act4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        // Filled Square
        StringBuilder filledSquare = new StringBuilder(n);
        StringBuilder hollowedSquare= new StringBuilder(n);
        for (int i = 1; i<=n; i++){
            for (int j = 1; j <= n; j++) {
                filledSquare.append("*");
                if (i == 1 | i == n | j == 1 | j == n) {
                    hollowedSquare.append("*");
                } else {
                    hollowedSquare.append(" ");
                }
            }
            System.out.println(filledSquare + " " + hollowedSquare);
            filledSquare.delete(0,filledSquare.length());
            hollowedSquare.delete(0,hollowedSquare.length());
        }
    }
}






