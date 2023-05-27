package Tut7;

import java.util.Scanner;

public class act4 {
    public static void reverseString(String s) {
        char [] c = s.toCharArray();
        for (int i = c.length - 1; i >= 0; i--){
            System.out.print(c[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        reverseString(s);
    }
}
