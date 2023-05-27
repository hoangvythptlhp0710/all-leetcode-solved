package Tut8;

import java.io.File;

public class MoveFolderOrFile {
    public static void main(String[] args) {
        File src = new File("E:\\123");
        File dest = new File("E:\\456");
        src.renameTo(dest);
    }
}
