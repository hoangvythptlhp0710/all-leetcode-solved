package Tut9;

import java.io.*;
import java.util.Scanner;

public class act4 {


    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/txt/mary2.txt"));
        PrintWriter a = new PrintWriter("src/txt/mary.txt");
        int count = 0;
        while(sc.hasNext()) {
            String s = sc.nextLine();
            count++;
            if (count >= 0  && count <= 9){
                a.println(s.substring(3, s.length()-1));
            } else if (count >= 10 && count <= 100) {
                a.println(s.substring(4, s.length()-1));
                }
            }
        a.close();
    }
}