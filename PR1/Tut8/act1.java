package Tut8;

public class act1 {
    public static int randomInt(){
        return (int) (Math.random() * 999 + 20);
    }
    public static boolean isPrime(int n){
        if (n < 2) return false;
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 100; i++){
            if (isPrime(randomInt())){
                count++;
            }
        }
        System.out.println("The probability of prime number is " + count + "%.");
    }
}
