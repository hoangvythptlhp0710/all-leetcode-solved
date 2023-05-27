package Tut5;


import java.util.Scanner;

public class act1 {
    public static void toBinary(int n) {
        int [] bin = new int[1001];
        int j = 0;
        if (n == 0) {
            System.out.println("0");
        }
        while (n > 0){
            bin[j++] = n % 2;
            n = n / 2;
        }
        for (int i = j - 1; i >= 0; i--){
            System.out.print(bin[i]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("The binary value: ");
        toBinary(n);

    }
}
