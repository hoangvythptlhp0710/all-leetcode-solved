package src.Codeforces;

import java.util.*;

/*
    Theatre Square in the capital city of Berland has a rectangular shape
    with the size nxm meters. On the occasion of the city's anniversary,
    a decision was taken to pave the Square with square granite flagstones.
    Each flagstone is of the size a × a

    What is the least number of flagstones needed to pave the Square?
    It's allowed to cover the surface larger than the Theatre Square,
    but the Square has to be covered. It's not allowed to break the flagstones.
    The sides of flagstones should be parallel to the sides of the Square.

Input
The input contains three positive integer numbers in the first line: n,m and a (a <= 10^9).
 */
public class TheatreSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt(), m = sc.nextInt(), a = sc.nextInt();
        long first_line_flagstone = (long)Math.ceil(n/a);
        long iterationLength = (long) Math.ceil(m/a);
        long res = first_line_flagstone * iterationLength;
        System.out.println(res);
    }
}
