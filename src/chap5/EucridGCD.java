package chap5;

public class EucridGCD {
    static int gcd(int x, int y){
        if(y == 0) return x;
        else return gcd(y, x % y);
    }
}