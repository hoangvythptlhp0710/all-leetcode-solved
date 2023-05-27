package Tut10;


import javax.swing.*;
import java.util.Scanner;



public class act1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n != 5) {
            System.out.println("[1] Add item");
            System.out.println("[2] Item list");
            System.out.println("[3] Edit an item");
            System.out.println("[4] Remove an item");
            System.out.println("[5] Quit");

            System.out.print("Choose an option: ");
            n = sc.nextInt();
            if (n == 1) System.out.println("Adding a item...");
            if (n == 2) System.out.println("Listing all items...");
            if (n == 3) System.out.println("Editing an items...");
            if (n == 4) System.out.println("Removing an item...");
            if (n == 5) System.out.println("Goodbye!");
        }
    }
}
