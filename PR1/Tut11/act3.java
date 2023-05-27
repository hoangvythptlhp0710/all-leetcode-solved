package Tut11;

import java.util.*;
import java.io.File;
import java.io.IOException;

public class act3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("src/txt/helo1.txt"));
        Set<String> unique = new TreeSet<>();
        int count = 0;
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String b = s.toLowerCase();
            String a = b.replaceAll("[!#$%^&*<>,.():]","");
            String[] words = a.split(" ");
            for (String sa : words) {
                unique.add(sa);
            }
        }
        System.out.print(unique);
        sc.close();
    }
}