package Tut10;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class act2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("data.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        ArrayList<String> data = new ArrayList<>();
        data.add("How many cities are there in Quang Ninh Province?");
        data.add("There are 4 cities: Cam Pha, Ha Long, Uong Bi, Mong Cai");
        data.add("Thank you!");
        oos.writeObject(data);
        oos.close();
    }
}
