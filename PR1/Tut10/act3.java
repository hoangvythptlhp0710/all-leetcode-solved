package Tut10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class act3 {
    public static void main(String[] args) throws IOException {
        System.out.println("data.bin contains: ");
        try {
            FileInputStream fis = new FileInputStream("data.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<String> arList = (ArrayList<String>) ois.readObject();
            for (String s : arList) {
                System.out.println(s);
            }
            ois.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

