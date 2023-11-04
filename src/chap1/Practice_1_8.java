package chap1;

public class Practice_1_8 {
    public static void main(String[] args) {
        System.out.println(sumof(3, 5));
    }

    static int sumof(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }
}
