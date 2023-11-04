package chap1;

import java.util.Scanner;

public class Practice_1_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        do {
            System.out.println("aより大きい値を入力してください。");
            b = scanner.nextInt();
        } while (b <= a);

        System.out.println("b - a = " + (b - a));
    }
}
