package src.Codeforces;

import java.util.*;

public class WayTooLongWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            String s = sc.next();
            if (s.length() <= 10){
                System.out.println(s);
            }
            else{
                StringBuilder sb = new StringBuilder();
                char x1 = s.charAt(0);
                char x2 = s.charAt(s.length()-1);
                sb.append(x1);
                sb.append(s.length() - 2);
                sb.append(x2);
                System.out.println(sb);
            }
        }
    }

}
