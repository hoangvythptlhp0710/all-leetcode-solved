package Tut9;


import java.io.*;
import java.util.Scanner;

import static java.lang.System.out;


public class act1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter a = new PrintWriter("src/txt/hello.txt");
        a.println("Hello, World!");
        a.close();
        Scanner sc = new Scanner(new File("src/txt/hello.txt"));
        while (sc.hasNextLine()){
            out.println(sc.nextLine());
        }
    }
}
