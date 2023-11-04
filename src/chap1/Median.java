package chap1;

import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        int temp = 0;

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a >= b)
            if (b >= c)
                temp = b;
            else if (a <= c)
                temp = a;
            else
                temp = c;
        else if (a > c)
            temp = a;
        else if (b > c)
            temp = c;
        else
            temp = b;

        System.out.println(temp);
    }
}
