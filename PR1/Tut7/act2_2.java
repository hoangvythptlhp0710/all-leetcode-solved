package Tut7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class act2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean gotValidNum = false;
        int n = 0;
        while (!gotValidNum) {
            try {
                System.out.println("Enter an integer between 1000 and 999999: ");
                n = sc.nextInt();
                if (n > 999 && n < 1000000) {
                    gotValidNum = true;
                }
            } catch (InputMismatchException e) {
                throw new InputMismatchException();
            }
        }
        String s = Integer.toString(n);
        String left = s.substring(0,s.length() -3);
        String right = s.substring(s.length()-3);
        System.out.println(left + "," + right);
    }
}
