package Tut8;

import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        File s = new File("D:\\123\\text.txt");
        boolean a = s.mkdir();
        System.out.println(a);
    }
}
