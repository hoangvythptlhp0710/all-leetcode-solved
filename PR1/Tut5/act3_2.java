package Tut5;

public class act3_2 {
    public static boolean isVowel(char c){
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }
    public static void Vowel(String s){
        int count = 0;
        for (int i = 0; i < s.length();i++){
            if (isVowel(s.charAt(i))){
                count++;
            }
        }
    }

    public static int sum(int a, int b){
        return a + b;
    }
    public static void main(String[] args){
        String s = "tham Tu Lung Danh";
        Vowel(s);
    }
}
