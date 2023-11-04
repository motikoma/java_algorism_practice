package chap3.Practice;

import java.util.Scanner;

public class Practice_3_2 {

    static int seqSearchEx(int[] a, int n, int key){
        System.out.print("   |");
        for(int k = 0; k < n; k++)
            System.out.printf("%4d", k);
        System.out.println();

        System.out.print("---+");
        for(int k = 0; k < 4 * n + 2; k++)
            System.out.printf("-");
        System.out.println();

        for(int i = 0; i < n; i++) {
            System.out.print("   |");
            System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
            System.out.printf("%3d|", i);
            for (int k = 0; k < n; k++) {
                System.out.printf("%4d", a[k]);
            }
            System.out.println("\n   |");
            if (a[i] == key) return i;
        }
         return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数：");
        int num = stdIn.nextInt();
        int[] x = new int[num];                  // 要素数numの配列

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]：");
            x[i] = stdIn.nextInt();
        }

        System.out.print("探す値：");            // キー値の読込み
        int ky = stdIn.nextInt();

        int idx = seqSearchEx(x, num, ky);      // 配列xから値がkyの要素を探索

        if (idx == -1)
            System.out.println("その値の要素は存在しません。");
        else
            System.out.println("その値は" + "x[" + idx + "]にあります。");
    }
}
