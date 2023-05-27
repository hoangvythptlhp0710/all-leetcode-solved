package src.Codeforces;

import java.util.*;

public class Team {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();int count = 0;
        for (int i = 1; i <= test; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if ((a == 1 && b == 1) || (a == 1 && c == 1) || (b == 1 && c == 1) || (a == 1 && b == 1 && c == 1)){
                count++;
            }
        }
        System.out.println(count);
    }

}
