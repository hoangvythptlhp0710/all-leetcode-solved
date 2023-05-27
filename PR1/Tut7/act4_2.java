package Tut7;

public class act4_2 {
    public static String reverse(String s) {
        if (s.length() < 2 ) {
            return s;
        } else {
            return reverse(s.substring(1)) + s.charAt(0);
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse("helloworld"));
    }
}
