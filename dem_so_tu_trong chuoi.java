package src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

class dem_so_tu_trong_chuoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (String e : s.split("\\s",0)){
            count++;
        }
        System.out.println(count);
        }
    }

