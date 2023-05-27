package Tut11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EngVieDictionary {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello","xin chào");
        dictionary.put("test", "kiểm tra");
        dictionary.put("car", "ôtô");
        dictionary.put("cucumber", "quả dưa chuột");
        dictionary.put("eggplant","quả cà tím");
        dictionary.put("worker", "công nhân");
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter an English word: ");
            String eng = sc.next();
            if(dictionary.containsKey(eng)){
                System.out.println("Vietnamese meaning: " + dictionary.get(eng));
            }
            else{
                System.out.println("404 not found!!!");
            }
            System.out.println("Do you want to continue? (1: Yes, 2: No) ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice != 1){
                System.out.println("Thank you!");
                break;
            }
        }
    }
}
