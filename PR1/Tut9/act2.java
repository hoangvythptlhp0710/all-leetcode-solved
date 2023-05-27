package Tut9;

import java.io.*;
import java.util.Scanner;

public class act2 {


    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/txt/input.txt"));
        PrintWriter a = new PrintWriter("src/txt/output.txt");
        while(sc.hasNext()){
            String s = sc.nextLine();
            if (!s.isEmpty()){
                a.println(s);
            }
        }
        a.close();
    }
}
