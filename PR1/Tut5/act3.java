package Tut5;
import java.util.Scanner;

public class act3 {

    // print the uppercase characters
    public static void isUpperCase(String s) {
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                System.out.print(c + " ");

            }
        }
        System.out.println();
    }

    public static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    // print the second letter
    public static void SecondLetter(String s) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isLetter(s.charAt(i))) {
                if (n % 2 == 0) {
                    System.out.print(s.charAt(i));
                }
                n++;
            }
        }
        System.out.println();
    }


    // replace the vowel with underscore, count the vowel and print the position of the vowel

     public static void Vowel(String s) {
         int vowels = 0;
         for (int i = 0; i < s.length(); i++) {
             char c = s.charAt(i);
             if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                     || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                 System.out.print("_");
                 vowels++;
             } else {
                 System.out.print(c);
             }
         }
         System.out.println();
         System.out.println("The number of vowels: " + vowels);
         for (int i = 0; i < s.length(); i++) {
             char c = s.charAt(i);
             if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                     || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                 vowels++;
                 System.out.print(i + "");
                 }
            else{
                 System.out.print(c);
             }
             }
         }

     //

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        isUpperCase(s);
        SecondLetter(s);
        Vowel(s);
    }
}
