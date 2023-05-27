package src.Codeforces;

import java.util.*;

/*
                NUMBER TRANSFORMATION

 You are given two integer x anh y. YOu want to choose two strictly positive (grater than 0)
 integers a and b, and then apply the following operation to x exactly a times: replace x with
 b * x

 You want to find two positive integers a and b such that x becomes equal to y after this process. If there
 are multiple possible pairs, you can choose any of them. If there is no such pair, report it.
 */
public class NumberTransformation {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i = 0; i < test; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count1 = 0, count2 = 0;
            if (a % b != 0 || b % a != 0){
                System.out.println(0 + " " + 0);
            }
            if (a % b == 0){
                int res = a / b;
                if (res % 2 == 0){
                    res /= 2;
                    count1++;
                }
                else{
                    
                }
            }
        }
    }
}
