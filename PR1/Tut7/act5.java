package Tut7;

import java.util.Scanner;

public class act5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String s = sc.nextLine();
        int score = 0;
        boolean upper = false, lower = false, digit = false, symbol = false;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' '){
                System.out.println("Password cannot contain space.");
                return;
            }
            if (Character.isUpperCase(s.charAt(i))){
                upper = true;
            }
            else if (Character.isLowerCase(s.charAt(i))){
                lower = true;
            }
            else if (Character.isDigit(s.charAt(i))){
                digit = true;
            }
            else{
                symbol = true;
            }
        }
        if (s.length() > 12){
            score += 2;
        }
        else if (s.length() >= 8){
            score ++;
        }
        if (upper) score++;
        if (lower) score++;
        if (digit) score++;
        if (symbol) score++;
        if (score <= 2) System.out.println("Strength: " + score + " (weak).");
        else if (score <= 4) System.out.println("Strength: " + score + " (medium)");
        else System.out.println("Strenth: " + score + " (strong)");
    }
}
