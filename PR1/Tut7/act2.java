package Tut7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class act2 {
    public static void checkAge(int n){
        if (n < 1000 && n > 999999){
            throw new InputMismatchException("The input is invalid, please try again: ");
        }
        else{
            String s = Integer.toString(n);
            String left = s.substring(0,s.length() -3);
            String right = s.substring(s.length()-3);
            System.out.println(left + "," + right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean gotvalidvalue = false;
        int n = 0;
        while (!gotvalidvalue){
            System.out.print("Please enter an integer between 1000 and 999999: ");
            n = sc.nextInt();
            checkAge(n);
        }

    }
}
