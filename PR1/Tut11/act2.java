package Tut11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class act2 {
    public static void main(String[] args) {
        Map<String, Double> scorechecker = new HashMap<>();
        scorechecker.put("Ngoc", 8.5);
        scorechecker.put("Thinh", 9.4);
        scorechecker.put("Hiep", 9.2);
        scorechecker.put("Hung", 7.8);
        scorechecker.put("Bao", 7.4);
        Scanner sc = new Scanner(System.in);
        System.out.print("Name of the student: ");
        String name = sc.nextLine();
        if (scorechecker.containsKey(name)){
            System.out.println("Score: " + scorechecker.get(name));
        }
        else{
            System.out.println("Score not found");
        }
    }
}
