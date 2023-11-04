package chap1;

import java.util.Scanner;

public class Practice_1_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("1からnまでの総和を求めます。");

        do {
            System.out.print("nの値：");
            n = scanner.nextInt();
        } while (n <= 0);

        int sum = 0;
        for (int i = 1; i < n; i++){
            System.out.print(i + "+");
            sum += i;
        }
        System.out.print(n + " = " + (sum += n));
    }
}
