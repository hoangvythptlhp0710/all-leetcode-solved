package Tut6;

public class FactorGenerator {
    int f = 2;
    int n;
    public FactorGenerator(int numberToFactor){
        this.n = numberToFactor;
    }
    public int nextFactor(){
        while (n % f != 0){
            f++;
        }
        n = n / f;
        return f;
    }
    public boolean hasMoreFactor(){
        return (n>1);
    }
}
