package Hyperskill.FileServer;

import java.util.Scanner;

public class FileServerHyperskill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        switch (value){
            case "add":
                System.out.println("The file " + sc.nextLine() + " was added");
                break;
            case "delete":
                System.out.println("The file " + sc.nextLine() + " was deleted");
                break;
            case "get":
                System.out.println("The file " + sc.nextLine() + " was sent");
                break;
            default:
                System.out.println("Unknown command");
        }
    }

}
