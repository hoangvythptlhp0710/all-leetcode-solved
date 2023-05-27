package Tut9;

import java.io.*;
import java.util.Scanner;

public class act3 {


    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/txt/mary.txt"));
        PrintWriter a = new PrintWriter("src/txt/mary2.txt");
        int lineNumber = 1;
        while(sc.hasNext()){
            String s = sc.nextLine();
            a.println(lineNumber+". "+s);
            lineNumber++;
            }
        a.close();
    }
}